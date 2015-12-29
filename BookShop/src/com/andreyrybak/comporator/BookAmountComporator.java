package com.andreyrybak.comporator;

import java.util.Comparator;

import com.andreyrybak.training.model.Book;

public class BookAmountComporator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {

		return b1.getCount() - b2.getCount();
	}

}
