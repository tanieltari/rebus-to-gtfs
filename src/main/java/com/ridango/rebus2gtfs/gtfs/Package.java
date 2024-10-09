package com.ridango.rebus2gtfs.gtfs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Package {
    private List<Agency> agencies;
    private List<Calendar> calendars;
    private List<CalendarDate> calendarDates;
    private List<Route> routes;
    private List<Shape> shapes;
    private List<Stop> stops;
    private List<StopTime> stopTimes;
    private List<Trip> trips;
}
