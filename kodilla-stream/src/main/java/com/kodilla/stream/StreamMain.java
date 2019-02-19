package com.kodilla.stream;

import com.kodilla.stream.beautifier.MethodsOfBeautification;
import com.kodilla.stream.beautifier.PoemBeautifier;



public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("test", text -> MethodsOfBeautification.addA(text));
        poemBeautifier.beautify("test1", text -> MethodsOfBeautification.increase(text));
        poemBeautifier.beautify("test2", text -> MethodsOfBeautification.addPercent(text));
        poemBeautifier.beautify("TEKST", text -> MethodsOfBeautification.decrease(text));
    }
}

