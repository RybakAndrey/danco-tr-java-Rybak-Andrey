package com.rybakandrey.training;

import java.util.Calendar;

public class Book {
	private String author;
	private String name;
	private int yearOfPublication;
	private String dateOfEntrance;
	private double price;
	
	public Book(String author, String name, int year, String date, double price){
		this.author = author;
		this.name = name;
		this.yearOfPublication = year;
		this.dateOfEntrance = date;
		this.price = price;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDateOfEntrance() {
		return dateOfEntrance;
	}
	public void setDateOfEntrance(String dateOfEntrance) {
		this.dateOfEntrance = dateOfEntrance;
	}

}
