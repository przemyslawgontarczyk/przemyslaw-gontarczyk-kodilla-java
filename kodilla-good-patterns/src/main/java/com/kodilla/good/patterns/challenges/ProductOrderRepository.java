package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product) {
        System.out.println("Product repository stored on local server " + user.getUserNick() + user.getUserName() + product.getProductName() + product.getProductQuantity());
        return true;
    }
}
