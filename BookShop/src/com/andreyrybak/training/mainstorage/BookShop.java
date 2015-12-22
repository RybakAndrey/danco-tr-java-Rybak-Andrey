package com.andreyrybak.training.mainstorage;

import java.util.List;

import com.andreyrybak.training.model.Book;
import com.andreyrybak.training.model.Order;
import com.andreyrybak.training.model.OrderBook;
import com.andreyrybak.training.model.User;
import com.andreyrybak.training.service.BookService;
import com.andreyrybak.training.service.OrderBookService;
import com.andreyrybak.training.service.OrderService;
import com.andreyrybak.training.service.UserService;
import com.andreyrybak.training.storage.BookStorage;
import com.andreyrybak.training.storage.OrderBookStorage;
import com.andreyrybak.training.storage.OrderStorage;
import com.andreyrybak.training.storage.UserStorage;

public class BookShop {

	BookService bookService;
	OrderService orderService;
	UserService userService;
	OrderBookService orderBookService;
	
	
	public static BookShop instance;
	
	private BookShop(){
		bookService = BookService.getInstance();
		orderBookService = OrderBookService.getInstance();
		userService = UserService.getInstance();
		orderService = OrderService.getInstance();
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
		bookService.showAllBooks();
	}
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	public void addBook(Book book){
		bookService.addBook(book);
	}
	public void deleteBook(Book book){
		bookService.deleteBook(book);
	}
	public void addBookCountOnStorage(Book book, int count){
		bookService.addBookCountOnStorage(book, count);
	}
	public void sortBooks(String sortBy){
		bookService.sortBooks(sortBy);
	}
	
	
	
	public void showAllOrders(){
		orderService.showAllOrders();
	}
	public void addOrder(Order order){
		orderService.addOrder(order);
	}
	public void deleteOrder(Order order){
		orderService.deleteOrder(order);
	}
	public void sortOrders(String sortBy){
		orderService.sortOrders(sortBy);
	}
	
	
	
	public void addUser(User user){
		userService.addUser(user);
	}
	public void deleteUser(User user){
		userService.deleteUser(user);
	}
	
	
	
	public List<OrderBook> getAllOrderBooks(){
		return orderBookService.getAllOrderBooks();
	}
	
	public void addOrderBook(OrderBook book){
		orderBookService.addOrderBook(book);
	}
	public void deleteOrderBook(OrderBook book){
		orderBookService.deleteOrderBook(book);
	}
	
	public void showAllOrderBooks(){
		orderBookService.showAllOrderBooks();
	}
	
}
