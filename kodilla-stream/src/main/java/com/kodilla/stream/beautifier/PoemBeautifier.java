package com.kodilla.stream.beautifier;

public class PoemBeautifier {



    public void beautify(String text, PoemDecorator poemDecorator){

        String betterText = poemDecorator.decorate(text);
        System.out.println("Upiększony tekst: " + betterText);
    }

}
