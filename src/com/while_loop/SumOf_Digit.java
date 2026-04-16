package com.while_loop;

import java.util.Scanner;

public class SumOf_Digit {
	
	public static void main(String[] args) {
		
		//24.Calculate sum of digits of a number using while loop.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num= sc.nextInt();
		
		int last_dig=0;
		int sum=0;
		while(num!=0) {
			
			last_dig=num % 10;

			
			sum=sum+last_dig;
	
			num/=10;
			
			
		}
		System.out.print(sum);
		
		
		
		
//		int num=123;
//		System.out.println((num/10));
	}

}
