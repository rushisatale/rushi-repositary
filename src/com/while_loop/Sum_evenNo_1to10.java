package com.while_loop;

public class Sum_evenNo_1to10 {
	
	public static void main(String[] args) {
		
		int sum=0;
		int num=1;
		
		while(num<=10) {
			
			if(num % 2==0) {
				
				sum+=num;	
			}
			num++;		
		}
		System.out.println(sum);
		
	}

}
