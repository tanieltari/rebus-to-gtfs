package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.Agency;
import de.siegmar.fastcsv.writer.CsvWriter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AgencyWriter {
    public static void writeAgencies(ZipOutputStream zout, List<Agency> agencies) throws IOException {
        var ze = new ZipEntry("agency.txt");
        zout.putNextEntry(ze);
        try (var w = new OutputStreamWriter(zout)) {
            try (var csvWriter = CsvWriter.builder().build(w)) {
                // Write header
                csvWriter.writeRecord();
                // Write agencies
            }
        }
        zout.closeEntry();
    }
}
