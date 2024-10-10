package com.ridango.rebus2gtfs.util;

import com.ridango.rebus2gtfs.gtfs.enums.RouteType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TransportModeUtil {
    private static final Map<Integer, RouteType> TYPE_MAP = Map.of(
            2, RouteType.Bus,
            9, RouteType.DemandResponsiveBus
    );

    public static RouteType getRouteType(int transportModeType) {
        return Optional.ofNullable(TYPE_MAP.get(transportModeType)).orElseThrow();
    }
}
