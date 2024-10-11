package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.Calendar;
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
public class CalendarWriter {
    public static void writeCalendars(ZipOutputStream zos, CsvWriter csvWriter, List<Calendar> calendars) throws IOException {
        log.info("Writing calendars to GTFS...");
        var ze = new ZipEntry("calendar.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "service_id",
                "monday",
                "tuesday",
                "wednesday",
                "thursday",
                "friday",
                "saturday",
                "sunday",
                "start_date",
                "end_date"
        );
        // Write data
        for (var c : calendars) {
            csvWriter.writeRecord(
                    c.getServiceId(),
                    WriterUtil.toCsvString(c.isMonday()),
                    WriterUtil.toCsvString(c.isTuesday()),
                    WriterUtil.toCsvString(c.isWednesday()),
                    WriterUtil.toCsvString(c.isThursday()),
                    WriterUtil.toCsvString(c.isFriday()),
                    WriterUtil.toCsvString(c.isSaturday()),
                    WriterUtil.toCsvString(c.isSunday()),
                    c.getStartDate().toString(),
                    c.getEndDate().toString()
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
