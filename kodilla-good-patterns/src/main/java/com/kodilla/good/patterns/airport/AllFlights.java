package com.kodilla.good.patterns.airport;

import java.util.HashMap;
import java.util.Map;

public class AllFlights {
    public HashMap<FlightTo, String> getFlights() {
        Map<FlightTo, String> allFlightsData = new HashMap<>();
        allFlightsData.put(new FlightTo(new Airport("Gdansk"), new Airport("Wroclaw")), "11:32");
        allFlightsData.put(new FlightTo(new Airport("Gdansk"), new Airport("Wroclaw")), "19:32");
        allFlightsData.put(new FlightTo(new Airport("Gdansk"), new Airport("Krakow")), "13:22");
        allFlightsData.put(new FlightTo(new Airport("Krakow"), new Airport("Wroclaw")), "19:32");
        allFlightsData.put(new FlightTo(new Airport("Wroclaw"), new Airport("Gdansk")), "21:12");
        allFlightsData.put(new FlightTo(new Airport("Wroclaw"), new Airport("Wroclaw")), "14:32");
        allFlightsData.put(new FlightTo(new Airport("Wroclaw"), new Airport("Gdansk")), "10:12");
        return new HashMap<>(allFlightsData);
    }
}

