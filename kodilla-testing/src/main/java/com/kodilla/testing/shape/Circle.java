package com.kodilla.testing.shape;

public class Circle implements Shape {

    String name;

    public void getShapeName() {

        name = "Circle";
        System.out.println(name);
    }

    public void getField(){

        System.out.println("Pole powierzchni koła wynosi");
    }

    public String getName() {
        return name;
    }
}
