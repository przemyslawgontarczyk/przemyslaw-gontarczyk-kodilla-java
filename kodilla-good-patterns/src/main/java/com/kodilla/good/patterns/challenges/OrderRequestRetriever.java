package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrive(){
        User user = new User("JohnyBravo","John Bravo");
        Product product = new Product("Hamster",2);
        return new OrderRequest(user,product);
    }
}
