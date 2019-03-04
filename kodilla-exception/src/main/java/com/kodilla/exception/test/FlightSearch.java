package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean>  AvailableAirport = new HashMap<>();

        AvailableAirport.put("Kraków",true);
        AvailableAirport.put("Warszawa", false);
        AvailableAirport.put("Bydgoszcz", true);
        AvailableAirport.put("London", true);
        AvailableAirport.put("Berlin", false);
        AvailableAirport.put("New York", true);

        if ( AvailableAirport.get(flight.getArrivalAirport()) != null)
             if ( AvailableAirport.get(flight.getArrivalAirport())) {
                 System.out.println("Połaczenie między lotniskiem " + flight.getDepartureAirport() + " a " + flight.getArrivalAirport() + " jest możliwe.");
              } else {
                 System.out.println ("Połaczenie między lotniskiem " + flight.getDepartureAirport() + " a " + flight.getArrivalAirport() + " jest niemożliwe.");
             }
        else {
            throw new RouteNotFoundException("Podane lotnisko jest nieprawidłowe");
    }

    }

        public static void main(String[] args) {

        Flight flight = new Flight("Gdańsk", "Los Angeles");

        FlightSearch flightSearch = new FlightSearch();

        try { flightSearch.findFlight(flight);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Lotnisla o które pytasz nie jest dostepne");
        }

    }
}
