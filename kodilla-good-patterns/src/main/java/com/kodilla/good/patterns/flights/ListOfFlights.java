package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class ListOfFlights {

    public final static List<Flights> getListOfFlights() {

            List<Flights> theFlightsList = new ArrayList<>();
            theFlightsList.add(new Flights("Kraków", "Warszawa"));
            theFlightsList.add(new Flights("Kraków", "Londyn"));
            theFlightsList.add(new Flights("Warszawa", "Kraków"));
            theFlightsList.add(new Flights("Warszawa", "Los Angeles"));
            theFlightsList.add(new Flights("Wrocław", "Bydgoszcz"));
            theFlightsList.add(new Flights("Katowice", "Rzeszów"));
            return new ArrayList<>(theFlightsList);
        }
}
