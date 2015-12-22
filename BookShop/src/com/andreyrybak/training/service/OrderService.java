package com.andreyrybak.training.service;

import com.andreyrybak.training.model.Order;
import com.andreyrybak.training.storage.OrderStorage;

	public class OrderService {

	OrderStorage orderStorage = OrderStorage.getInstance();
	
	public static OrderService instance;
	
	private OrderService(){
		
	}
	
	public static OrderService getInstance(){
		if(instance == null){
			synchronized (OrderService.class) {
				if(instance == null){
					instance = new OrderService();
				}
			}
		}
		return instance;
	}
	
	
	
	public void showAllOrders(){
		orderStorage.showAllOrders();
	}
	public void addOrder(Order order){
		orderStorage.addOrder(order);
	}
	public void deleteOrder(Order order){
		orderStorage.deleteOrder(order);
	}
	public void sortOrders(String sortBy){
		orderStorage.sortOrders(sortBy);
	}
	
}
