package com.rybakandrey.training;

public interface IOrder {
	public void makeOrder(User user, Storage storage);
	public void showDetails();
	public void closeOrder();
	public double calculateTotalPrice();
}
