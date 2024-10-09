package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.gtfs.Stop;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class StopMapper {
    public static List<Stop> mapStops(ExportDocType1 rebusData) {
        log.info("Mapping stops...");


        log.info("Mapping stops finished");
        return null;
    }
}
