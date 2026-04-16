package com.Multilevelinheritance;

public class B extends A{

	String address;
	B(int id, String name,String address) {
		
		super(id, name);
		this.address=address;
	}
	
	void display() {
		show();
		System.out.println("Address : "+ address);
	}
}
