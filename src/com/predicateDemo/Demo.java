package com.predicateDemo;

import java.util.function.Predicate;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> p	=(a)-> a==10 ;
		
		System.out.println(p.test(10));
//		
//		System.out.println(p.test(20));
		
		
//		Predicate<String> p = (s)->{
//			
////			return s.contains("z");
//			
////			return s.equals("rushi");
//			
////			return s.startsWith("R");
////			return s.endsWith("h");
//			
//			return s.isEmpty();
//			
//			
//		};
//		
//		System.out.println(p.test("Rushi"));
		
		
		
	}
	
}
