package com.while_loop;

import java.util.Scanner;

public class Check_Palindrome {
	
	public static void main(String[] args) {
		
		//26.Check whether a number is palindrome using while loop.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int last_digit=0;
		int check=0;
		
		while(num!=0) {
			
			
			last_digit=num % 10;
			
			check=last_digit;
			System.out.print(check);
//			if(check==num) {
//				System.out.print(check);
//				
//				}
			num/=10;
			
			
			
		}
		if(check==num) {
			System.out.print(check);
			
			}
	}

}
