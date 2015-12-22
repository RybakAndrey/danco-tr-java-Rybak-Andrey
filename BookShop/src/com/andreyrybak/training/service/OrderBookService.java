package com.andreyrybak.training.service;

import java.util.List;

import com.andreyrybak.training.model.OrderBook;
import com.andreyrybak.training.storage.OrderBookStorage;

public class OrderBookService {

	OrderBookStorage orderBookStorage = OrderBookStorage.getInstance();
	
	public static OrderBookService instance;
	
	private OrderBookService(){
		
	}
	
	public static OrderBookService getInstance(){
		if(instance == null){
			synchronized (OrderBookService.class) {
				if(instance == null){
					instance = new OrderBookService();
				}
			}
		}
		return instance;
	}
	
	
	
	
	public List<OrderBook> getAllOrderBooks(){
		return orderBookStorage.getAllOrderBooks();
	}
	
	public void addOrderBook(OrderBook book){
		orderBookStorage.addOrderBook(book);
	}
	public void deleteOrderBook(OrderBook book){
		orderBookStorage.deleteOrderBook(book);
	}
	
	public void showAllOrderBooks(){
		orderBookStorage.showAllOrderBooks();
	}
}
