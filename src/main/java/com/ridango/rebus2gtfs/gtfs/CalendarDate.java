package com.ridango.rebus2gtfs.gtfs;

import com.ridango.rebus2gtfs.gtfs.enums.ExceptionType;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class CalendarDate {
    private String serviceId;
    private LocalDate date;
    private ExceptionType exceptionType;
}
