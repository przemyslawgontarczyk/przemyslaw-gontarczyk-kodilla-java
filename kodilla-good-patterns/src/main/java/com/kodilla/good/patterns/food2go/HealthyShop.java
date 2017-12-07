package com.kodilla.good.patterns.food2go;

public class HealthyShop extends FoodSupplier {
    public HealthyShop(HomeService homeService) {
        super(homeService);
    }

    @Override
    public boolean process(final OrderCheckForSupplier orderCheckForSupplier) throws NullPointerException {
        boolean confirmedOrder = homeService.order(orderCheckForSupplier.getOrder(), orderCheckForSupplier.getFoodSupplier());
        if (!confirmedOrder) {
            throw new NullPointerException();
        }
        double noOfBoxes = orderCheckForSupplier.getOrder().getProductQuantity() / 6;
        int minQuantityInBox = 6;
        if (orderCheckForSupplier.getOrder().getProductQuantity() > minQuantityInBox) {
            System.out.println("Your order is confirmed,and it will be packed into " + noOfBoxes + " boxes");
            return true;
        } else {
            System.out.println("Min.quantity is: " + minQuantityInBox + ". Your order is rejected");
            return false;
        }

    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
