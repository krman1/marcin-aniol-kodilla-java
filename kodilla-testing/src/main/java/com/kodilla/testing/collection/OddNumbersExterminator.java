package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> numbers;
    private int ilosc;
    private ArrayList<Integer> evenNumber = new ArrayList<Integer>();


    public OddNumbersExterminator(ArrayList<Integer> numbers) {

        this.numbers = numbers;
    }

    public void exterminate(ArrayList<Integer> numbers) {


        int listValue = 0;

        for (int n = 0; n < numbers.size(); n++) {
            listValue = numbers.get(n);

            if (listValue % 2 == 0) {
                evenNumber.add(listValue);
            }

        }
    }
    public int ilosc(){
        return evenNumber.size();
    }


}