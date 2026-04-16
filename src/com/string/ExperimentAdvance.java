package com.string;

public class ExperimentAdvance {
	
	public static void main(String[] args) {
		
//		String str = "java";
//		
//		for (int i = str.length()-1; i >= 0; i--) {
//			
//			char ch = str.charAt(i);
//			System.out.println(ch);
//			
//		}
		
		
//		String str = "java";
//		char ch =' ';
//		char ch2= ' ';
//		
//		for (int i = 0; i < str.length(); i++) {
//			
//			for (int j = str.length()-1; j >=0; j--) {
//				
//				ch2= str.charAt(j);
//			}
//			
//			ch= str.charAt(i);
//		}
//		if(ch==ch2) {
//			System.out.println("is Palindrom");
//			
//		}else {
//			System.out.println("is not palindrome");
//		}
		
		
//		String str= "madam";
//		String rev="";
//		
//		for (int i =str.length()-1; i >=0; i--) {
//			
//			rev= rev + str.charAt(i);
//		}
//		
//		if(str.equals(rev)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("not Palindrome");
//		}
		
		
//		String str = "Programming";
//		
//		for (int i = 0; i < str.length(); i++) {
//			
//			for(int j = i+1; j<str.length();j++) {
//				
//				if(str.charAt(i)==str.charAt(j)) {
//					System.out.print(str.charAt(j)+" ");
//					break;
//				}
//			}
//		}
		
		String str = "Programming";
		String result="";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(result.indexOf(ch)==-1) {
				result= result+ch;
			}
		}
		
		System.out.println(result);
		
	}

}
