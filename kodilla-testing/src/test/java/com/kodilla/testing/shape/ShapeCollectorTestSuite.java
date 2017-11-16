package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;
    ShapeCollector shapeCollector;

    @Before

    public void setUp() {

        shapeCollector = new ShapeCollector();
        testCounter++;
        System.out.println("\nPreparing to execute test #" + testCounter);
    }

    @Test

    public void testAddFigure() throws Exception {

        //Given

        Shape shape = new Circle(3);

        //When

        shapeCollector.addFigure(shape);

        //Then

        Assert.assertEquals(1, shapeCollector.shapes.size());

    }

    @Test

    public void testRemoveFigure() throws Exception {

        //Given

        Shape shape = new Circle(4);
        shapeCollector.addFigure(shape);
        Shape shape1 = new Triangle(2, 3);
        shapeCollector.addFigure(shape1);

        //When

        boolean check = shapeCollector.removeFigure(shape);

        //Then
        Assert.assertEquals(true, check);
        Assert.assertEquals(1, shapeCollector.shapes.size());

    }

    @Test

    public void testRemoveFigureNotExisting() throws Exception {

        //Given

        Shape shape = new Square(2);
        Shape circle = new Circle(3.2);

        //When
        shapeCollector.addFigure(shape);
        boolean check = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(check);


    }

    @Test

    public void testGetFigure() throws Exception {

        //Given

        Shape shape = new Square(4);
        Circle shape1 = new Circle(5);

        //When
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);

        //Then
        Assert.assertTrue(shapeCollector.getFigure(1) instanceof Circle);

    }


}
