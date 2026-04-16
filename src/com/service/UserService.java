package com.service;

import java.util.ArrayList;

import com.dao.Userdao;
import com.entity.User;
import com.exception.SomethingWentWrong;
import com.exception.UserNotFoundException;
import com.exception.UsersNotFoundException;

public class UserService {
	
	Userdao dao = new Userdao();
	
	
	
	public String insertUser(User user) {
		
		
		String msg = dao.insertUser(user);
		
		if(msg==null) {
			
			throw new UserNotFoundException("User not exits");
		}
		
		return msg;
	}
	
	
	
	public String updateUser(User user) {
		
		String msg = dao.updateUser(user);
		
		if(msg==null) {
			
			throw new SomethingWentWrong("check your sql qoery");
		}
		
		return msg;
	}
	
	
	
	public String deleteUser(String userNamme) {
		
		String msg = dao.deleteUser(userNamme);
		
		if(msg == null) {
			
			throw new UserNotFoundException("User not exist");
		}
		return msg;
	}
	
	
	
	public String deleteAll() {
		
		return dao.deleteAll();
	}
	
	
	
	public User getuser(String name) {
		
		return dao.getUser(name);
		
		
	}
	
	
	
	public ArrayList<User> getAllUser(){
		
		ArrayList<User> user= dao.getAllUser();
		if(user.isEmpty()) {
			
			throw new UsersNotFoundException("users not present");
		}
		
		return user;
		
	}

}
