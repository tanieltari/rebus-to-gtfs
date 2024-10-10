package com.ridango.rebus2gtfs.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Coordinate {
    private final double latitude;
    private final double longitude;
}
