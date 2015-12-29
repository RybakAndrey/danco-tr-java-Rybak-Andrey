package com.andreyrybak.comporator;

import java.util.Comparator;

import com.andreyrybak.training.model.Order;

public class OrderStatusComporator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {

		return o1.getStatus().compareTo(o2.getStatus());
	}

}
