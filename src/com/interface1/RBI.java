package com.interface1;

public class RBI implements Bank {

	@Override
	public void doPayment(double ammount) {
		if( Bank.validateAmount(ammount)) {
			
			System.out.println(ammount+" Peyment Success On RBI bank");
		}else {
			
			System.out.println("Enter Valid Amount");
		}
		
	}
	
}
