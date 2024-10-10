package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.gtfs.*;
import com.ridango.rebus2gtfs.gtfs.Package;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.rebus.LINSPECTYP;
import com.ridango.rebus2gtfs.util.IdentifierUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TripMapper {
    public static List<Trip> mapTrips(ExportDocType1 rebusData, Package gtfsData) {
        log.info("Mapping trips...");

        // Find all available shapes
        var shapeIds = gtfsData.getShapes().stream().map(Shape::getShapeId).collect(Collectors.toSet());

        // Find directions for route variants
        var routeDirections = rebusData.getLIN()
                .getLINSPEC()
                .parallelStream()
                .collect(Collectors.toMap(
                        l -> IdentifierUtil.getPatternId(l.getLinje(), l.getVariantnr()),
                        LINSPECTYP::getKvar
                ));

        // Map trips
        var trips = rebusData.getTimetable()
                .getTimetable()
                .parallelStream()
                .flatMap(tt -> tt.getTrips()
                        .getTrip()
                        .parallelStream()
                        .map(t -> {
                            var shapeId = IdentifierUtil.getPatternId(tt.getLinje(), t.getVarianten());
                            var tripId = IdentifierUtil.getTripId(tt.getLinje(), t.getTurnr());
                            return Trip.builder()
                                    .tripId(tripId)
                                    .routeId(String.valueOf(tt.getLinje()))
                                    .serviceId(String.valueOf(t.getDagtyp()))
                                    .tripHeadsign(t.getDestTxt())
                                    .directionId(routeDirections.get(shapeId) > 0)
                                    .shapeId(shapeIds.contains(shapeId) ? shapeId : null)
                                    .build();
                        }))
                .toList();

        // Ensure correctness
        log.info("Checking trips...");
        var routeIds = gtfsData.getRoutes().stream().map(Route::getRouteId).collect(Collectors.toSet());
        var calendarIds = gtfsData.getCalendars().stream().map(Calendar::getServiceId).collect(Collectors.toSet());
        Assertions.assertThat(trips.stream().map(Trip::getTripId))
                .as("Duplicate trip ID found")
                .doesNotHaveDuplicates();
        Assertions.assertThat(trips).allSatisfy(t -> {
            Assertions.assertThat(t.getTripHeadsign())
                    .as("Trip headsign is empty for %s", t.getTripId())
                    .isNotEmpty();
            Assertions.assertThat(routeIds)
                    .as("Trip %s route %s does not exist", t.getTripId(), t.getRouteId())
                    .contains(t.getRouteId());
            Assertions.assertThat(calendarIds)
                    .as("Trip %s calendar %s does not exist", t.getTripId(), t.getServiceId())
                    .contains(t.getServiceId());
        });
        Assertions.assertThat(trips.stream().filter(t -> Objects.nonNull(t.getShapeId())))
                .allSatisfy(t -> Assertions.assertThat(shapeIds)
                        .as("Trip %s shape %s does not exist", t.getTripId(), t.getShapeId())
                        .contains(t.getShapeId()));

        return trips;
    }
}
