package com.string;

public class Practice {
	
	public static void main(String[] args) {
		
		String str = "I Love Mahrashtra";
		
		for (int i = 0; i <str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch >='A' && ch <= 'Z') {
				System.out.println(ch);
				
			}
			
		}
		
	}

}
