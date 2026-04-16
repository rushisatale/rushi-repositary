package com.exceptionHandling.Throw;

import java.util.Scanner;

public class Test {
	
	void check()  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age < 18) {
			
			throw new AgeNotValidException("Age is not valid");
		}else {
			
			System.out.println("Age is valid");
		}
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		try {
			
			t.check();
		}catch(AgeNotValidException a) {
			
			System.out.println(a.getMessage());
		}
	}

}
