package com.kodilla.good.patterns.food2go;

public class OrderProcessor {
    HomeService homeService;

    public OrderProcessor(HomeService homeService) {
        this.homeService = homeService;
    }

    public OrderCheckForSupplier retrieve() {

        FoodSupplier foodSupplier = new HealthyShop(homeService);
        Order order = new Order("Egg", 24);
        return new OrderCheckForSupplier(order, foodSupplier);
    }

}
