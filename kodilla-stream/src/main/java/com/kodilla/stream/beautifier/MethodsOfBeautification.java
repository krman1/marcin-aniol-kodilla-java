package com.kodilla.stream.beautifier;

public class MethodsOfBeautification {

    public static String addA(String text){

        return ("AAAAA  " + text + "  AAAAA");
    }
    public static String increase (String text){
        return text.toUpperCase();
    }
    public static String addPercent (String text){

        return ("%%%%%%%  " + text + "  %%%%%%%%%");
    }
    public static String decrease (String text) {
        return text.toLowerCase();
    }
}
