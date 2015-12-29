package com.andreyrybak.training.storage;

import java.util.ArrayList;

import com.andreyrybak.training.model.User;

public class UserStorage {
ArrayList<User> allUsers = new ArrayList<User>(); 
	
	private static UserStorage instance;
	
	private UserStorage(){
		
	}
	
	public static UserStorage getInstance() {
		if (instance == null) {
			instance = new UserStorage();
		}
		return instance;
	}
	
	public void addUser(User user){
		allUsers.add(user);
	}
	public void deleteUser(User user){
		allUsers.remove(user);
	}
}
