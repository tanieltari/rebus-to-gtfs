package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.gtfs.Agency;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.TimeZone;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AgencyMapper {
    // TODO: Should load agency info from configuration file
    public static final String AGENCY_ID = "1";
    public static final String AGENCY_NAME = "Sörmland";
    public static final String AGENCY_URL = "https://www.sormlandbiljett.se/";
    public static final TimeZone AGENCY_TIMEZONE = TimeZone.getTimeZone("Europe/Stockholm");


    public static List<Agency> mapAgencies() {
        log.info("Mapping agencies...");

        var defaultAgency = Agency.builder()
                .agencyId(AGENCY_ID)
                .agencyName(AGENCY_NAME)
                .agencyTimezone(AGENCY_TIMEZONE)
                .agencyUrl(AGENCY_URL)
                .build();

        return List.of(defaultAgency);
    }
}
