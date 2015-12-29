package com.andreyrybak.comporator;

import java.util.Comparator;

import com.andreyrybak.training.model.Order;

public class OrderPriceComporator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {

		return (int)o1.totalPrice() - (int)o2.totalPrice();
	}

}
