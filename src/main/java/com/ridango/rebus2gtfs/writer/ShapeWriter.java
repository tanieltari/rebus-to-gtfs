package com.ridango.rebus2gtfs.writer;

import com.ridango.rebus2gtfs.gtfs.Shape;
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
public class ShapeWriter {
    public static void writeShapes(ZipOutputStream zos, CsvWriter csvWriter, List<Shape> shapes) throws IOException {
        log.info("Writing shapes to GTFS...");
        var ze = new ZipEntry("shapes.txt");
        zos.putNextEntry(ze);
        // Write header
        csvWriter.writeRecord(
                "shape_id",
                "shape_pt_lat",
                "shape_pt_lon",
                "shape_pt_sequence"
        );
        // Write data
        for (var s : shapes) {
            csvWriter.writeRecord(
                    s.getShapeId(),
                    String.valueOf(s.getShapePointLatitude()),
                    String.valueOf(s.getShapePointLongitude()),
                    String.valueOf(s.getShapePointSequence())
            );
        }
        csvWriter.flush();
        zos.closeEntry();
    }
}
