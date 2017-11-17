package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getShapeName() {
        System.out.println("CIRCLE");
    }

    public void getField() {
        double field = (2*PI*pow(radius,radius));
        System.out.println("FIELD: " +field);
    }
}
