package com.ridango.rebus2gtfs.gtfs.enums;

import lombok.Getter;

@Getter
public enum ExceptionType {
    ServiceOperating(1),
    ServiceRemoved(2);

    private final int value;

    ExceptionType(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
