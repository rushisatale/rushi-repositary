package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> arr = new ArrayDeque<Integer>();
		
		arr.add(29);
		arr.add(22);
		arr.add(99);
		arr.add(20);
		arr.add(11);
		arr.add(21);
		arr.add(69);
	
		System.out.println(arr);

		System.out.println("Removing top element : "+arr.pop());
		System.out.println(arr);
		
		System.out.println("=================");
		
		System.out.println("Getting top element : "+arr.peek());
		System.out.println(arr);
		
		System.out.println("=================");

		System.out.println("Getting last element : "+arr.peekLast());
		
		
		
	}

}
