package com.list.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudent {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student(101, "Rushi", "CSE", "240299388", "8498387993", "Male"));
		al.add(new Student(102, "Kiran", "CSE", "24498984", "3878234792", "Male"));
		al.add(new Student(103, "Vitthal", "IT", "2487832489", "8483378343", "Male"));
		al.add(new Student(104, "Ashish", "IT", "2398749744", "938972373", "Male"));
		al.add(new Student(105, "Nikita", "CSE", "2498749744", "9309498373", "Female"));
		al.add(new Student(106, "Akanksha", "IT", "2383749744", "838972373", "female"));
		al.add(new Student(107, "Pradnya", "IT", "2398749744", "888972373", "Female"));
		al.add(new Student(108, "Priti", "CSE", "2498749744", "908972373", "Female"));
		al.add(new Student(109, "Saloni", "CSE", "2398749744", "988972373", "Female"));
		al.add(new Student(110, "Sangha", "CSE", "2398749744", "939972373", "Male"));
		

//		System.out.println(al);

//		for (int i = 0; i < al.size(); i++) {
//			
//			System.out.println(al.get(i));
//		}

		for (Student s : al) {

			if (s.getPrnNo().startsWith("24"))
				System.out.println(s);
		}

//		for (Student s : al) {
//
//			if (s.getName().startsWith("S"))
//				System.out.println(s);
//		}

//		for(Student s:al) {
//			if(s.getDep().equals("CSE") && s.getGender().equals("Female"))
//			{	
//			System.out.println(s);
//			}
//		}

//		Iterator<Student> itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		ListIterator<Student> ltr = al.listIterator();
//		while(ltr.hasNext()) {
//			System.out.println(ltr.next());
//		}
	}

}
