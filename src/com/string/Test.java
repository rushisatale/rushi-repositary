package com.string;

public class Test {
	
	public static void main(String[] args) {
		
		// == it will check the address of both String is equal or not
		String s1 = "Rushi";
//		System.out.println(s1.trim());
		String s2 = "rushi";
//		System.out.println(s1.compareTo(s2));
		
		
		double f = 45.45;
		String s= String.valueOf(f);
				System.out.println(s.length());
		
		
		
		//System.out.println(s1.equalsIgnoreCase(s2));
		//System.out.println(s1==s1);
		
		// .equals--> it will check content / literal of both String
		String str = new String("Rushi"); 
		
		String st1= new String("Rushi");
		
		//System.out.println(str==st1);
	}

}
