package com.kodilla.testing.shape;

public class Square implements Shape {

    String name;

    public String getShapeName() {

        name = "Square";
        System.out.println(name);
        return name;
    }

    public void getField(){

        System.out.println("Pole powierzchni kwadratu wynosi ");
    }

}