package com.ridango.rebus2gtfs.gtfs;

import lombok.Builder;
import lombok.Getter;

import java.util.TimeZone;


@Getter
@Builder
public class Agency {
    private String agencyId;
    private String agencyName;
    private String agencyUrl;
    private TimeZone agencyTimezone;
}
