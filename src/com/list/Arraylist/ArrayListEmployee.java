package com.list.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEmployee {

	public static void main(String[] args) {

		List<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(101, "Aman", "salse", "aman@gmail.com", "male", "India"));
		al.add(new Employee(102, "Ada", "HR", "ada@gmail.com", "female", "USA"));
		al.add(new Employee(103, "Rahul", "IT", "rahul@gmail.com", "male", "India"));
		al.add(new Employee(104, "John", "salse", "john@gmail.com", "male", "USA"));
		al.add(new Employee(105, "Natasha", "IT", "nataha@gmail.com", "female", "Maleshiya"));
		al.add(new Employee(106, "Robert", "HR", "robert@gmail.com", "male", "AUS"));
		al.add(new Employee(107, "Alia", "IT", "aliagmail.com", "female", "India"));


//		for(Employee e:al) {
//			System.out.println(e);
//		}
	
		System.out.println("Size of Arraylist      : "+al.size());
		System.out.println("Get list on Index 4    : "+al.get(4));
		System.out.println("Remove list on index 2 : "+al.remove(2));
		
//		al.clear();
//		System.out.println(al.isEmpty());

//		System.out.println(al.contains("Rushi"));

//		System.out.println(al.reversed());

//		for(Employee e: al) {
//			System.out.println(al.remove(e));
//		}
//		

//		Iterator<Employee> itr = al.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		
		
//		System.out.println(al);

//		for(Employee e:al) {
//			if(e.getName().equals("Aman") )
//			{
//				e.setName("Rushi");
//				e.setEmail("rushi@gmail.com");
// //			System.out.println(e);
//			}
//			System.out.println(e);
		// }
	}

}
