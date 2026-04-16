package com.while_loop;

import java.util.Scanner;

public class Prime_number {
	
	public static void main(String[] args) {
		
		//28.Check whether a number is prime using while loop.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number : ");
		int num= sc.nextInt();
		int count=0;
		
		if(num==1) {
			
			System.out.println("1 number cant be prime number");
		}else if(num<=0) {
			System.out.println("invalid number");
		}else {
			
			int i=1;
			while(i<=num) {
				if(num % i==0) {
					count++;
				}
				i++;
			}
			if(count==2) {
				System.out.println(num+" = Prime number");
			}else {
				System.out.println(num+" = is not prime number");
			}
			
		}
		
	}

}
