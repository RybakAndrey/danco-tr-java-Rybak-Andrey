package com.andreyrybak.training.mainstorage;

import java.util.List;

import com.andreyrybak.training.model.Book;
import com.andreyrybak.training.model.Order;
import com.andreyrybak.training.model.User;
import com.andreyrybak.training.storage.BookStorage;
import com.andreyrybak.training.storage.OrderStorage;
import com.andreyrybak.training.storage.UserStorage;

public class BookShop {

	BookStorage bookStorage = BookStorage.getInstance();
	OrderStorage orderStorage = OrderStorage.getInstance();
	UserStorage userStorage = UserStorage.getInstance();
	
	
	public static BookShop instance;
	
	private BookShop(){
		
	}
	
	public static BookShop getInstance(){
		if(instance == null){
			synchronized (BookStorage.class) {
				if(instance == null){
					instance = new BookShop();
				}
			}
		}
		return instance;
	}
	
	
	public void showAllBooks(){
		bookStorage.showAllBooks();
	}
	public List<Book> getAllBooks(){
		return bookStorage.getAllBooks();
	}
	public void addBook(Book book){
		bookStorage.addBook(book);
	}
	public void deleteBook(Book book){
		bookStorage.deleteBook(book);
	}
	public void addBookCountOnStorage(Book book, int count){
		bookStorage.addBookCountOnStorage(book, count);
	}
	public void sortBooks(String sortBy){
		bookStorage.sortBooks(sortBy);
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
	
	
	
	public void addUser(User user){
		userStorage.addUser(user);
	}
	public void deleteUser(User user){
		userStorage.deleteUser(user);
	}
	
}
