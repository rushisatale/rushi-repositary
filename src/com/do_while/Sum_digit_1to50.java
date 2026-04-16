package com.do_while;

public class Sum_digit_1to50 {
	
	public static void main(String[] args) {
		
		//34.Calculate sum of numbers from 1 to 50 using do-while loop.
		
		int num=1;
		int sum=0;
		
		do {
			
			sum+=num;
			num++;
			
		}while(num<=50);
		System.out.println(sum);
	}

}
