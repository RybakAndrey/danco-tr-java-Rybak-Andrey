package com.andreyrybak.training.mainstorage;

import com.andreyrybak.training.model.Book;
import com.andreyrybak.training.model.Order;
import com.andreyrybak.training.model.OrderBook;
import com.andreyrybak.training.model.User;

public class Main {

	public static void main(String[] args) {
		
		BookShop bookShop = BookShop.getInstance();
		

		User u1 = new User("Andrey Rybak", "Belarus","+21313212");
		User u2 = new User("Evgeniu Blabla", "Italy","+1111111");
		
		
		
		Book b1 = new Book("Harry Potter","D",1923,300,5);
		Book b2 = new Book("Malen'kiu princ","B",1921,500,3);
		Book b3 = new Book("Vremya jit' i vremya ymirat'","C",1925,100,1);
		Book b4 = new Book("Tri tovariwa","A",1922,200,2);
		
		
		bookShop.getBookStorage().addBook(b1);
		bookShop.getBookStorage().addBook(b2);
		bookShop.getBookStorage().addBook(b3);
		bookShop.getBookStorage().addBook(b4);
		
		Order o1 = new Order();
		o1.setUser(u1);
		Order o2 = new Order();
		o2.setUser(u1);
		Order o3 = new Order();
		o3.setUser(u2);

		
		OrderBook ob1 = new OrderBook(o1,b1,4);
		//b1.addBookInOrderBooksList(ob1);
		o1.addBook(ob1);
		
		OrderBook ob2 = new OrderBook(o1,b1,5);
		OrderBook ob3 = new OrderBook(o1,b3,4);
		//b1.addBookInOrderBooksList(ob2);
		//b3.addBookInOrderBooksList(ob3);
		o2.addBook(ob2);
		o2.addBook(ob3);
		bookShop.getOrderBookStorage().addOrderBook(ob1);
		bookShop.getOrderBookStorage().addOrderBook(ob2);
		bookShop.getOrderBookStorage().addOrderBook(ob3);
		
		//Book b5 = new Book("Harry Potter","D",1923,300,10);
		//bookShop.getBookStorage().addBook(b5);
		//bookShop.getBookStorage().showAllBooks();
		bookShop.getOrderBookStorage().showAllOrderBooks();

	}

}
