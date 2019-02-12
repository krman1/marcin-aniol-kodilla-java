package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;

    public String getShapeName() {

        name = "Triangle";
        System.out.println(name);
        return name;
    }

    public void getField(){

        System.out.println("Pole powierzchni trójkąta wynosi");
    }

}
