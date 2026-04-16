package com.for_loop;

import java.util.Iterator;

public class Sum_1to100 {
	
	public static void main(String[] args) {
		
		//16.Calculate sum of numbers from 1 to 100 using for loop.
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			
			sum+=i;
			
		}
		System.out.println(sum);
	}

}
