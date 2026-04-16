package com.list.Arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		
//		ArrayList<String> al = new ArrayList<String>();
//		
//		al.add("Rushi");
//		al.add("Kiran");
//		al.add("Ashish");
//		al.add("Utkarsh");
//		al.add("Vitthal");
//		al.add("Sangha");
		
//		System.out.println(al);
		
//		System.out.println(al.get(5));
//		System.out.println(al.size());
//		System.out.println(al.set(4, "Vaibhav"));
//		System.out.println(al.remove("Kiran"));
		
//		al.clear();
//		System.out.println(al.isEmpty());
		
//		System.out.println(al.contains("Rushi"));
//		System.out.println(al.indexOf("shish"));
//		System.out.println(al.reversed());
//		System.out.println(al);
		

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(44);
		al.add(55);
		al.add(33);
		al.add(39);
		al.add(22);
		al.add(65);
		
//		System.out.println(al);
//		System.out.println(al.size());
		
//		System.out.println(al.contains(55));
		
//		System.out.println(al.get(4));
		
//		System.out.println(al.remove(3));
//		al.clear();
		
//		System.out.println(al.set(5, 100));
//		System.out.println(al.indexOf(55));
//		System.out.println(al.reversed());
//		System.out.println(al);		
		
		ArrayList<Object> al2  = new ArrayList<Object>();
		
		al2.add(33);
		
		al2.add("Rushi");
		
		
		al2.add(true);
		
		al2.add('s');
		
		al2.add(45.44);
		
//		System.out.println(al2);
		
		
		for (int i = 0; i < al2.size(); i++) {
			
			System.out.println(al2.get(i));
			
		}
		System.out.println("===========================");
		for (Object object : al2) {
			
			System.out.println(object);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

