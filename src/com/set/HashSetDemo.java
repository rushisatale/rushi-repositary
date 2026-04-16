package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(22);
		set.add(88);
		set.add(33);
		set.add(88);
		set.add(88);
		set.add(35);
		set.add(90);
		set.add(89);
		
		System.out.println(set);
		
		System.out.println("Size of set "+set.size());
		
		Iterator<Integer> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}

}
