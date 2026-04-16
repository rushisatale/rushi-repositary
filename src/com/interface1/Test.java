package com.interface1;

public class Test {
	
	public static void main(String[] args) {
		
		SBI sbi= new SBI();
		sbi.doPayment(2000);
		
		HDFC hdfc = new HDFC();
		hdfc.doPayment(3939);
		
		RBI rbi = new RBI();
		rbi.doPayment(8374);
	}

}
