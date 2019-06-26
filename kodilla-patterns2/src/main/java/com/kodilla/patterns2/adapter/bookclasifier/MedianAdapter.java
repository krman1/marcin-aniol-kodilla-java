package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Bookb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
	
	@Override
	public int publicationYearMedian(Set<Book> books) {
		
		Map<BookSignature,Bookb> booksMap = new HashMap<>();
		
		Iterator<Book> bookIterator = books.iterator();
		
		while (bookIterator.hasNext()) {
			
			Book actBook = bookIterator.next();
			
			BookSignature bookSignature = new BookSignature(actBook.getSignature());
			Bookb bookb = new Bookb(
					actBook.getAuthor(),
					actBook.getTitle(),
					actBook.getPublicationYear()
			);
			
			booksMap.put(bookSignature,bookb);
		}
		
		return medianPublicationYear(booksMap);
	}
}
