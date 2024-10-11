package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.Trip;
import com.ridango.rebus2gtfs.util.WriterUtil;
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
public class TripWriter {
    public static void writeTrips(ZipOutputStream zos, CsvWriter csvWriter, List<Trip> trips) throws IOException {
        log.info("Writing trips to GTFS...");
        var ze = new ZipEntry("trips.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "trip_id",
                "route_id",
                "service_id",
                "trip_headsign",
                "direction_id",
                "shape_id"
        );
        // Write data
        for (var t : trips) {
            csvWriter.writeRecord(
                    t.getTripId(),
                    t.getRouteId(),
                    t.getServiceId(),
                    t.getTripHeadsign(),
                    WriterUtil.toCsvString(t.isDirectionId()),
                    t.getShapeId()
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
