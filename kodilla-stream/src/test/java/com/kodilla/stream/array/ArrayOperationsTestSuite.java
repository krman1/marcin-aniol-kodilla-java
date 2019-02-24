package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int[] numbers = {2,2,2,6,6,6};

        //When
        double avarage = ArrayOperations.getAverage(numbers);
        System.out.println("Średnia liczb wynosi: "+ avarage );

        //Then
        Assert.assertEquals(4,avarage,0);
    }

}
