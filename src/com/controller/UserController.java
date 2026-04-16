package com.controller;

import java.util.ArrayList;

import com.entity.User;
import com.service.UserService;

public class UserController {

	
	UserService service = new UserService();
	
	public String insertTable(User user) {
		
		return service.insertUser(user);
	}
	
	
	public String updateUser(User user) {
		
		return service.updateUser(user);
	}
	
	
	public String deleteUser(String userName) {
		
		return service.deleteUser(userName);
	}
	
	
	public String deleteAll() {
		
		return service.deleteAll();
	}
	
	
	public User getUser(String name) {
		
		return service.getuser(name);
	}
	
	
	public ArrayList<User> getAllUser(){
		
		return service.getAllUser();
	}
}
