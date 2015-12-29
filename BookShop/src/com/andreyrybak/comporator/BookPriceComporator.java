package com.andreyrybak.comporator;

import java.util.Comparator;

import com.andreyrybak.training.model.Book;

public class BookPriceComporator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		
		 return (int)b1.getPrice() - (int)b2.getPrice();
	}

}
