package com.ridango.rebus2gtfs.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IdentifierUtil {
    public static String getPatternId(int lineNumber, int variantNumber) {
        return String.format("%d-%d", lineNumber, variantNumber);
    }

    public static String getTripId(int lineNumber, int runNumber) {
        return String.format("%d-%d", lineNumber, runNumber);
    }

    public static String getLinkKey(int fromStopArea, String fromStopPoint, int toStopArea, String toStopPoint) {
        return String.format("%d-%s:%d-%s", fromStopArea, fromStopPoint, toStopArea, toStopPoint);
    }

    public static String getStopId(int stopArea, String stopPoint) {
        return String.format("%d-%s", stopArea, stopPoint);
    }
}
