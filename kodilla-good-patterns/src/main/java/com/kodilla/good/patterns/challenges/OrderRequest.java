package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    public User user;
    public Product product;

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public OrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;

    }
}
