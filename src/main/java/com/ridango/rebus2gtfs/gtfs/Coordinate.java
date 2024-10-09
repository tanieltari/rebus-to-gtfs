package com.ridango.rebus2gtfs.gtfs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Coordinate {
    private final double latitude;
    private final double longitude;
}
