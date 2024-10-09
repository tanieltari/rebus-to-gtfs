package com.ridango.rebus2gtfs.gtfs;

import com.ridango.rebus2gtfs.gtfs.enums.RouteType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Route {
    private String routeId;
    private String agencyId;
    private String routeShortName;
    private String routeLongName;
    private RouteType routeType;
}
