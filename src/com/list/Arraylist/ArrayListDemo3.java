package com.list.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		
//		ArrayList<String> al = new ArrayList<String>();
//		
//		al.add("Rushi");
//		al.add("kiran");
//		al.add("Vitthal");
//		al.add("Ashish");
//		al.add("Sangha");
//		
//		System.out.println(al);
//		
//		
//		for (int i = 0; i < al.size(); i++) {
//			
//			System.out.println(al.get(i));
//			
//		}
//		
//		System.out.println("=================");
//		
//		for (String string : al) {
//			
//			System.out.println(string);
//		}
//		System.out.println("=================");
//		
//		Iterator<String> itr= al.iterator();
//		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
//		System.out.println("==============");
//		
//		
//		ListIterator<String> ltr = al.listIterator();
//		
//		while(ltr.hasNext()) {
//			System.out.println(ltr.next());
//		}
//		
//		System.out.println("====================");
//		while(ltr.hasPrevious()) {
//			System.out.println(ltr.previous());
			
			
			
			
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			
			
			al2.add(1);
			al2.add(2);
			al2.add(3);
			al2.add(4);
			
			Iterator<Integer> itr1 = al2.iterator();
			
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
		//}
	}
	
}
