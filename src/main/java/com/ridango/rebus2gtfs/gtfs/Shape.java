package com.ridango.rebus2gtfs.gtfs;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Shape {
    private String shapeId;
    private double shapePointLatitude;
    private double shapePointLongitude;
    private long shapePointSequence;
}
