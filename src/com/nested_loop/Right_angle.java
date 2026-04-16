package com.nested_loop;

import java.util.Scanner;

public class Right_angle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num= sc.nextInt();
		int counter=1;
		
		
		while(counter<=num) {
			
			System.out.println("* " +counter);
			counter++;
		}
	}

}
