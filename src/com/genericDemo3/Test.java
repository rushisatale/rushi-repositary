package com.genericDemo3;

import java.util.Arrays;

public interface Test <T,U,R> {
	
	R get(T t, U u);
	
	
	public static void main(String[] args) {
		
//		Test <Student,Book,Employee> t=(s,b)->{
//			
//			System.out.println(s);
//			System.out.println(b);
//			
//			
//			
//			return new Employee(1010, "Roy", "IT",25000);
//		};
//		
//		Employee e=t.get(new Student(1,"Nitin", 88.8), new Book(101, "DBMS", "H R Mishra", 200.0));
//		
//		
		
		Test <String[],String[],String[]>t=(a,b)->{
			
			
			return a;
			
		};
		
		String str[]=t.get(new String[] {"Vinod,Ashish"}, new String[] {"Mohit,Rushi,Ayush,Ravi"});
		
		System.out.println(Arrays.toString(str));
	}
	

}
