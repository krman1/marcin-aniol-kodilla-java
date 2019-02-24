package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Polska", new BigDecimal("20000000"));
        Country germany = new Country("Niemcy", new BigDecimal("10000000"));
        Country czech = new Country("Czechy", new BigDecimal("5000000"));

        Country turkey = new Country("Turcja", new BigDecimal("20000000"));
        Country india = new Country("Indie", new BigDecimal("30000000"));
        Country russia = new Country("Rosja", new BigDecimal("40000000"));

        Country egypt = new Country("Egipt", new BigDecimal("20000000"));
        Country tunisia = new Country("Tunezja", new BigDecimal("15000000"));
        Country czad = new Country("Czad", new BigDecimal("20000000"));

        Continent europa = new Continent("Europa");
        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(czech);

        Continent azja = new Continent("Azja");
        azja.addCountry(turkey);
        azja.addCountry(india);
        azja.addCountry(russia);

        Continent afryka = new Continent("Afryka");
        afryka.addCountry(egypt);
        afryka.addCountry(tunisia);
        afryka.addCountry(czad);

        World world = new World();
        world.addContinent(europa);
        world.addContinent(azja);
        world.addContinent(afryka);

        //When

        BigDecimal peopleOnTheWorld = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("180000000"), peopleOnTheWorld);
    }
}


