package com.polymorphism;

public class Demo {
	
	//static method can overload 
	//static method can not be override
	public static void show() {
		
		System.out.println("Static method 1");
	}
	
	public static void show(int a) {
		
		System.out.println("Static methos "+a);
	}
	
	public static void main(String[] args) {
		
		Demo.show();
		Demo.show(2);
	} 
}
