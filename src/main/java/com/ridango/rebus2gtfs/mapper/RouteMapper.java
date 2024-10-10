package com.ridango.rebus2gtfs.mapper;

import com.ridango.rebus2gtfs.gtfs.Route;
import com.ridango.rebus2gtfs.rebus.ExportDocType1;
import com.ridango.rebus2gtfs.util.TransportModeUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RouteMapper {
    public static List<Route> mapRoutes(ExportDocType1 rebusData) {
        log.info("Mapping routes...");
        Set<Integer> routeKeySet = ConcurrentHashMap.newKeySet();
        var routes = rebusData.getTimetable()
                .getTimetable()
                .parallelStream()
                .filter(t -> routeKeySet.add(t.getLinje()))
                .map(t -> {
                    var lineNumber = String.valueOf(t.getLinje());
                    return Route.builder()
                            .routeId(lineNumber)
                            .agencyId(AgencyMapper.AGENCY_ID)
                            .routeShortName(!t.getAlias().isEmpty() ? t.getAlias() : lineNumber)
                            .routeLongName(t.getLinjerubrik())
                            .routeType(TransportModeUtil.getRouteType(t.getTransportModeType()))
                            .build();
                })
                .toList();

        // Ensure correctness
        log.info("Checking routes...");
        Set<String> routeSet = ConcurrentHashMap.newKeySet();
        routes.forEach(r -> {
            Assertions.assertThat(routeSet.add(r.getRouteId())).isTrue();
            Assertions.assertThat(r.getRouteShortName()).isNotEmpty();
            Assertions.assertThat(r.getRouteLongName()).isNotEmpty();
        });

        return routes;
    }
}
