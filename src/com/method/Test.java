package com.method;

public class Test {

	// Method chaining way 1

	void show() {
		
		System.out.println("Show method");
		
	}
	
	void display() {
		//show();
		System.out.println("Display method");
		
	}
	
	void get() {
		//display();
		System.out.println("Get method");
		
	}
	
	public static void main(String[] args) {
		
		Test test= new Test();
		test.get();
//	}
	
	//method chaining way 2
//	
//	Test show() {
//
//		System.out.println("Show method");
//		return this;
//
//	}
//
//	Test display() {
//		
//		System.out.println("Display method");
//		return this;
//	}
//
//	Test get() {
//		
//		System.out.println("Get method");
//		return this;
//
//	}
//
//	public static void main(String[] args) {
//		
//		Test test= new Test();
//		test.show().display().get();
	}	
}
