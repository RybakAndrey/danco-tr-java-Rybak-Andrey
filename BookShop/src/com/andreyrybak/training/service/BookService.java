package com.andreyrybak.training.service;

import java.util.List;

import com.andreyrybak.training.model.Book;
import com.andreyrybak.training.storage.BookStorage;

public class BookService {

	BookStorage bookStorage = BookStorage.getInstance();
	public static BookService instance;
	
	private BookService(){
		
	}
	
	public static BookService getInstance(){
		if(instance == null){
			synchronized (BookService.class) {
				if(instance == null){
					instance = new BookService();
				}
			}
		}
		return instance;
	}
	
	
	
	public void showAllBooks(){
		bookStorage.showAllBooks();
	}
	public List<Book> getAllBooks(){
		return bookStorage.getAllBooks();
	}
	public void addBook(Book book){
		bookStorage.addBook(book);
	}
	public void deleteBook(Book book){
		bookStorage.deleteBook(book);
	}
	public void addBookCountOnStorage(Book book, int count){
		bookStorage.addBookCountOnStorage(book, count);
	}
	public void sortBooks(String sortBy){
		bookStorage.sortBooks(sortBy);
	}
}


