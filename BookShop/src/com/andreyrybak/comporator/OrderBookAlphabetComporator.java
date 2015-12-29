package com.andreyrybak.comporator;

import java.util.Comparator;

import com.andreyrybak.training.model.OrderBook;

public class OrderBookAlphabetComporator implements Comparator<OrderBook> {

	@Override
	public int compare(OrderBook o1, OrderBook o2) {
		
		return o1.getBook().getName().compareTo(o2.getBook().getName());
	}

}
