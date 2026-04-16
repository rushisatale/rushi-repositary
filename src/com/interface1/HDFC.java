package com.interface1;

public class HDFC implements Bank {

	@Override
	public void doPayment(double ammount) {
		
		if(Bank.validateAmount(ammount)) {
			
			System.out.println(ammount+" Peyment Success On HDFC bank");
		}else {
			
			System.out.println("Enter Valid Amount");
		}
		
	}

}
