package com.andreyrybak.training.model;

public class OrderBook {
	private Order order;
	private Book book;
	private int count;
	
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
}
