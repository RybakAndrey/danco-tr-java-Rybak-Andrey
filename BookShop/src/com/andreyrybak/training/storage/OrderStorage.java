package com.andreyrybak.training.storage;

import java.util.ArrayList;

import com.andreyrybak.training.model.Order;
import com.andreyrybak.training.model.OrderBook;

public class OrderStorage {
	ArrayList<Order> allOrders = new ArrayList<Order>(); 
	
	private static OrderStorage instance;
	
	private OrderStorage(){
		
	}
	
	public static OrderStorage getInstance() {
		if (instance == null) {
			instance = new OrderStorage();
		}
		return instance;
	}
	
	public void addOrder(Order order){
		allOrders.add(order);
	}
	public void deleteOrder(Order order){
		allOrders.remove(order);
	}
	
	public void showAllOrders(){
		for(Order o : allOrders){
			System.out.println(o.getUser().getName() + " - " + o.getUser().getAddress() + "," + o.getUser().getPhoneNumber() + ":");
			for(OrderBook b : o.getOrdersBooks()){
				System.out.println(b.getBook().getAuthor() + "-" + b.getBook().getName()+ "," + b.getBook().getYearOfPublication() 
									+ ":$" + b.getBook().getPrice() + "(" + b.getCount() + ")");
			}
			System.out.println();
		}
	}
	
}
