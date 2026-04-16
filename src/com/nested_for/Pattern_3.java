package com.nested_for;

public class Pattern_3 {
	
	public static void main(String[] args) {
		
		for(int i=1,num=65; i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				System.out.print((char)num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
