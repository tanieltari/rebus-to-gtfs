package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.gtfs.CalendarDate;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalendarDateMapper {
    public static List<CalendarDate> mapCalendarDates(ExportDocType1 rebusData) {
        return List.of();
    }
}
