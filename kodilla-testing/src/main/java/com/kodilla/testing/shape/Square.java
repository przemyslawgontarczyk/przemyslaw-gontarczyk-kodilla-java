package com.kodilla.testing.shape;


import static java.lang.Math.pow;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void getShapeName() {
        System.out.println("SQUARE");
    }

    public void getField() {
        double field = pow(side,side);
        System.out.println("FIELD: " +field);
    }
}
