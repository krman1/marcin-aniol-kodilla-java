package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public final class Calculator {

    private final Display display;

    public Calculator(final Display display) {
        this.display = display;
    }

    public void add(double a, double b){
        double val = a + b;
        System.out.println("Metoda dodaje liczby: " + a +" i " + b);
        display.displayValue(val);
    }
    public void sub(double a, double b){
        double val = a - b;
        System.out.println("Metoda odejmuje liczby: " + a +" i " + b);
        display.displayValue(val);
    }
    public void mul(double a, double b){
        double val = a * b;
        System.out.println("Metoda mnoży liczby: " + a +" i " + b);
        display.displayValue(val);
    }
    public void div(double a, double b){
        double val;

        if (b != 0){
            val = a / b;}
        else {
            val = 0;
        }
        System.out.println("Metoda dzieli liczbę: " + a +" przez " + b);
        display.displayValue(val);
    }
}
