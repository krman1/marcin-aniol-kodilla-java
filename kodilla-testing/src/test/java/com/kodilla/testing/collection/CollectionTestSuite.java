package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Tozpoczynam test");
    }

    @After
    public void after() {
        System.out.println("Test zakończony");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Rozpoczynam testowanie");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Testowanie zakończone");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator test = new OddNumbersExterminator(numbers);
        //When
        System.out.println("Testowanie pustej tabeli");
        test.exterminate(numbers);
        //Then
        Assert.assertEquals(0, test.getQuantity());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator test = new OddNumbersExterminator(numbers);
        numbers.add(2);
        numbers.add(1);
        numbers.add(8);
        numbers.add(4);
        //When
        System.out.println("Testowanie selekcji liczb parzystych");
        test.exterminate(numbers);
        //Then
        Assert.assertEquals(3, test.getQuantity());
    }
}



