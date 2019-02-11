package com.kodilla.testing.shape;

public class Square implements Shape {

    String name;

    public void getShapeName() {

        name = "Square";
        System.out.println(name);
    }

    public void getField(){

        System.out.println("Pole powierzchni kwadratu wynosi ");
    }

    public String getName() {
        return name;
    }
}