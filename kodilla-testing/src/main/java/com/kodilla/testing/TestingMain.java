package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int firstNumber = 4;
        int secoundNumber = 2;
        int add = firstNumber + secoundNumber;
        int subtract = firstNumber - secoundNumber;

        int results = calculator.add(4, 2);

        if (add == results) {
            System.out.println("Test dodawania - OK");
        } else {
            System.out.println("Error!");
        }

        results = calculator.subtract(4, 2);

        if (subtract == results) {
            System.out.println("Test odejmowania - OK");
        } else {
            System.out.println("Error!");

        }
    }
}