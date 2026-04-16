package com.exceptionHandling.Throw;

public class AgeNotValidException extends RuntimeException {
	
	public AgeNotValidException( String msg) {
		
		super(msg);
		
	}

}
