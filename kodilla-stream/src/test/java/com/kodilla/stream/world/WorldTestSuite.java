package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testPeopleQuantity(){

        //Given
        World earth =new World();
        Continent europe = new Continent();
        Continent southAmerica = new Continent();
        earth.addContinent(europe);
        earth.addContinent(southAmerica);
        Country poland = new Country(new BigDecimal("37950000"));
        Country germany = new Country(new BigDecimal("82670000"));
        Country spain = new Country(new BigDecimal("46560000"));
        Country chile = new Country(new BigDecimal("17910000"));
        Country brasil = new Country(new BigDecimal("207700000"));
        Country argentina = new Country(new BigDecimal("43850000"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(brasil);
        southAmerica.addCountry(argentina);

        //When

        //Then
        BigDecimal popleOnEarth = new BigDecimal("436640000");
        Assert.assertEquals(popleOnEarth,earth.getPeopleQuantity());


    }
}
