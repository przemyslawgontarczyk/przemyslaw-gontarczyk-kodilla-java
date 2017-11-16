package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        boolean check = false;

        if (shapes.contains(shape)) {
            shapes.remove(shape);
            check = true;
        } else {
            System.out.println("WRONG FIGURE GIVEN -TEST PASSED");
            check = false;
        }
        return check;
    }

    public Shape getFigure(int n) {


        if (n >= 0 && n < shapes.size()) {}
         return   shapes.get(n);



    }

    public void showFigures() {
    }


}
