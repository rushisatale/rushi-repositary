package com.supplierDemo;

import java.util.function.Supplier;

public class Test {
	
	public static void main(String[] args) {
		
		
//		Supplier<Integer> s =()->{
//			
//			return 10;
//		};
//		
//		System.out.println(s.get());
		
		
		Supplier<Integer> s = ()->{
			
			return "Rushi".length();

//			return "Rushi".indexOf("s");
//			return "Rushi".lastIndexOf("i");

		};
		
		System.out.println(s.get());
		
		
		
	}

}
