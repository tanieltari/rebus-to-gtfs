package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.dto.SpecialDate;
import com.ridango.rebus2gtfs.gtfs.CalendarDate;
import com.ridango.rebus2gtfs.gtfs.Package;
import com.ridango.rebus2gtfs.gtfs.enums.ExceptionType;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.time.DayOfWeek;
import java.util.List;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalendarDateMapper {
    public static List<CalendarDate> mapCalendarDates(ExportDocType1 rebusData, Package gtfsData) {
        log.info("Mapping calendar dates...");

        // Find special dates that have different day type than in calendar
        var specialDates = rebusData.getALMA()
                .getAlmadag()
                .stream()
                .filter(a -> {
                    var dayOfWeek = a.getDatum()
                            .toGregorianCalendar()
                            .toZonedDateTime()
                            .toLocalDate()
                            .getDayOfWeek()
                            .getValue();
                    return a.getDagtyp() != dayOfWeek;
                })
                .map(a -> {
                    var specialDate = a.getDatum().toGregorianCalendar().toZonedDateTime().toLocalDate();
                    var actsAsDay = DayOfWeek.of(a.getDagtyp());
                    return new SpecialDate(specialDate, actsAsDay);
                });

        // Map calendar dates
        return specialDates.flatMap(sd -> gtfsData.getCalendars().stream().map(c -> {
                    var dt = Integer.parseInt(c.getServiceId());
                    var bitMask = 1 << sd.getActsAsDay().ordinal();
                    var type = (dt & bitMask) > 0 ? ExceptionType.ServiceOperating : ExceptionType.ServiceRemoved;
                    return CalendarDate.builder()
                            .date(sd.getDate())
                            .serviceId(c.getServiceId())
                            .exceptionType(type)
                            .build();
                }))
                .toList();
    }
}
