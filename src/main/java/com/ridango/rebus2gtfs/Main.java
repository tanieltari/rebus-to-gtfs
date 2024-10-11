package com.ridango.rebus2gtfs;

import com.ridango.rebus2gtfs.gtfs.Package;
import com.ridango.rebus2gtfs.mapper.*;
import com.ridango.rebus2gtfs.rebus.*;
import com.ridango.rebus2gtfs.writer.*;
import de.siegmar.fastcsv.writer.CsvWriter;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

@Log4j2
public class Main {
    public static void main(String[] args) {
        // Check if REBUS file argument exists
        if (args.length != 1) {
            throw new RuntimeException("Usage: java -jar rebus2gtfs.jar <rebusFileName>");
        }

        // Setup XML unmarshaller
        Unmarshaller unmarshaller;
        try {
            var context = JAXBContext.newInstance(
                    Timetables.class,
                    LINTYP.class,
                    COORDTYP2.class,
                    Almas.class,
                    LINKTYP.class,
                    STOPTYP.class
            );
            unmarshaller = context.createUnmarshaller();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        // REBUS data object
        var rebusData = new ExportDocType1();

        // Read REBUS ZIP file contents
        try (var file = new ZipFile(new File(args[0]))) {
            log.info("Loading REBUS file...");
            rebusData.setTimetable(findFileAndUnmarshal(file, unmarshaller, Timetables.class, "timetables.xml"));
            rebusData.setLIN(findFileAndUnmarshal(file, unmarshaller, LINTYP.class, "lin.xml"));
            rebusData.setCOORD(findFileAndUnmarshal(file, unmarshaller, COORDTYP2.class, "coord.xml"));
            rebusData.setALMA(findFileAndUnmarshal(file, unmarshaller, Almas.class, "alma.xml"));
            rebusData.setLNK(findFileAndUnmarshal(file, unmarshaller, LINKTYP.class, "link.xml"));
            rebusData.setSTOP(findFileAndUnmarshal(file, unmarshaller, STOPTYP.class, "stop.xml"));
            log.info("REBUS file loaded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // GTFS data object
        var gtfsData = new Package();

        // Map to GTFS data
        gtfsData.setCalendars(CalendarMapper.mapCalendar(rebusData));
        gtfsData.setCalendarDates(CalendarDateMapper.mapCalendarDates(rebusData));
        gtfsData.setStops(StopMapper.mapStops(rebusData));
        gtfsData.setShapes(ShapeMapper.mapShapes(rebusData));
        gtfsData.setAgencies(AgencyMapper.mapAgencies());
        gtfsData.setRoutes(RouteMapper.mapRoutes(rebusData));
        gtfsData.setTrips(TripMapper.mapTrips(rebusData, gtfsData));
        gtfsData.setStopTimes(StopTimeMapper.mapStopTimes(rebusData, gtfsData));

        // Write GTFS data to CSV files
        try (var fos = new FileOutputStream("gtfs.zip")) {
            try (var zos = new ZipOutputStream(fos)) {
                try (var w = new OutputStreamWriter(zos)) {
                    try (var csvWriter = CsvWriter.builder().build(w)) {
                        AgencyWriter.writeAgencies(zos, csvWriter, gtfsData.getAgencies());
                        CalendarDateWriter.writeCalendarDates(zos, csvWriter, gtfsData.getCalendarDates());
                        CalendarWriter.writeCalendars(zos, csvWriter, gtfsData.getCalendars());
                        RouteWriter.writeRoutes(zos, csvWriter, gtfsData.getRoutes());
                        ShapeWriter.writeShapes(zos, csvWriter, gtfsData.getShapes());
                        StopTimeWriter.writeStopTimes(zos, csvWriter, gtfsData.getStopTimes());
                        StopWriter.writeStops(zos, csvWriter, gtfsData.getStops());
                        TripWriter.writeTrips(zos, csvWriter, gtfsData.getTrips());
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        log.info("GTFS created, have a nice day!");
    }

    private static <T> T findFileAndUnmarshal(ZipFile file, Unmarshaller unmarshaller, Class<T> type, String xmlFile) {
        return file.stream()
                .filter(f -> f.getName().toLowerCase().endsWith(xmlFile))
                .map(f -> {
                    log.debug("Mapping {} from {}", type.getName(), f.getName());
                    try (var is = file.getInputStream(f)) {
                        return type.cast(unmarshaller.unmarshal(is));
                    } catch (IOException | JAXBException e) {
                        throw new RuntimeException(e);
                    }
                })
                .findFirst()
                .orElseThrow();
    }
}