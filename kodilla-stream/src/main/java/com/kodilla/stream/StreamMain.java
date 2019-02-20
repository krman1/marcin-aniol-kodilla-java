package com.kodilla.stream;

import com.kodilla.stream.beautifier.MethodsOfBeautification;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;


public class StreamMain {

    public static void main(String[] args) {

       /* PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("test", text -> MethodsOfBeautification.addA(text));
        poemBeautifier.beautify("test1", text -> MethodsOfBeautification.increase(text));
        poemBeautifier.beautify("test2", text -> MethodsOfBeautification.addPercent(text));
        poemBeautifier.beautify("TEKST", text -> MethodsOfBeautification.decrease(text));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }*/

       People.getList().stream()
               .map(s -> s.toUpperCase())
               .forEach(System.out::println);

    }
}

