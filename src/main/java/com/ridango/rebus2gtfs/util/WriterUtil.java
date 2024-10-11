package com.ridango.rebus2gtfs.util;

import com.google.common.base.Strings;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Duration;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WriterUtil {
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
}
