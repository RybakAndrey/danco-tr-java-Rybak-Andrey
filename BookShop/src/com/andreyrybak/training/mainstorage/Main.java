package com.andreyrybak.training.mainstorage;

import com.andreyrybak.training.model.Book;
import com.andreyrybak.training.model.Order;
import com.andreyrybak.training.model.User;

public class Main {

	public static void main(String[] args) {
		
		BookShop bookShop = BookShop.getInstance();
		

		User u1 = new User("Andrey Rybak", "Belarus","+21313212");
		User u2 = new User("Evgeniu Blabla", "Italy","+1111111");
		bookShop.addUser(u1);
		bookShop.addUser(u2);
		
		Book b1 = new Book("Harry Potter","D",1923,300,5);
		Book b2 = new Book("Malen'kiu princ","B",1921,500,3);
		Book b3 = new Book("Vremya jit' i vremya ymirat'","C",1925,100,1);
		Book b4 = new Book("Tri tovariwa","A",1922,200,2);
		bookShop.addBook(b1);
		bookShop.addBook(b2);
		bookShop.addBook(b3);
		bookShop.addBook(b4);
		
		Order o1 = new Order();
		o1.setUser(u1);
		Order o2 = new Order();
		o2.setUser(u1);
		Order o3 = new Order();
		o3.setUser(u2);
		bookShop.addOrder(o1);
		bookShop.addOrder(o2);
		
		
		
		
		

	}

}
