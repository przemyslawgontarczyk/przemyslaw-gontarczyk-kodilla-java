package com.kodilla.good.patterns.airport;

public class AirportDTO {
    Airport homeAirport;
    Airport changeAirport;
    Airport destinationAirport;

    public AirportDTO(Airport homeAirport, Airport changeAirport, Airport destinationAirport) {
        this.homeAirport = homeAirport;
        this.changeAirport = changeAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airport getHomeAirport() {
        return homeAirport;
    }

    public Airport getChangeAirport() {
        return changeAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public String toString() {
        return homeAirport + ", changeAirport=" + changeAirport + " , destinationAirport=" + destinationAirport;
    }
}
