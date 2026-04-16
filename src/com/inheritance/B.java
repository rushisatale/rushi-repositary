package com.inheritance;

public class B extends A {

	
	public void show() {
		
		System.out.println("its B's Show method");
		super.show();
	}
	
	public void show(int x) {
		
		System.out.println("another show method "+x);
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.show();
	}
}
