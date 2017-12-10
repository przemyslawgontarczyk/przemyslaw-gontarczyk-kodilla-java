package com.kodilla.good.patterns.airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsProcessor {
    AllFlights allFlights;

    public FlightsProcessor(AllFlights allFlights) {
        this.allFlights = allFlights;
    }

    public AllFlights getAllFlights() {
        return allFlights;
    }

    public List<Airport> flghtsFrom(AirportDTO airportDTO) {
        List<Airport> fromAirport;
        fromAirport = allFlights.getFlights().stream()
                .filter(ap -> ap.getHomeAirport().equals(airportDTO.getHomeAirport()))
                .map(ap -> ap.getDepartureAirport())
                .collect(Collectors.toList());
        System.out.println("All flights from: " + airportDTO.getHomeAirport() + " ---> " + fromAirport);
        return new ArrayList<>(fromAirport);
    }

    public List<Airport> flghtsTo(AirportDTO airportDTO) {
        List<Airport> toAirport;
        toAirport = allFlights.getFlights().stream()
                .filter(ap -> ap.getDepartureAirport().equals(airportDTO.getHomeAirport()))
                .map(ap -> ap.getHomeAirport())
                .collect(Collectors.toList());
        System.out.println("All flights to: " + airportDTO.getHomeAirport() + " ---> " + toAirport);
        return new ArrayList<>(toAirport);
    }

    public List<FlightTo> flightsWithChange(AirportDTO airportDTO) {
        List<FlightTo> flights;
        List<FlightTo> withChange = allFlights.getFlights().stream()
                .filter(fl -> fl.getDepartureAirport().equals(airportDTO.getChangeAirport()))
                .collect(Collectors.toList());
        flights = allFlights.getFlights().stream()
                .filter(fl -> fl.getHomeAirport().equals(airportDTO.getChangeAirport()) && fl.getDepartureAirport().equals(airportDTO.getDestinationAirport()))
                .collect(Collectors.toList());
        System.out.println("Found flights : " + withChange + " ,change " + flights);
        return new ArrayList<>(flights);

    }
}

