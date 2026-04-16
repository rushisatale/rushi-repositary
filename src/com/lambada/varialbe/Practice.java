package com.lambada.varialbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	
//	static void add(Function f) {
//		
//		f.add(100);
//	}
	
	void fun(Function f) {
		
		f.add(100);
	}
	
	public static void main(String[] args) {
		
		
		Practice ps = new Practice();
		ps.fun((w)->{
			
			System.out.println(w);
		});
//		
//		Practice.add((i)->{
//			System.out.println(i);
//		});
//		
		
		
//		Function f = (a,b)->System.out.println("Addition = "+(a+b));
//		
//		f.add(22, 10);
		
		
//		Function f = (s1,s2)->{
			
//			System.out.println(s1.contains(s2));
			
//			System.out.println(s1.endsWith(s2));
			
//			System.out.println(s1.indexOf("h"));//==>
			
//			System.out.println(s1.charAt(4)); //==>i
			
//		};
//		
//		f.add("Rushi", "vinod");
		
		
		
//		
//		Function f = (emoloyee)->{
//			
//			return emoloyee;
//		};
//		
//		Employee e = new Employee(1, "Naman", "Mumbai");
//		
//		System.out.println(f.add(e));
//		
		
		
		
//		Function f = (employee)->{
//			
//			
//			return employee;
//		};
		
		
//		Employee e1 = new Employee(101, "Naman", "Mumbai");
		
		
		
		
//		List<Employee> empl = new ArrayList<Employee>();
//		
//		empl.add(new Employee(101, "Naman", "Mumbai"));
//		empl.add(new Employee(102, "Raj", "Hydrabad"));
//		empl.add(new Employee(103, "Jonathan", "Mumbai"));
//		
//		f.add(empl);
//		
//		for(Employee el:empl) {
//			
//			System.out.println(el);
//		}
//		
		
//		Function f = (x)->{
//			
////			Set<Entry<Integer, String>> entrySet = x.entrySet();
//			
//			for(Entry<Integer, String> entry: x.entrySet()) {
//				
//				System.out.println(entry.getKey()+" "+ entry.getValue());
//			}
//			
//		};
//		
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		
//		hm.put(101,"Rushi");
//		hm.put(102, "Vitthal");
//		hm.put(103, "Vinod");
//		
//		f.addEmployee(hm);
		
//		Function f = (a1,a2)->{
//			
//			int sum[]= new int[a1.length];
//			
//			for (int i = 0; i < a1.length; i++) {
//				
//				sum[i]= a1[i] + a2[i];
//			}
//			return sum;
//		};
//		
//		int []aa = {2,3,4,5};
//		int[] bb = {2,3,4,5};
//		
//		int []result=f.add(aa, bb);
//		
//		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
	}
	
}
