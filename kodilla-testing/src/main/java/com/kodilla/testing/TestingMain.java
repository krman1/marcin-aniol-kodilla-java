package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int results = calculator.add(4, 2);

        if (results == 6) {
            System.out.println("Test dodawania - OK");
        } else {
            System.out.println("Error!");
        }

        results = calculator.subtract(4, 2);

        if (results == 2) {
            System.out.println("Test odejmowania - OK");
        } else {
            System.out.println("Error!");

        }
    }
}