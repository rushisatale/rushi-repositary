package com.Multilevelinheritance;

public class C extends B{
	
	String email;

	C(int id, String name,String address,String email) {
		
		
		super(id, name,address);
		 
		this.email=email;
		get();
		
	}
	
	
	void get() {
		display();
		System.out.println("email : "+ email);
	}

	public static void main(String[] args) {
		
		new C(101,"Rushi","pune","Rushi@gmail.com");
		
		
		
	}
}
