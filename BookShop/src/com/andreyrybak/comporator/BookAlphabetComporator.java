package com.andreyrybak.comporator;

import java.util.Comparator;

import com.andreyrybak.training.model.Book;

public class BookAlphabetComporator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		
		return b1.getName().compareTo(b2.getName());
	}

}
