package com.ridango.rebus2gtfs.gtfs;

import com.ridango.rebus2gtfs.gtfs.enums.DropOffType;
import com.ridango.rebus2gtfs.gtfs.enums.PickupType;
import lombok.Builder;
import lombok.Getter;

import java.time.Duration;

@Getter
@Builder
public class StopTime {
    private String tripId;
    private String stopId;
    private Duration arrivalTime;
    private Duration departureTime;
    private long stopSequence;
    private PickupType pickupType;
    private DropOffType dropOffType;
    private boolean timepoint;
}
