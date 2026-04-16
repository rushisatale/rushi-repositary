package com.while_loop;

import java.util.Scanner;

public class ATM_pin_check {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		int correctPin = 1212;
		int attempts=0;// for user attempts
		
		while(attempts < 3) // 0<3, 1<3 , 2<3, 3<3=False 
		{
			System.out.println("Enter your pin : ");
			int pin=sc.nextInt();
			
			if(correctPin  == pin) {
				System.out.println("Access Granted...");
				break;// to stop/end the program
			}
			else {
				attempts++;// 1 2 3
				System.out.println("Wrong pin...attempts left = "+ (3-attempts));
				
				
				if(attempts==3) {
					System.err.println("Card blocked");
				}
			}
		}
	}

}
