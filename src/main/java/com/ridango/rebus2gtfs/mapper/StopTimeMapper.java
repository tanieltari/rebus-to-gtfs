package com.ridango.rebus2gtfs.mapper;

import com.google.common.base.Strings;
import com.ridango.rebus2gtfs.gtfs.Package;
import com.ridango.rebus2gtfs.gtfs.StopTime;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.util.EmbarkUtil;
import com.ridango.rebus2gtfs.util.IdentifierUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.time.Duration;
import java.util.List;

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
                                                .pickupType(EmbarkUtil.getPickupType(s.getPa()))
                                                .dropOffType(EmbarkUtil.getDropOffType(s.getAv()))
                                                .timepoint(s.getRegler() > 0)
                                                .build();
                                    });
                        })
                )
                .toList();

        // Ensure correctness
        log.info("Checking stop times...");


        return stopTimes;
    }
}
