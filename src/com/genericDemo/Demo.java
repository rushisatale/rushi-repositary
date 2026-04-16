package com.genericDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Demo<T> {
	
	void add(T a,T b);

	
	public static void main(String[] args) {
		
//		
//		Demo <Integer> d = (a)->{
//			
//			System.out.println(a);
//		};
//		
//		d.add(10);
//		
//		
//		Demo <String> d2=(b)->{
//			
//			System.out.println(b);
//		};
//		d2.add("Rushi");
		
		
		
//		Demo<String> d = (a)->{
//			
//			System.out.println(a);
//			
//			return 10; 
//		};
//		d.add("Rushi");
		
		
//		Demo<int[]>d=(a)->{
//			
//			System.out.println(Arrays.toString(a));
//		};
//		
//		d.add(new int [] {1,2,2,3,3});
		
		
//		Demo <List<Integer>> d=(a)->{
//			
//			System.out.println(Arrays.toString(a));
//		};
//		
////		List<Integer> l = new ArrayList<Integer>();
//		List<int[]> asList = Arrays.asList(new int[] {1,23,33,44,55});
//		int[] i = null ;
//		for (int[] is : asList) {
//			
//			i=is;
//		}
//		
//		d.add(i);
		
		Demo<Integer> d=(a,b)->{
			
			System.out.println(a*b);
		};
		d.add(11, 22);
		
	}
}
