package com.andreyrybak.training.model;

public class OrderBook {
	private Order order;
	private Book book;
	private int count;
	private String status;
	
	public static final String STATUS_BOOK_CONFIRMED = "The book confirmed";
	public static final String STATUS_BOOK_IN_STANDBY_MODE = "Book in standby mode";
	
	public OrderBook(Order order, Book book, int count){
		this.order = order;
		this.book = book;
		this.count = count;
	}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
