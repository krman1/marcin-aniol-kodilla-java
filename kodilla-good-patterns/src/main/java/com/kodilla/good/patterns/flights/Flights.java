package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flights {

    public String departureCity;
    public String arrivalCity;

    public Flights(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;

    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flight = (Flights) o;
        return Objects.equals(departureCity, flight.departureCity) &&
                Objects.equals(arrivalCity, flight.arrivalCity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureCity, arrivalCity);
    }

}
