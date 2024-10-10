package com.ridango.rebus2gtfs.util;

import com.google.common.base.Strings;
import com.ridango.rebus2gtfs.gtfs.enums.DropOffType;
import com.ridango.rebus2gtfs.gtfs.enums.PickupType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.Map;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StopTimeUtil {
    private static final Map<Integer, PickupType> PICKUP_TYPE_MAP = Map.of(
            1, PickupType.RegularPickup,
            0, PickupType.NoPickup
    );

    private static final Map<Integer, DropOffType> DROP_OFF_TYPE_MAP = Map.of(
            1, DropOffType.RegularDropOff,
            0, DropOffType.NoDropOff
    );

    public static PickupType getPickupType(int pa) {
        return Optional.ofNullable(PICKUP_TYPE_MAP.get(pa)).orElseThrow();
    }

    public static DropOffType getDropOffType(int av) {
        return Optional.ofNullable(DROP_OFF_TYPE_MAP.get(av)).orElseThrow();
    }

    public static String getTimeString(Duration duration) {
        var hours = Strings.padStart(String.valueOf(duration.toHours()), 2, '0');
        var minutes = Strings.padStart(String.valueOf(duration.toMinutesPart()), 2, '0');
        var seconds = Strings.padStart(String.valueOf(duration.toSecondsPart()), 2, '0');
        if (hours.length() != 2 || minutes.length() != 2 || seconds.length() != 2) {
            throw new RuntimeException("Invalid duration");
        }
        return String.format("%s:%s:%s", hours, minutes, seconds);
    }
}
