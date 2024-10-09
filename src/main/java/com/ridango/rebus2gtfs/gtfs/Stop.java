package com.ridango.rebus2gtfs.gtfs;

import com.ridango.rebus2gtfs.gtfs.enums.LocationType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Stop {
    private String stopId;
    private String stopCode;
    private String stopName;
    private double stopLatitude;
    private double stopLongitude;
    private LocationType locationType;
    private String parentStation;
    private String platformCode;
}
