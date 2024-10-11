package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.Route;
import de.siegmar.fastcsv.writer.CsvWriter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RouteWriter {
    public static void writeRoutes(ZipOutputStream zos, CsvWriter csvWriter, List<Route> routes) throws IOException {
        log.info("Writing routes to GTFS...");
        var ze = new ZipEntry("routes.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "route_id",
                "agency_id",
                "route_short_name",
                "route_long_name",
                "route_type"
        );
        // Write data
        for (var r : routes) {
            csvWriter.writeRecord(
                    r.getRouteId(),
                    r.getAgencyId(),
                    r.getRouteShortName(),
                    r.getRouteLongName(),
                    r.getRouteType().toString()
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
