package com.kodilla.good.patterns.food2go;

public class OrderCheckForSupplier {
    private Order order;
    private FoodSupplier foodSupplier;

    public OrderCheckForSupplier(Order order, FoodSupplier foodSupplier) {
        this.order = order;
        this.foodSupplier = foodSupplier;
    }

    public Order getOrder() {
        return order;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }
}
