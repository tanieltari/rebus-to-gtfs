package com.ridango.rebus2gtfs.gtfs;

import lombok.Builder;
import lombok.Getter;

import java.net.URL;
import java.util.TimeZone;


@Getter
@Builder
public class Agency {
    private String agencyId;
    private String agencyName;
    private URL agencyUrl;
    private TimeZone agencyTimezone;
}
