package com.andreyrybak.training.mainstorage;

import com.andreyrybak.training.storage.BookStorage;
import com.andreyrybak.training.storage.OrderBookStorage;
import com.andreyrybak.training.storage.OrderStorage;
import com.andreyrybak.training.storage.UserStorage;

public class BookShop {
	
	private static BookShop instance;
	
	private BookStorage bookStorage;
	private OrderStorage orderStorage;
	private OrderBookStorage orderBookStorage;
	private UserStorage userStorage;
		
	private BookShop(){
		setBookStorage(BookStorage.getInstance());
		setOrderStorage(OrderStorage.getInstance());
		setUserStorage(UserStorage.getInstance());
		setOrderBookStorage(OrderBookStorage.getInstance());
	}
	
	public static BookShop getInstance() {
		if (instance == null) {
			instance = new BookShop();
		}
		return instance;
	}
	

	public BookStorage getBookStorage() {
		return bookStorage;
	}

	public void setBookStorage(BookStorage bookStorage) {
		this.bookStorage = bookStorage;
	}

	public OrderStorage getOrderStorage() {
		return orderStorage;
	}

	public void setOrderStorage(OrderStorage orderStorage) {
		this.orderStorage = orderStorage;
	}

	public OrderBookStorage getOrderBookStorage() {
		return orderBookStorage;
	}

	public void setOrderBookStorage(OrderBookStorage orderBookStorage) {
		this.orderBookStorage = orderBookStorage;
	}

	public UserStorage getUserStorage() {
		return userStorage;
	}

	public void setUserStorage(UserStorage userStorage) {
		this.userStorage = userStorage;
	}
	
	
	
	
}
	

