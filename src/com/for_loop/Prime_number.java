package com.for_loop;

import java.util.Scanner;

public class Prime_number {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int num= sc.nextInt();
		int count=0;
		
		if(num==1) {
			System.out.println(1+ " cant be prime");
		}else if(num<=0) {
			System.out.println("Invalid number ");
		}else {
			for(int i=1;i<=num;i++) {
				if(num % i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num+" = is prime number");
			}else {
				System.out.println(num+ " = is not prime");
			}
		}
	}

}
