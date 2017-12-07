package com.kodilla.good.patterns.food2go;

public class HomeApplication {

    public static void main(String args[]) {
        HomeService homeService = new HomeService();
        OrderProcessor orderProcessor = new OrderProcessor(homeService);
        OrderCheckForSupplier orderCheckForSupplier = orderProcessor.retrieve();
        FoodSupplier foodSupplier = orderCheckForSupplier.getFoodSupplier();
        foodSupplier.process(orderCheckForSupplier);

    }
}
