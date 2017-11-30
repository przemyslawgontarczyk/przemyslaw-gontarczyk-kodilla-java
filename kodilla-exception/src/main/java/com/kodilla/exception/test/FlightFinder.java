package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


    public void flightFinder(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airPortCheck = new HashMap<>();
        airPortCheck.put("London", true);
        airPortCheck.put("Warsaw", true);
        airPortCheck.put("Berlin", false);
        airPortCheck.put("Katowice", true);
        airPortCheck.put("Moscow", true);
        airPortCheck.put("Porto", true);
        airPortCheck.put("Krakow", true);
        airPortCheck.put("Paris", true);
        System.out.println(flight.arrivalAirport +flight.getDepartureAirport());
        for (Map.Entry<String, Boolean> entry : airPortCheck.entrySet()) {
            if (entry.getKey().contains(flight.getDepartureAirport())&&entry.getValue()==Boolean.TRUE) {
                System.out.println("Found flight possibility for searched criteria");
            } throw new RouteNotFoundException("");

        }

    }


    public static void main(String args[]) {
        Flight flight1 = new Flight("London", "Warsaw");

        try {
            FlightFinder test1 = new FlightFinder();
            test1.flightFinder(flight1);
        } catch (RouteNotFoundException e) {
            System.out.print("Can't find route");
        }


    }
}
