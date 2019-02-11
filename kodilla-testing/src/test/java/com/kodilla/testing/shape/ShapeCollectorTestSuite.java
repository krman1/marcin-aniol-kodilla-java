package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Before
    public void before() {
        System.out.println("Tozpoczynam test");
    }

    @After
    public void after() {
        System.out.println("Test zakończony");
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle();
        ShapeCollector colector = new ShapeCollector(shape);
        //When
        colector.addFigure(shape);
        //Then
        Assert.assertEquals(1, colector.getQuantity());
    }
    @Test
    public void testRemoveFigure() {
        Shape shape = new Circle();
        ShapeCollector colector = new ShapeCollector(shape);
        colector.addFigure(shape);
        //When
        colector.removeFigure(shape);
        //Then
        Assert.assertEquals(0, colector.getQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle();
        ShapeCollector colector = new ShapeCollector(circle);
        colector.addFigure(circle);
        Shape square = new Square();
        colector.addFigure(square);
        Shape triangle = new Triangle();
        colector.addFigure(triangle);
        //When
        Shape testShape = colector.getFigure(1);
        //Then
        Assert.assertEquals(square,testShape);
    }

    @Test
    public void testshowFigures() {
        //Given
        Shape shape = new Triangle();
        ShapeCollector colector = new ShapeCollector(shape);
        //When
        colector.showFigures();
        //Then
        Assert.assertEquals("Triangle", (((Triangle) shape).getName()));
    }

}
