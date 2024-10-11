package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.CalendarDate;
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
public class CalendarDateWriter {
    public static void writeCalendarDates(ZipOutputStream zos, CsvWriter csvWriter, List<CalendarDate> calendarDates) throws IOException {
        log.info("Writing calendar dates to GTFS...");
        var ze = new ZipEntry("calendar_dates.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "service_id",
                "date",
                "exception_type"
        );
        // Write data
        for (var c : calendarDates) {
            csvWriter.writeRecord(
                    c.getServiceId(),
                    c.getDate().toString(),
                    c.getExceptionType().toString()
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
