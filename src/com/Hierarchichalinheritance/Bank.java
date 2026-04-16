package com.Hierarchichalinheritance;

public class Bank {
	
	int id;
	
	String name;
	
	Bank(int id,String name){
		
		this.id=id;
		this.name=name;
	}
	
	void show() {
		
		System.out.println("id : "+ id);
		System.out.println("Name : "+ name);
	}

}
