package com.lambada;

import java.util.Arrays;

public interface Practice {
	
	int [] getNumbers(int[] arr);
	
	public static void main(String[] args) {
		
		
		Practice p = (arr)->{
			
			int even=0;
			for (int i : arr) {
				if(i%2==0) {
					even=i;
				}
			}
			int[]evenNumber= new int[even];
			for (int j : evenNumber) {
				
			}
			
			return evenNumber;
			
		};
		
		System.out.println(p.getNumbers(new int [] {1,2,3,4,5,6}));
		
		
		
		
	}

}
