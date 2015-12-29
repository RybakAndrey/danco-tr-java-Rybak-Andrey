package com.andreyrybak.training.storage;

import java.util.ArrayList;
import java.util.List;

import com.andreyrybak.training.model.OrderBook;

public class OrderBookStorage {
	
	private final String ORDER_BOOKS_FORMAT = "%a - ,%n,%y: $,$p (,$c)";
	
	private List<OrderBook> allOrderBooks = new ArrayList<OrderBook>();
	
	private static OrderBookStorage instance;
	
	private OrderBookStorage(){
		
	}
	
	public static OrderBookStorage getInstance() {
		if (instance == null) {
			instance = new OrderBookStorage();
		}
		return instance;
	}
	
	
	public List<OrderBook> getAllOrderBooks(){
		return allOrderBooks;
	}
	
	public void addOrderBook(OrderBook book){
		allOrderBooks.add(book);
	}
	public void deleteOrderBook(OrderBook book){
		allOrderBooks.remove(book);
	}
	
	
	public void showAllOrderBooks(){
		for(OrderBook b : allOrderBooks){
			//System.out.println(ORDER_BOOKS_FORMAT,b.getBook());
		}
	}
	
}
