package com.thisCallAndKeyword;

public class Test {
	
	int id;
	String name;
	String email;
	int age;
	long phone;
	String address;
	
	Test(){
		
		this(101);
		System.out.println("0 param constructor");
		show();
		
	}
	
	Test(int id){
		
		this("Rushi","rushi@gmail.com");
		System.out.println("1 param constructor");
		this.id=id;
		
	}
	
	Test(String name,String email){
		
		this(22,"Pune",949489393);
		System.out.println("2 param Constructor");
		this.name=name;
		this.email=email;
		
	}
	
	Test(int age , String address, long phone){
		
		System.out.println("3 param constructor");
		this.age =age;
		this.phone=phone;
		this.address = address;
		
		
	}
	
	void show() {
		
		System.out.println("id : "+id);
		System.out.println("Name : "+name);		
		System.out.println("email : "+email);
		System.out.println("age : "+age);
		System.out.println("address : "+address);
		System.out.println("phoneNo : "+phone);

	}
	
	public static void main(String[] args) {
		
		new Test();
		
	}

}
