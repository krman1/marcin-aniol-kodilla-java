package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {

    SearchEngine searchEngine = new SearchEngine();

    searchEngine.searchByDepartureAirport("Warszawa");

    searchEngine.searchByArrivalAirport("Kraków");

    searchEngine.findFlightsThrough("Kraków", "Los Angeles");

    }
}
