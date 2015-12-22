package com.andreyrybak.training.service;

import com.andreyrybak.training.model.User;
import com.andreyrybak.training.storage.UserStorage;

public class UserService {

	UserStorage userStorage = UserStorage.getInstance();
	public static UserService instance;
	
	private UserService(){
		
	}
	
	public static UserService getInstance(){
		if(instance == null){
			synchronized (UserService.class) {
				if(instance == null){
					instance = new UserService();
				}
			}
		}
		return instance;
	}
	
	
	
	public void addUser(User user){
		userStorage.addUser(user);
	}
	public void deleteUser(User user){
		userStorage.deleteUser(user);
	}
}
