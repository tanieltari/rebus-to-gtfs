package com.ridango.rebus2gtfs.util;

import com.google.common.base.Strings;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WriterUtil {
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static String toCsvString(Duration duration) {
        var hours = Strings.padStart(String.valueOf(duration.toHours()), 2, '0');
        var minutes = Strings.padStart(String.valueOf(duration.toMinutesPart()), 2, '0');
        var seconds = Strings.padStart(String.valueOf(duration.toSecondsPart()), 2, '0');
        if (hours.length() != 2 || minutes.length() != 2 || seconds.length() != 2) {
            throw new RuntimeException("Invalid duration");
        }
        return String.format("%s:%s:%s", hours, minutes, seconds);
    }

    public static String toCsvString(boolean b) {
        return b ? "1" : "0";
    }

    public static String toCsvString(LocalDate date) {
        return DTF.format(date);
    }
}
