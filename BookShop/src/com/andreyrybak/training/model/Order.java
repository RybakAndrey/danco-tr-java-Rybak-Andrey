package com.andreyrybak.training.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
	
	public static final String STATUS_ORDER_CONFIRMED = "The order confirmed";
	public static final String STATUS_ORDER_IN_STANDBY_MODE = "Order in standby mode";
	
	private User user;
	private List<OrderBook> ordersBooks = new ArrayList<OrderBook>();
	private Date date;
	private String status;
	
	public Order(){
		
	}
	public Order(User user,Date date){
		this.user = user;
		this.date = date;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public void addBook(OrderBook book){
		ordersBooks.add(book);
	}
	
	public void removeBook(Book book){
		ordersBooks.remove(book);
	}
	
	public List<OrderBook> getOrdersBooks() {
		return ordersBooks;
	}
	public void setOrdersBooks(ArrayList<OrderBook> orderBooks) {
		this.ordersBooks = orderBooks;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double totalPrice(){
		double totalPrice = 0;
		for(OrderBook b : ordersBooks){
			totalPrice += b.getBook().getPrice();
		}
		return totalPrice;
	}
	
}
