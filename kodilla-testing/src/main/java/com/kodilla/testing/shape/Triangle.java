package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void getShapeName() {
        System.out.println("TRIANGLE");
    }

    public void getField() {
        double field = ((0.5*side)* height);
        System.out.println("FIELD: " +field);
    }
}
