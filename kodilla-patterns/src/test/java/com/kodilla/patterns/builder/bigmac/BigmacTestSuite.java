package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.Bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("jalapenos")
                .ingredient("cheese")
                .ingredient("shrimps")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsAmount = bigmac.getIngredients().size();
        String lookingFor = "onion";

        //Then

        Assert.assertEquals(4, ingredientsAmount);
        Assert.assertTrue(bigmac.getIngredients().contains(lookingFor));
    }
}
