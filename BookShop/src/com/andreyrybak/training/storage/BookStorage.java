package com.andreyrybak.training.storage;

import java.util.ArrayList;
import java.util.List;

import com.andreyrybak.training.model.Book;


public class BookStorage {
	List<Book> allBooks = new ArrayList<Book>();
	
	private static BookStorage instance;
	
	private BookStorage(){
		
	}
	
	public static BookStorage getInstance() {
		if (instance == null) {
			instance = new BookStorage();
		}
		return instance;
	}

	
	public List<Book> getAllBooks(){
		return allBooks;
	}
	
	public void addBook(Book book){
		Boolean flag = false;
		for(Book b : allBooks){
			if(b.getName().equals(book.getName()) && b.getAuthor().equals(book.getAuthor())){
				flag = true;
				b.setCount(b.getCount() + book.getCount());
			}
		}
		if(flag == false){
			allBooks.add(book);
		}
	}
	
	public void deleteBook(Book book){
		allBooks.remove(book);
	}
	
	public void showAllBooks(){
		for(Book b : allBooks){
			System.out.println(b.getAuthor() + "-" + b.getName()+ "," + b.getYearOfPublication() + 
								":$" + b.getPrice() + "(" + b.getCount()+")");
		}
	}

}
