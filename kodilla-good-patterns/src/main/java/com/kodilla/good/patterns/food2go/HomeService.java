package com.kodilla.good.patterns.food2go;

public class HomeService {

    public boolean order(Order order, FoodSupplier foodSupplier) {
        System.out.println("Ordering: " + order + " from supplier " + foodSupplier + " has been ordered. Wait - confirmation process...");
        return true;
    }
}
