package com.kodilla.stream.array;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {


    static double getAverage(int[] numbers) {

System.out.println("Liczby dla których będzie obliczana średnia:");

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        return IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

    }
}
