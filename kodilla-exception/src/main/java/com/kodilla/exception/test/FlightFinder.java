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


                if (airPortCheck.containsKey(flight.getDepartureAirport())&&airPortCheck.get(flight.getDepartureAirport()))
                   {System.out.println("Departure Airport is available");
                   } else throw new RouteNotFoundException("Wrong departure airport name, or airport is closed");

                if (airPortCheck.get(flight.getArrivalAirport())&&airPortCheck.get(flight.getArrivalAirport()))
                 {System.out.println("Arrival Airport is available");
                 } else throw new RouteNotFoundException("Wrong arrival airport name, or airport is closed");
    }
    public static void main(String args[]) {
        Flight flight1 = new Flight("Porto", "Krakow");

        try {
            FlightFinder test1 = new FlightFinder();
            test1.flightFinder(flight1);
        } catch (RouteNotFoundException e) {
            System.out.print("Problem occurred: " +e.getMessage());
        }


    }
}
