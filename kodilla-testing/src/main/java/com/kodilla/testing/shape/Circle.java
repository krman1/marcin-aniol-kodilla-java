package com.kodilla.testing.shape;

public class Circle implements Shape {

    String name;

    public String getShapeName() {

        name = "Circle";
        System.out.println(name);
        return name;
    }

    public void getField(){

        System.out.println("Pole powierzchni koła wynosi");
    }

}
