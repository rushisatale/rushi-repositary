package com.while_loop;

public class Pattern_While {

	public static void main(String[] args) {

		int i = 1;
		

		while (i <= 5) {
			int j = 1;

			while (j <= 5) {
				
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
	}

}
