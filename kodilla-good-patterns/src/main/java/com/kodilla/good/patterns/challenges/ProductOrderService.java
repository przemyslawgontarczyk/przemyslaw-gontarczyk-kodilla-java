package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final Product product) {

        System.out.println("Ordering for : " + user.getUserName() + " ,Logged as: " + user.getUserNick() + " ,Products & Quantity: " + product.getProductName() + " " + product.getProductQuantity());

        return true;
    }
}


