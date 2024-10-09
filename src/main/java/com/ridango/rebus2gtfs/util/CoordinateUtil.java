package com.ridango.rebus2gtfs.util;

import com.ridango.rebus2gtfs.rebus.COORDSPECTYP2;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;

public class CoordinateUtil {
    private static final String COORDINATE_SYSTEM = "WGS 84";

    public static int findCoordinateSystemNumber(ExportDocType1 rebusData) {
        return rebusData.getCOORD()
                .getCOORD()
                .stream()
                .filter(c -> COORDINATE_SYSTEM.equals(c.getCoordinateSystemName()))
                .findFirst()
                .map(COORDSPECTYP2::getCoordinateSystemNumber)
                .orElseThrow();
    }
}
