package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.StopTime;
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
public class StopTimeWriter {
    public static void writeStopTimes(ZipOutputStream zos, CsvWriter csvWriter, List<StopTime> stopTimes) throws IOException {
        log.info("Writing stop times to GTFS...");
        var ze = new ZipEntry("stop_times.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "trip_id",
                "stop_id",
                "arrival_time",
                "departure_time",
                "stop_sequence",
                "pickup_type",
                "drop_off_type",
                "timepoint"
        );
        // Write data
        for (var s : stopTimes) {
            csvWriter.writeRecord(
                    s.getTripId(),
                    s.getStopId(),
                    WriterUtil.toCsvString(s.getArrivalTime()),
                    WriterUtil.toCsvString(s.getDepartureTime()),
                    String.valueOf(s.getStopSequence()),
                    s.getPickupType().toString(),
                    s.getDropOffType().toString(),
                    WriterUtil.toCsvString(s.isTimepoint())
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
