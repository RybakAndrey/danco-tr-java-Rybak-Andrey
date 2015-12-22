package com.andreyrybak.training.storage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.andreyrybak.training.model.Book;

public class BookStorage {
	List<Book> allBooks = new ArrayList<Book>();
	
	public static BookStorage instance;
	
	private BookStorage(){
		
	}
	
	public static BookStorage getInstance(){
		if(instance == null){
			synchronized (BookStorage.class) {
				if(instance == null){
					instance = new BookStorage();
				}
			}
		}
		return instance;
	}
	
	public List<Book> getAllBooks(){
		return allBooks;
	}
	
	public void addBook(Book book){
		allBooks.add(book);
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
	
	public void addBookCountOnStorage(Book b,int count){
		count += b.getCount();
		b.setCount(count);
	}

	public void sortBooks(String sortBy){
		if(sortBy.equals("alphabet") || sortBy.equals("Alphabet")){
			Collections.sort(allBooks, new Comparator<Book>() {
				public int compare(Book b1, Book b2) {
					return b1.getName().compareTo(b2.getName());
				}		
			});
		}else if (sortBy.equals("year") || sortBy.equals("Year")){
			Collections.sort(allBooks, new Comparator<Book>() {
				public int compare(Book b1, Book b2) {
					 return b1.getYearOfPublication() - b2.getYearOfPublication();
				}
			});
		}else if (sortBy.equals("price") || sortBy.equals("Price")){
			Collections.sort(allBooks, new Comparator<Book>() {
				public int compare(Book b1, Book b2) {
					 return (int)b1.getPrice() - (int)b2.getPrice();
				}
			});
		}else if (sortBy.equals("count") || sortBy.equals("Count")){
			Collections.sort(allBooks, new Comparator<Book>() {
				public int compare(Book b1, Book b2) {
					 return b1.getCount() - b2.getCount();
				}
			});
		}
	}
}
