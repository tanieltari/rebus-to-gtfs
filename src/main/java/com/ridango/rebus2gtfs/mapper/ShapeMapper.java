package com.ridango.rebus2gtfs.mapper;

import com.google.common.collect.Streams;
import com.ridango.rebus2gtfs.dto.Coordinate;
import com.ridango.rebus2gtfs.gtfs.Shape;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.util.CoordinateUtil;
import com.ridango.rebus2gtfs.util.IdentifierUtil;
import com.ridango.rebus2gtfs.dto.StopLink;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import one.util.streamex.StreamEx;
import org.assertj.core.api.Assertions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShapeMapper {
    public static List<Shape> mapShapes(ExportDocType1 rebusData) {
        log.info("Mapping shapes...");
        // Find WGS-84 coordinate system number
        var coordinateSystemNumber = CoordinateUtil.findCoordinateSystemNumber(rebusData);

        // Construct all possible stop links
        var stopLinks = new ConcurrentHashMap<String, List<Coordinate>>();
        rebusData.getLNK()
                .getLINKSPEC()
                .parallelStream()
                .map(lnk -> {
                    var linkKey = IdentifierUtil.getLinkKey(lnk.getFhplnr(), lnk.getFdesignation(), lnk.getThplnr(), lnk.getTdesignation());
                    var gisLink = lnk.getGisLinks()
                            .getGislink()
                            .stream()
                            .filter(gl -> gl.getCSystem() == coordinateSystemNumber)
                            .findFirst();
                    var linkCoordinates = gisLink.map(gl -> gl.getNd()
                            .stream()
                            .map(lc -> new Coordinate(lc.getN(), lc.getE()))
                            .toList());
                    if (linkCoordinates.isEmpty()) {
                        log.warn("No link coordinates found for {}", linkKey);
                    }
                    return new StopLink(linkKey, linkCoordinates.orElse(List.of()));
                })
                .forEach(link -> stopLinks.compute(link.getLinkKey(), (k, v) -> {
                    if (Objects.isNull(v)) {
                        return link.getCoordinates();
                    }
                    log.warn("Duplicate stop link found for {}", link.getLinkKey());
                    return v.size() < link.getCoordinates().size() ? link.getCoordinates() : v;
                }));

        // Find each line variant full path by concatenating links
        List<Shape> shapes = rebusData.getLIN()
                .getLINSPEC()
                .parallelStream()
                .flatMap(line -> {
                    // Find line variant stop link successive pairs
                    var lineStopLinks = StreamEx.of(line.getLINSPECSTOP())
                            .pairMap((a, b) -> IdentifierUtil.getLinkKey(a.getHplnr(), a.getLage(), b.getHplnr(), b.getLage()));

                    // Flatten line stop links to 1 list
                    var shapeCoordinates = lineStopLinks
                            .flatMap(ll -> stopLinks.get(ll).stream());

                    // Map shapes
                    return Streams.mapWithIndex(shapeCoordinates, (c, i) -> Shape.builder()
                            .shapeId(IdentifierUtil.getPatternId(line.getLinje(), line.getVariantnr()))
                            .shapePointLatitude(c.getLatitude())
                            .shapePointLongitude(c.getLongitude())
                            .shapePointSequence(i + 1)
                            .build());
                })
                .toList();

        // Ensure correctness
        log.info("Checking shapes...");
        Assertions.assertThat(shapes.stream().map(s -> String.format("%s:%d", s.getShapeId(), s.getShapePointSequence()))).doesNotHaveDuplicates();
        Assertions.assertThat(shapes).allSatisfy(s -> {
            Assertions.assertThat(s.getShapePointSequence()).isGreaterThan(0L);
            Assertions.assertThat(s.getShapePointLatitude()).isBetween(-90.0, 90.0);
            Assertions.assertThat(s.getShapePointLongitude()).isBetween(-180.0, 180.0);
        });
        return shapes;
    }
}
