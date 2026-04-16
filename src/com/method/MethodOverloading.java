package com.method;

public class MethodOverloading {
	
	void display() {
		
		System.out.println("Method without parameter");
	}
	
	void display(int a) {
		
		System.out.println("Method with 1 parametr "+ a);
	}
	
	void display(String name ,int id) {
		
		System.out.println("Method with 2 Parameter  " );
		System.out.println("Id   : "+ id);
		System.out.println("name : "+name);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading method = new MethodOverloading();
		
		method.display(); // method calling without parameter

        method.display(10);// method calling with 1 parameter
        
        method.display("Rushi",101);// method calling with 2 parameter
	}

}
