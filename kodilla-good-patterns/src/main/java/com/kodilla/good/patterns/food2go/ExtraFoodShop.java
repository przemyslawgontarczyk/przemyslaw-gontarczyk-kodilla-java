package com.kodilla.good.patterns.food2go;

public class ExtraFoodShop extends FoodSupplier {

    public ExtraFoodShop(HomeService homeService) {
        super(homeService);
    }

    @Override
    public boolean process(final OrderCheckForSupplier orderCheckForSupplier) throws NullPointerException {
        boolean confirmedOrder = homeService.order(orderCheckForSupplier.getOrder(), orderCheckForSupplier.getFoodSupplier());
        if (!confirmedOrder) {
            throw new NullPointerException();
        }
        int maxQuantity = 20;
        int minQuantity = 5;
        if (orderCheckForSupplier.getOrder().getProductQuantity() < maxQuantity && orderCheckForSupplier.getOrder().getProductQuantity() > minQuantity) {
            System.out.println("Your order is confirmed");
            return true;
        } else {
            System.out.println("Min.quantity is: " + minQuantity + " and max is: " + maxQuantity + " . Your order is rejected");
            return false;
        }

    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
