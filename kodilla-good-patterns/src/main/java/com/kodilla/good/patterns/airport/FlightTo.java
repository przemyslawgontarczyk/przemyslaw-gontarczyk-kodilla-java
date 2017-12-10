package com.kodilla.good.patterns.airport;

public class FlightTo {
    private Airport homeAirport;
    private Airport departureAirport;

    public FlightTo(Airport homeAirport, Airport departureAirport) {
        this.homeAirport = homeAirport;
        this.departureAirport = departureAirport;
    }

    public Airport getHomeAirport() {
        return homeAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightTo flightTo = (FlightTo) o;

        if (homeAirport != null ? !homeAirport.equals(flightTo.homeAirport) : flightTo.homeAirport != null)
            return false;
        return departureAirport != null ? departureAirport.equals(flightTo.departureAirport) : flightTo.departureAirport == null;
    }

    @Override
    public int hashCode() {
        int result = homeAirport != null ? homeAirport.hashCode() : 0;
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "from " + homeAirport +
                " ,to " + departureAirport;
    }
}