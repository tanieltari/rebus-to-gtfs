package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.Agency;
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
public class AgencyWriter {
    public static void writeAgencies(ZipOutputStream zos, CsvWriter csvWriter, List<Agency> agencies) throws IOException {
        log.info("Writing agencies to GTFS...");
        var ze = new ZipEntry("agency.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "agency_id",
                "agency_name",
                "agency_url",
                "agency_timezone"
        );
        // Write data
        for (var a : agencies) {
            csvWriter.writeRecord(
                    a.getAgencyId(),
                    a.getAgencyName(),
                    a.getAgencyUrl(),
                    a.getAgencyTimezone().getID()
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
