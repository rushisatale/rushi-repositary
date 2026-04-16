package com.do_while;

public class Even_number_1to20 {
	
	public static void main(String[] args) {
		//33.Print even numbers between 1 and 20 using do-while loop.
		
		int num=1;
		
		do {
			
			if(num % 2==0) {
				System.out.println(num);
				
			}
			num++;
		}while(num<=20);
	}

}
