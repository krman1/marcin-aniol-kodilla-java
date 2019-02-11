package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> figures = new ArrayList<Shape>();

   public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){

        figures.add(shape);
    }

    public void removeFigure(Shape shape){

        figures.remove(0);

    }

    public Shape getFigure(int n){
        return figures.get(n);

    }
    public void showFigures(){

        shape.getShapeName();

    }
    public int getQuantity(){
        return figures.size();
    }

    public Shape getShape() {
        return shape;
    }
}
