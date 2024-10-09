package com.ridango.rebus2gtfs.gtfs.enums;

import lombok.Getter;

@Getter
public enum PickupType {
    RegularPickup(0),
    NoPickup(1),
    AgencyArrangedPickup(2),
    DriverAgreedPickup(3);

    private final int value;

    PickupType(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
