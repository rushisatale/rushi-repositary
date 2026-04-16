package com.list.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LikedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(22);
		list.add(32);
		list.add(24);
		list.add(22);
		list.add(null);
		
		
		
//		System.out.println(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		for (Integer integer : list) {
//		
//			System.out.println(integer);
//		}
		
//		Iterator<Integer> iterator = list.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		ListIterator<Integer> listIterator = list.listIterator();
//		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("===============================");
		while(listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous());
		}
		
	}

}
