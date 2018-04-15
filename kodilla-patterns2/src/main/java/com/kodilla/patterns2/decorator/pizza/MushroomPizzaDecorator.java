package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomPizzaDecorator extends AbstractPizzaDecorator {

    public MushroomPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mushrooms";
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }
}