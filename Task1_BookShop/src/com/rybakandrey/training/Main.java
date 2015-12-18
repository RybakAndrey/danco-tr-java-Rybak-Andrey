package com.rybakandrey.training;
import java.nio.file.Files;

import com.danco.training.*;

public class Main {

	public static void main(String[] args) {
		
		final String FILE_PATH = "C:/Users/asus/workspace/Task1_BookShop/src/Files/Books.txt";
		
		TextFileWorker file = new TextFileWorker(FILE_PATH);

		/*String [] s = new String[] {"Author2","Name2","1992","12/12/2012","25"};
		String [] s2 = new String[] {"Author3","Name3","1993","12/12/2012","25"};
	
		file.writeToFile(s);
		file.writeToFile(s2);
		
		Object[] readValues = file.readFromFile();
		for (int i = 0; i < readValues.length; i++ ){
			System.out.println(readValues[i]);
		}*/
		
		Storage storage = new Storage();
		Book b1 = new Book("Author","Harry Potter",2005,"12/12/2015",15);
		Book b2 = new Book("Author1","Harry Potter2",2015,"21/21/2015",51);
		storage.addBook(b1);
		storage.addBook(b2);
		Book b3 = new Book("Author3","Harry Potter3",2045,"21/21/2015",51);
		
		User andrey = new User();
		Order order = new Order();
		order.makeOrder(andrey, storage);
		order.addBook(b2);
		order.addBook(b3);
		System.out.println(order.getStatus());
		order.showDetails();
	}

}
