package com.andreyrybak.training.storage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import com.andreyrybak.training.model.Order;
import com.andreyrybak.training.model.OrderBook;

public class OrderStorage {
	ArrayList<Order> allOrders = new ArrayList<Order>(); 
	
	public static OrderStorage instance;
	
	private OrderStorage(){
		
	}
	
	public static OrderStorage getInstance(){
		if(instance == null){
			synchronized (OrderStorage.class) {
				if(instance == null){
					instance = new OrderStorage();
				}
			}
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
				System.out.println(b.getBook().getAuthor() + "-" + b.getBook().getName()+ "," + b.getBook().getYearOfPublication() + ":$" + b.getBook().getPrice());
			}
			System.out.println();
		}
	}
	
	public void sortOrders(String sortBy){
		if(sortBy.equals("date") || sortBy.equals("Date")){
			Collections.sort(allOrders, new Comparator<Order>() {
				public int compare(Order o1, Order o2) {
					DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
					Date dateo1 = null;
					Date dateo2 = null;
					try {
						//dateo1 = df.parse(o1.getDate());
						//dateo2 = df.parse(o2.getDate());
					} catch (Exception e) {
						e.printStackTrace();
					}
					return dateo1.compareTo(dateo2);
				}		
			});
		}else if(sortBy.equals("price") || sortBy.equals("Price")){
			Collections.sort(allOrders, new Comparator<Order>() {
				public int compare(Order o1, Order o2) {
					 return (int)o1.totalPrice() - (int)o2.totalPrice();
				}
			});
		}else if(sortBy.equals("status") || sortBy.equals("Status")){
			Collections.sort(allOrders, new Comparator<Order>() {
				public int compare(Order o1, Order o2) {
					 return o1.getStatus().compareTo(o2.getStatus());
				}
			});
		}
	
	}
}
