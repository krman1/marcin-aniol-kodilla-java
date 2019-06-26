package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
	
	@Test
	public void publicationYearMedianTest() {
		
		//Given
		Set<Book> books = new HashSet<>();
		
		Book book1 = new Book("Henryk Sienkiewicz","title1",2015,"sig1");
		Book book2 = new Book("Eliza Orzeszkowa","title2",2016,"sig2");
		Book book3 = new Book("Adam Mickiewicz","title3",2017,"sig3");
		Book book4 = new Book("Jan Kochanowski","title4",2018,"sig4");
		Book book5 = new Book("Wisława Szymborska","title5",2019,"sig5");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		//When
		
		MedianAdapter medianAdapter = new MedianAdapter();
		int median = medianAdapter.publicationYearMedian(books);
		
		//Then
		assertEquals(2017,median);
	}
}
