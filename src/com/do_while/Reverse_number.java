package com.do_while;

import java.util.Scanner;

public class Reverse_number {
	
	public static void main(String[] args) {
		
		//36.Reverse a number using do-while loop.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int ld=0;
		int digit=0;
		
		do {
			ld=num % 10;
			digit=ld;
			System.out.print(ld);
			
			num/=10;
			
		}while(num!=0);
	}

}
