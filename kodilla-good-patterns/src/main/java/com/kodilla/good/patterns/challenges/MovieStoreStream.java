package com.kodilla.good.patterns.challenges;


import java.util.stream.*;

public class MovieStoreStream {


    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String filmsList = movieStore.getMovies().entrySet().stream()
                .flatMap(films -> films.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(filmsList);
    }
}