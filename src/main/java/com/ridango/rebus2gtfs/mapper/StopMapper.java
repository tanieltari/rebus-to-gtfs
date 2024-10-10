package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.gtfs.Stop;
import com.ridango.rebus2gtfs.gtfs.enums.LocationType;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.util.CoordinateUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assertions;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StopMapper {
    public static List<Stop> mapStops(ExportDocType1 rebusData) {
        log.info("Mapping stops...");
        // Find WGS-84 coordinate system number
        var coordinateSystemNumber = CoordinateUtil.findCoordinateSystemNumber(rebusData);

        // Map stations
        var stations = rebusData.getSTOP()
                .getSTOPAREALST()
                .stream()
                .map(sa -> {
                    var coordinates = sa.getCoordAvg()
                            .getCOORD()
                            .stream()
                            .filter(c -> coordinateSystemNumber == c.getCoordinateSystemNumber())
                            .findFirst()
                            .orElseThrow();
                    return Stop.builder()
                            .stopId(String.valueOf(sa.getHplnr()))
                            .stopCode(sa.getHplnamk())
                            .stopName(sa.getHplnam())
                            .stopLatitude(coordinates.getNorthing())
                            .stopLongitude(coordinates.getEasting())
                            .locationType(LocationType.Station)
                            .build();
                });

        // Map stops
        var stops = rebusData.getSTOP()
                .getSTOPAREALST()
                .stream()
                .flatMap(sa -> sa.getSTOPPOINTLST()
                        .stream()
                        .map(sp -> {
                            var coordinates = sp.getCoord()
                                    .getCOORD()
                                    .stream()
                                    .filter(c -> coordinateSystemNumber == c.getCoordinateSystemNumber())
                                    .findFirst()
                                    .orElseThrow();
                            return Stop.builder()
                                    .stopId(String.format("%d-%s", sa.getHplnr(), sp.getDesignation()))
                                    .stopCode(sa.getHplnamk())
                                    .stopName(sa.getHplnam())
                                    .stopLatitude(coordinates.getNorthing())
                                    .stopLongitude(coordinates.getEasting())
                                    .locationType(LocationType.Stop)
                                    .parentStation(String.valueOf(sa.getHplnr()))
                                    .platformCode(sp.getDesignation())
                                    .build();
                        }));

        // Concatenate stops and stations
        var resultSet = Stream.concat(stations, stops).toList();

        // Ensure correctness
        log.info("Checking stops...");
        var stopSet = new HashSet<String>();
        var stopIds = resultSet.stream().map(Stop::getStopId).toList();
        resultSet.forEach(s -> {
            Assertions.assertThat(stopSet.add(s.getStopId())).isTrue();
            Assertions.assertThat(s.getStopLatitude()).isBetween(-90.0, 90.0);
            Assertions.assertThat(s.getStopLongitude()).isBetween(-180.0, 180.0);
            if (s.getLocationType() == LocationType.Stop) {
                Assertions.assertThat(stopIds).contains(s.getParentStation());
                Assertions.assertThat(s.getPlatformCode()).isNotNull();
            }
        });

        return resultSet;
    }
}
