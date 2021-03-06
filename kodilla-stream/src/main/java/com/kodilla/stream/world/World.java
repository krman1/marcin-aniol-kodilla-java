package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


public final class World {

    private final Set<Continent> continents = new HashSet<Continent>();


    public void addContinent(Continent continent) {
        continents.add(continent);
    }
    public boolean removeContinets (Continent continent){
        return continents.remove(continent);
    }

    public Set<Continent> getContinents() {
        return continents;

    }
    public BigDecimal getPeopleQuantity(){

        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
