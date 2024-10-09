package com.ridango.rebus2gtfs.gtfs.enums;

import lombok.Getter;

@Getter
public enum RouteType {
    Railway(100),
    Bus(700),
    DemandResponsiveBus(715);

    private final int value;

    RouteType(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
