package com.Hierarchichalinheritance;

public class SBI extends Bank {
	
	int id;
	String address;
	
	
	SBI(int id,String name,String address){
		
		super(id,name);
		this.id=id;
		this.address=address;
		//super.id=id;
		
	}
	
	void display() {
		show();
		
//		System.out.println("id : "+ id);
		System.out.println("address : "+ address);
	}
	
	public static void main(String[] args) {
		
		SBI sbi= new SBI(101,"Rushi","pune");
		
		sbi.display();
		
	}

}
