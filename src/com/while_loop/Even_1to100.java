package com.while_loop;

public class Even_1to100 {
	
	public static void main(String[] args) {
		
		//23.Print all even numbers from 1 to 100 using while loop.
		
		int num=1;
		
		while(num<=100) {
			
			if(num % 2 == 0) {
				System.out.println(num);
				
			}
			num++;
		}
	}

}
