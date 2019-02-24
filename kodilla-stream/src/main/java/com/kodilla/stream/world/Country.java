package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String countryName;
    private final BigDecimal PeopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", PeopleQuantity=" + PeopleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) &&
                Objects.equals(PeopleQuantity, country.PeopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, PeopleQuantity);
    }
}
