package com.kodilla.good.patterns.food2go;

public class FoodSupplier {

    public HomeService homeService;

    public FoodSupplier(HomeService homeService) {
        this.homeService = homeService;
    }

    boolean process(OrderCheckForSupplier orderCheckForSupplier) throws NullPointerException {
        return true;
    }

}
