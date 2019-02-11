package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;

    public void getShapeName() {

        name = "Triangle";
        System.out.println(name);
    }

    public void getField(){

        System.out.println("Pole powierzchni trójkąta wynosi");
    }

    public String getName() {
        return name;
    }
}
