package com.ridango.rebus2gtfs.mapper;

import com.google.common.collect.Streams;
import com.ridango.rebus2gtfs.gtfs.Coordinate;
import com.ridango.rebus2gtfs.gtfs.Shape;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.util.CoordinateUtil;
import lombok.extern.log4j.Log4j2;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Log4j2
public class ShapeMapper {
    public static List<Shape> mapShapes(ExportDocType1 rebusData) {
        // Find WGS-84 coordinate system number
        var coordinateSystemNumber = CoordinateUtil.findCoordinateSystemNumber(rebusData);

        // Construct all possible stop links
        var stopLinks = rebusData.getLNK()
                .getLINKSPEC()
                .stream()
                .map(lnk -> {
                    var linkKey = String.format("%d-%s:%d-%s", lnk.getFhplnr(), lnk.getFdesignation(), lnk.getThplnr(), lnk.getTdesignation());
                    var gisLink = lnk.getGisLinks()
                            .getGislink()
                            .stream()
                            .filter(gl -> gl.getCSystem() == coordinateSystemNumber)
                            .findFirst();
                    var linkCoordinates = gisLink.map(gl -> gl.getNd()
                                    .stream()
                                    .map(lc -> new Coordinate(lc.getN(), lc.getE()))
                                    .toList())
                            .orElse(List.of());
                    return Map.entry(linkKey, linkCoordinates);
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            log.info("Duplicate stop link");
                            return a;
                        }
                ));

        // Find each line variant full path by concatenating links
        return rebusData.getLIN()
                .getLINSPEC()
                .stream()
                .flatMap(line -> {
                    // Find line variant stop link successive pairs
                    var lineStopLinks = new LinkedList<String>();
                    line.getLINSPECSTOP()
                            .stream()
                            .reduce((a, b) -> {
                                lineStopLinks.add(String.format("%d-%s:%d-%s", a.getHplnr(), a.getLage(), b.getHplnr(), b.getLage()));
                                return b;
                            })
                            .orElseThrow();

                    // Map shapes
                    var shapes = lineStopLinks.stream()
                            .flatMap(ll -> stopLinks.get(ll).stream());
                    return Streams.mapWithIndex(shapes, (c, i) -> Shape.builder()
                            .shapeId(String.format("%d%d", line.getLinje(), line.getVariantnr()))
                            .shapePointLatitude(c.getLatitude())
                            .shapePointLongitude(c.getLongitude())
                            .shapePointSequence(i + 1)
                            .build());
                })
                .toList();
    }
}
