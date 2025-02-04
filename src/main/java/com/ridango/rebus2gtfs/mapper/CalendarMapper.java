package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.gtfs.Calendar;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.rebus.TRIPTYP;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assertions;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalendarMapper {
    public static List<Calendar> mapCalendar(ExportDocType1 rebusData) {
        log.info("Mapping calendars...");
        // Find REBUS package start date
        var startDate = rebusData.getALMA()
                .getAlmadag()
                .stream()
                .map(a -> a.getDatum().toGregorianCalendar().toZonedDateTime().toLocalDate())
                .min(LocalDate::compareTo)
                .orElseThrow();

        // Find REBUS package end date
        var endDate = rebusData.getALMA()
                .getAlmadag()
                .stream()
                .map(a -> a.getDatum().toGregorianCalendar().toZonedDateTime().toLocalDate())
                .max(LocalDate::compareTo)
                .orElseThrow();

        // Find unique service day types used by trips
        var dayTypes = rebusData.getTimetable()
                .getTimetable()
                .parallelStream()
                .flatMap(t -> t.getTrips().getTrip().stream())
                .map(TRIPTYP.Trip::getDagtyp)
                .distinct();

        // Map calendars
        var calendars = dayTypes
                .map(dt -> Calendar.builder()
                        .serviceId(dt.toString())
                        .startDate(startDate)
                        .endDate(endDate)
                        .monday((dt & 1) > 0)
                        .tuesday((dt & 2) > 0)
                        .wednesday((dt & 4) > 0)
                        .thursday((dt & 8) > 0)
                        .friday((dt & 16) > 0)
                        .saturday((dt & 32) > 0)
                        .sunday((dt & 64) > 0)
                        .build())
                .toList();

        // Ensure correctness
        log.info("Checking calendars...");
        Assertions.assertThat(calendars.stream().map(Calendar::getServiceId)).doesNotHaveDuplicates();
        Assertions.assertThat(calendars).allSatisfy(c -> {
            Assertions.assertThat(c.getStartDate()).isBefore(c.getEndDate());
            Assertions.assertThat(Integer.valueOf(c.getServiceId())).isBetween(0, 127);
        });
        return calendars;
    }
}
