package com.ridango.rebus2gtfs.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Getter
@RequiredArgsConstructor
public class SpecialDate {
    private final LocalDate date;
    private final DayOfWeek actsAsDay;
}
