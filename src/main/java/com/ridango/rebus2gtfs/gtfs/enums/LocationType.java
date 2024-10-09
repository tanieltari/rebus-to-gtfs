package com.ridango.rebus2gtfs.gtfs.enums;

import lombok.Getter;

@Getter
public enum LocationType {
    Stop(0),
    Station(1),
    EntranceExit(2),
    Generic(3),
    BoardingArea(4);

    private final int value;

    LocationType(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
