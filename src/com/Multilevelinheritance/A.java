package com.Multilevelinheritance;

public class A {
	
	int id;
	String name;
	
	A(int id,String name){
		
	
		
		this.id= id;
		this.name=name;
		
	}
	
	void show() {
		
		System.out.println("Id : "+ id);
		System.out.println("Name : "+name);
	}

}
