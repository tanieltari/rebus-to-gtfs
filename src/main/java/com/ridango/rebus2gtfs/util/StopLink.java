package com.ridango.rebus2gtfs.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class StopLink {
    private final String linkKey;
    private final List<Coordinate> coordinates;
}
