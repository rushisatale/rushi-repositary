package com.exceptionHandling.Throw;

import java.util.Scanner;

public class Amount {
	
	void show() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your amount");
		double amount = sc.nextDouble();
		
		if( amount <= 0) {
			
			throw new AmountNotValidException("Please valid amount");
		}else {
			
			System.out.println("Amount is valid");
		}
	}
	
	public static void main(String[] args) {
		
		Amount a = new Amount();
		
		try {
			
			a.show();

		}catch(AmountNotValidException ae) {
			
			ae.printStackTrace();;
			System.err.println(ae.getMessage() );
		}
	}

}
