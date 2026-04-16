package com.inheritance;

public class Employee extends Person {
	
	int x=10;
	
	public Employee() {
	
		System.out.println("I am Employee Constructor");
	}
	
	@Override
	public void display() {
		
		System.out.println("\n Overriden method");
		System.out.println("Display Employee method");
	}

	
	public static void main(String[] args) {
		
		Person p = new Employee();
		p.display();
		

	}
}
