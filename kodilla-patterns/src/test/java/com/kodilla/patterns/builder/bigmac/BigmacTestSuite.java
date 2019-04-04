package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew () {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sezame")
                .burgers(2)
                .sauce("standard")
                .ingredient("becon")
                .ingredient("onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
