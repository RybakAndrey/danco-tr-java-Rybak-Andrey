package com.rybakandrey.training;

import java.util.ArrayList;
import java.util.List;

public class ListOfOrders implements IOrderController {
	private List<Order> allOrders = new ArrayList<Order>();
	private List<Order> paidOrders = new ArrayList<Order>();
	
	final String STATUS_BOOK_AVAILABLE = "Order accpeted";
	final String STATUS_BOOK_NOT_AVAILABLE = "Request approved";
	
	public List<Order> getAllOrders() {
		return allOrders;
	}
	public void setAllOrders(List<Order> allOrders) {
		this.allOrders = allOrders;
	}
	public List<Order> getPaidOrders() {
		return paidOrders;
	}
	public void setPaidOrders(List<Order> paidOrders) {
		this.paidOrders = paidOrders;
	}

	public void addOrder(Order order) {
		if(order.getStatus().equals(STATUS_BOOK_AVAILABLE)){
			paidOrders.add(order);
		}else if(order.getStatus().equals(STATUS_BOOK_NOT_AVAILABLE)){
			allOrders.add(order);
		}
	}

	public void removeOrder(Order order) {
		paidOrders.remove(order);
		allOrders.remove(order);
	}
}
