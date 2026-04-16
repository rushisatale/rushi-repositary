package com.abstractKeyword;

import java.util.Scanner;

public class Payment extends Pay {
	
	int id;
	String password;
	int no;
	String pin;

	@Override
	public void upi(int id, String password) {
		
		this.id=id;
		this.password=password;
		
		if(id==12345 && password.equals("1234"))
		{
			System.out.println("Payment Success by upi");
		}else {
		System.out.println("Payment failed");
		}
	}

	@Override
	public void credit(int no) {
		
		this.no=no;
		if(no==123456)
		{
			System.out.println("Payment Success by Credit card");
		}else {
		System.out.println("Payment failed");
		}
		
	}

	@Override
	public void Paytem(String pin) {
		
		this.pin=pin;
		if(pin.equals("0056"))
		{
			System.out.println("Payment Success by Paytem");
		}else {
		System.out.println("Payment failed");
		}
	}
	
	public static void main(String[] args) {
		
		Payment p=new Payment();
		p.upi(12345, "1234");
		p.credit(123456);
		p.Paytem("0056");
	}
	
	
}
