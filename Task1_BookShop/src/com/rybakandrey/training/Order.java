package com.rybakandrey.training;

import java.util.ArrayList;
import java.util.List;

public class Order implements IBookController, IOrder {

	final String STATUS_BOOK_AVAILABLE = "Order accpeted";
	final String STATUS_BOOK_NOT_AVAILABLE = "Request approved";
	
	
	private User user;
	private Storage storage;
	private List<Book> books = new ArrayList<Book>();
	private String date;
	private String status;
	private boolean locked = false;
	
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	public void addBook(Book book) {
		books.add(book);
		for(Book b : storage.getBooks()){
			if(book.equals(b) && locked != true){
				this.status = STATUS_BOOK_AVAILABLE;
			}else{
				this.status = STATUS_BOOK_NOT_AVAILABLE;
			}
		}
	}

	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	
	public void makeOrder(User user , Storage storage) {
		this.user = user;
		this.storage = storage;
		user.addOrder(this);
	}
	
	
	public void showDetails() {
		for(Book b : books){
			System.out.println(b.getAuthor() + " - " + b.getName());
		}
		System.out.println(calculateTotalPrice());
	}

	
	public void closeOrder() {
		
	}


	public double calculateTotalPrice() {
		double totalPrice = 0;
		for(Book b : books){
			totalPrice += b.getPrice();
		}
		return totalPrice;
	}
	
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
}
