package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {

    List<Flights> Flights1 = new ArrayList<>();

    public void searchByDepartureAirport(String departCity) {
        System.out.println("Wyszukuje wyloty z " + departCity);
        List<Flights> list = ListOfFlights.getListOfFlights().stream()
                .filter(f -> f.getDepartureCity().equals(departCity))
                .collect(Collectors.toList());
        list.stream()
                .forEach(System.out ::println);
    }


    public void searchByArrivalAirport(String arrivalCity) {
        System.out.println("Wyszukuje przyloty do " + arrivalCity);
        List<Flights> list = ListOfFlights.getListOfFlights().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
        list.stream()
                .forEach(System.out ::println);

    }

    public void findFlightsThrough(String departCity, String arrivalCity) {

        System.out.println("Wyszukuje połaczenie miedzy " + departCity + " a " + arrivalCity);

        List<Flights> list1 = ListOfFlights.getListOfFlights().stream()
                .filter(f -> f.getDepartureCity().equals(departCity))
                .filter(f -> !f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());

        List<Flights> list2 = ListOfFlights.getListOfFlights().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .filter(f -> !f.getDepartureCity().equals(departCity))
                .collect(Collectors.toList());


        for (Flights flight1 : list1) {
            for (Flights flight2 : list2) {
                if (flight1.getArrivalCity().equals(flight2.getDepartureCity())) {
                    Flights1.add(flight1);
                    Flights1.add(flight2);
                }

            }
        }
        if (Flights1.size() != 0) {

            Flights1.stream()
                    .forEach(System.out ::println);
        }
        else  {
            System.out.println("Niestety nie ma takiego połaczenia");
        }
    }
}
