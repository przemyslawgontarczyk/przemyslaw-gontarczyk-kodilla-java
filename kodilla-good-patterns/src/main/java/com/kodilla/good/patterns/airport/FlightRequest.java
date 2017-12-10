package com.kodilla.good.patterns.airport;

public class FlightRequest {

    AirportDTO searchForChange() {
        AirportDTO airportDTO = new AirportDTO(new Airport("Gdansk"), new Airport("Krakow"), new Airport("Wroclaw"));
        return airportDTO;
    }
}

