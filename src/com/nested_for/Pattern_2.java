package com.nested_for;

public class Pattern_2 {
	
	public static void main(String[] args) {
		
		
		for(int i= 1; i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(i==1 && j==1) {
					System.out.print("A ");
					
				}else if(i==1 && j==5){
					
					System.out.print("A ");
				}
				else if(i==5 && j==1) {
					System.out.print("A ");

				}
				else if(i==5 && j==5) {
					System.out.print("A ");

				}
				else if(i==3 && j==3) {
					System.out.print("A ");

				}
				else
				{
				System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
