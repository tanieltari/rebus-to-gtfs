package com.ridango.rebus2gtfs.mapper;

import com.google.common.base.Strings;
import com.ridango.rebus2gtfs.gtfs.Package;
import com.ridango.rebus2gtfs.gtfs.Stop;
import com.ridango.rebus2gtfs.gtfs.StopTime;
import com.ridango.rebus2gtfs.gtfs.Trip;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.util.StopTimeUtil;
import com.ridango.rebus2gtfs.util.IdentifierUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assertions;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StopTimeMapper {
    public static List<StopTime> mapStopTimes(ExportDocType1 rebusData, Package gtfsData) {
        log.info("Mapping stop times...");
        var stopTimes = rebusData.getTimetable()
                .getTimetable()
                .parallelStream()
                .flatMap(tt -> tt.getTrips()
                        .getTrip()
                        .parallelStream()
                        .flatMap(t -> {
                            var tripStartString = Strings.padStart(String.valueOf(t.getAvgtid()), 4, '0');
                            if (tripStartString.length() != 4) {
                                throw new RuntimeException("Invalid first stop departure time");
                            }
                            var hours = Integer.parseInt(tripStartString.substring(0, 2));
                            var minutes = Integer.parseInt(tripStartString.substring(2, 4));
                            var tripStartTime = Duration.ZERO.plusHours(hours).plusMinutes(minutes);
                            return rebusData.getLIN()
                                    .getLINSPEC()
                                    .parallelStream()
                                    .filter(l -> l.getLinje() == tt.getLinje() && l.getVariantnr() == t.getVarianten())
                                    .findFirst()
                                    .orElseThrow()
                                    .getLINSPECSTOP()
                                    .parallelStream()
                                    .map(s -> {
                                        var tripId = IdentifierUtil.getTripId(tt.getLinje(), t.getTurnr());
                                        var stopId = IdentifierUtil.getStopId(s.getHplnr(), s.getLage());
                                        return StopTime.builder()
                                                .tripId(tripId)
                                                .stopId(stopId)
                                                .arrivalTime(tripStartTime.plusSeconds(s.getAnkinttid()))
                                                .departureTime(tripStartTime.plusSeconds(s.getInttid()))
                                                .stopSequence(s.getVsek())
                                                .pickupType(StopTimeUtil.getPickupType(s.getPa()))
                                                .dropOffType(StopTimeUtil.getDropOffType(s.getAv()))
                                                .timepoint(s.getRegler() > 0)
                                                .build();
                                    });
                        })
                )
                .toList();

        // Ensure correctness
        log.info("Checking stop times...");
        var tripIds = gtfsData.getTrips().stream().map(Trip::getTripId).collect(Collectors.toSet());
        var stopIds = gtfsData.getStops().stream().map(Stop::getStopId).collect(Collectors.toSet());
        Assertions.assertThat(stopTimes.stream().map(st -> String.format("%s-%d", st.getTripId(), st.getStopSequence())))
                .as("Duplicate stop time for trip found")
                .doesNotHaveDuplicates();
        Assertions.assertThat(stopTimes).allSatisfy(st -> {
            Assertions.assertThat(tripIds).contains(st.getTripId());
            Assertions.assertThat(stopIds).contains(st.getStopId());
            Assertions.assertThat(st.getArrivalTime()).isLessThan(Duration.ofDays(2));
            Assertions.assertThat(st.getDepartureTime()).isLessThan(Duration.ofDays(2));
        });

        return stopTimes;
    }
}
