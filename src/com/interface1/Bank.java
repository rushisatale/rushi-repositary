package com.interface1;

public interface Bank {
	
	
	void doPayment(double ammount);
	
//	static void show() {
//		
//	}
//	static void show(int a) {
//		
//	}

	
	static boolean validateAmount(double amount) {
		
		if(amount <= 0) {
			
			return false;
		}
		return true;
	}

}
