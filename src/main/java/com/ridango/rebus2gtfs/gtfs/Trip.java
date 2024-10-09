package com.ridango.rebus2gtfs.gtfs;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Trip {
    private String tripId;
    private String routeId;
    private String serviceId;
    private String tripHeadsign;
    private boolean directionId;
    private String shapeId;
}
