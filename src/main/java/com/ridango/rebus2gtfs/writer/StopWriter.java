package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.Stop;
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
public class StopWriter {
    public static void writeStops(ZipOutputStream zos, CsvWriter csvWriter, List<Stop> stops) throws IOException {
        log.info("Writing stops to GTFS...");
        var ze = new ZipEntry("stops.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "stop_id",
                "stop_code",
                "stop_name",
                "stop_lat",
                "stop_lon",
                "location_type",
                "parent_station",
                "platform_code"
        );
        // Write data
        for (var s : stops) {
            csvWriter.writeRecord(
                    s.getStopId(),
                    s.getStopCode(),
                    s.getStopName(),
                    String.valueOf(s.getStopLatitude()),
                    String.valueOf(s.getStopLongitude()),
                    s.getLocationType().toString(),
                    s.getParentStation(),
                    s.getPlatformCode()
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
