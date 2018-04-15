package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {

    @Test
    public void testBasicPizzaGetPrice() {
        // Given
        Pizza pizza = new MargharitaPizza();
        // When
        BigDecimal calculatedPrice = pizza.getPrice();
        // Then
        assertEquals(new BigDecimal(10), calculatedPrice);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        // Given
        Pizza pizza = new MargharitaPizza();
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaWithHamGetPrice() {
        // Given
        Pizza pizza = new MargharitaPizza();
        pizza = new HamPizzaDecorator(pizza);
        // When
        BigDecimal calculatedPrice = pizza.getPrice();
        // Then
        assertEquals(new BigDecimal(14), calculatedPrice);
    }

    @Test
    public void testPizzaWithHamGetDescription() {
        // Given
        Pizza pizza = new MargharitaPizza();
        pizza = new HamPizzaDecorator(pizza);
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Tomato sauce and cheese + ham", description);
    }

    @Test
    public void testPizzaWithHamAndSalamiGetPrice() {
        // Given
        Pizza pizza = new MargharitaPizza();
        pizza = new HamPizzaDecorator(pizza);
        pizza = new SalamiPizzaDecorator(pizza);
        // When
        BigDecimal calculatedPrice = pizza.getPrice();
        // Then
        assertEquals(new BigDecimal(17), calculatedPrice);
    }

    @Test
    public void testPizzaWithHamAndSalamiGetDescription() {
        // Given
        Pizza pizza = new MargharitaPizza();
        pizza = new HamPizzaDecorator(pizza);
        pizza = new SalamiPizzaDecorator(pizza);
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Tomato sauce and cheese + ham + salami slices", description);
    }

    @Test
    public void testPizzaWithHamAndSalamiAndGarlicGetPrice() {
        // Given
        Pizza pizza = new MargharitaPizza();
        pizza = new HamPizzaDecorator(pizza);
        pizza = new SalamiPizzaDecorator(pizza);
        pizza = new MushroomPizzaDecorator(pizza);
        // When
        BigDecimal calculatedPrice = pizza.getPrice();
        // Then
        assertEquals(new BigDecimal(21), calculatedPrice);
    }

    @Test
    public void testPizzaWithHamAndSalamiAndGarlicGetDescription() {
        // Given
        Pizza pizza = new MargharitaPizza();
        pizza = new HamPizzaDecorator(pizza);
        pizza = new SalamiPizzaDecorator(pizza);
        pizza = new MushroomPizzaDecorator(pizza);
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Tomato sauce and cheese + ham + salami slices + mushrooms", description);
    }
}