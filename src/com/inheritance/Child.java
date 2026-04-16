package com.inheritance;

public class Child extends Parent {

	// we cannot override variable 
	int x=20;
	
	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.x);
		
	}
}
