package com.andreyrybak.training.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {
	private String name;
	private String author;
	private int yearOfPublication;
	private Date dateOfEntrance;
	private double price;
	private int count;
	private List<OrderBook> ordersBooks = new ArrayList<OrderBook>();

	
	public Book(){
		
	}
	
	public Book(String name, String author, int yearOfPublication, double price, int count){
		this.name = name;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.count = count;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public Date getDateOfEntrance() {
		return dateOfEntrance;
	}
	public void setDateOfEntrance(Date dateOfEntrance) {
		this.dateOfEntrance = dateOfEntrance;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public List<OrderBook> getOrdersBooks() {
		return ordersBooks;
	}

	public void setOrdersBooks(List<OrderBook> ordersBooks) {
		this.ordersBooks = ordersBooks;
	}
	
}
