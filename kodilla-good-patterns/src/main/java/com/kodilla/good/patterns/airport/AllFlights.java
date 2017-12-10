package com.kodilla.good.patterns.airport;

import java.util.ArrayList;
import java.util.List;

public class AllFlights {
    public List<FlightTo> getFlights() {
        List<FlightTo> allFlightsData = new ArrayList<>();
        allFlightsData.add(new FlightTo(new Airport("Gdansk"), new Airport("Wroclaw")));
        allFlightsData.add(new FlightTo(new Airport("Gdansk"), new Airport("Wroclaw")));
        allFlightsData.add(new FlightTo(new Airport("Gdansk"), new Airport("Krakow")));
        allFlightsData.add(new FlightTo(new Airport("Krakow"), new Airport("Wroclaw")));
        allFlightsData.add(new FlightTo(new Airport("Wroclaw"), new Airport("Gdansk")));
        allFlightsData.add(new FlightTo(new Airport("Wroclaw"), new Airport("Wroclaw")));
        allFlightsData.add(new FlightTo(new Airport("New York"), new Airport("Gdansk")));
        return new ArrayList<>(allFlightsData);
    }
}

