package com.ridango.rebus2gtfs.gtfs.enums;

import lombok.Getter;

@Getter
public enum DropOffType {
    RegularDropOff(0),
    NoDropOff(1),
    AgencyArrangedDropOff(2),
    DriverAgreedDropOff(3);

    private final int value;

    DropOffType(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
