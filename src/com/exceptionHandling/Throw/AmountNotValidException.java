package com.exceptionHandling.Throw;

public class AmountNotValidException extends RuntimeException{
	
	public AmountNotValidException(String msg) {
		
		super(msg);
		
	}

}
