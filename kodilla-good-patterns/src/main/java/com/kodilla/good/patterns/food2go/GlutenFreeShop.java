package com.kodilla.good.patterns.food2go;

public class GlutenFreeShop extends FoodSupplier {
    public GlutenFreeShop(HomeService homeService) {
        super(homeService);
    }

    @Override
    public boolean process(final OrderCheckForSupplier orderCheckForSupplier) throws NullPointerException {
        boolean confirmedOrder = homeService.order(orderCheckForSupplier.getOrder(), orderCheckForSupplier.getFoodSupplier());
        if (!confirmedOrder) {
            throw new NullPointerException();
        }
        int maxQuantity = 10;
        if (orderCheckForSupplier.getOrder().getProductQuantity() < maxQuantity && orderCheckForSupplier.getOrder().getProductQuantity() > 0) {
            System.out.println("Your order is confirmed");
            return true;
        } else {
            System.out.println("Min.quantity is: " + "1" + " and max is: " + maxQuantity + " . Your order is rejected");
            return false;
        }

    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
