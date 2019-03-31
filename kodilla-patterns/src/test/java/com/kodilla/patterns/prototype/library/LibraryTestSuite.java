package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Phoebe Pearson", "Slaves of dreams",
                LocalDate.of(2012,05,12));
        Book book2 = new Book("Morgan Walsh", "Obliteration of heaven",
                LocalDate.of (2001,05,13));
        Book book3 = new Book("Aimee Murphy", "Rejecting the night",
                LocalDate.of(2015,04,15));
        Book book4 = new Book("Ryan Talley", "Gangsters and kings",
                LocalDate.of(2007,05,22));
        Book book5 = new Book("Madelynn Carson", "Unity without duty",
                LocalDate.of(2007,11,01));
        Book book6 = new Book("Giancarlo Guerrero", "Enemies of eternity",
                LocalDate.of(2009,04,17));
        Book book7 = new Book("Dylan Murphy", "Wolf of the mountain",
                LocalDate.of(2010,11,24));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepclonedLibrary = null;
        try {
            deepclonedLibrary = library.deepCopy();
            deepclonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book4);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepclonedLibrary);
        Assert.assertEquals(6,library.getBooks().size());
        Assert.assertEquals(6, clonedLibrary.getBooks().size());
        Assert.assertEquals(7, deepclonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepclonedLibrary.getBooks(), library.getBooks());
    }
}
