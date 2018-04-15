package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MargharitaPizza implements Pizza {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(10);
    }

    @Override
    public String getDescription() {
        return "Tomato sauce and cheese";
    }
}