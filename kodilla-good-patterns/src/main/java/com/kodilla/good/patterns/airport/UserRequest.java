package com.kodilla.good.patterns.airport;

public class UserRequest {

    public static void main(String args[]) {

        FlightRequest flightRequest = new FlightRequest();
        AllFlights allFlights = new AllFlights();
        FlightsProcessor flightsProcessor = new FlightsProcessor(allFlights);
        flightsProcessor.flghtsTo(flightRequest.searchForChange());
        flightsProcessor.flghtsFrom(flightRequest.searchForChange());
        flightsProcessor.flightsWithChange(flightRequest.searchForChange());

    }
}
