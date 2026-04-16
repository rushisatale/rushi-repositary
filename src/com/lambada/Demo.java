package com.lambada;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	
	
//	static void calculate(Test t) {
//		
//		t.calculate(22,33);
//	}
	

	public static void main(String[] args) {
//
//		Demo.calculate((a,b)->{
//			
//			System.out.println("Addition = "+(a+b));
//			System.out.println("Substraction = "+(a-b));
//			
//		});
		
		
//		Test t = ()->System.out.println("add");
//		
//		t.add();

//		Test t = (x,y)->{
//			
//			System.out.println("Addition is :"+(x+y));
//		};
//		t.add(22, 11) ;

//		Test t = (x,y)->{
//			
//			return x+y;
//		};
//		
//		System.out.println(t.add(11,33));

//		Test t = ()->{
//			
//			return "Rushi";
//		};
//		System.out.println(t.getName());

//		Test t =(a,b)->{
//			
//			return (a+b).toLowerCase();
//			
//		};
//		
//		System.out.println(t.getName("Rushi", "kesh"));
//		
//		Test t=(s1,s2)->{
//			
//			return s1.equals(s2);
//		};
//		System.out.println(t.getName("Rushi","Rushi"));

//		Test t=(a)-> {
//			int sum=0;
//			for(int x:a) {
////				if(x % 2 == 0)
//				
//				sum+=x;
//			}
//			System.out.println("Sum ="+sum);
//		};
//		
//		int arr[]= {1,2,3,4,5};
//		
//		t.takeNumber(arr);

		
//		Test t = ()->{
//			
//			int [] num={1,2,3,4,5};
//			
//			return num;
//		};
//		
//		int arr[]=t.number();
//		
//		System.out.println(Arrays.toString(arr));
//		for(int x:arr) {
//			
//			System.out.println(x);
//		}

		Test t = (int[]a)->{
			
			return a;
		};
		
		System.out.println(Arrays.toString(t.takeNumber(new int[] {1,2,10,12})));

//		Test t = (int[] arr1, int[] arr2) -> {
//			
//			int sum[] = new int [arr1.length];
//			
//			for (int i = 0; i < arr1.length; i++) {
//
//				sum[i] = arr1[i] + arr2[i];
//			}
//			return sum;
//		};
//
//		int[] a1 = { 1, 2, 3, 4, 5 };
//		int[] a2 = { 1, 2, 3, 4, 5 };
//
//		int [] result=t.takeNumber(a1, a2);
//
//		System.out.println(Arrays.toString(result));
		
		
//		Test t = ()->{
//			
//			return new String [] {"Rushi","Ram"};
//		};
//		
//		String [] names=t.getNames();
////		System.out.println(Arrays.toString(names));
//		for(String str:names) {
//			
//			System.out.println(str);
//		}
		
		
//		Test t=(student)->{
//			
//			System.out.println(student);
//		};
//		
//		Student st = new Student(1,"Ravi","Pune");
//		t.takeStudent(st);
//		
		
		
//		Test t= (students)->{
//			
//			for (Student s1 : students) {
//				
//				System.out.println(s1);
//			}
//			
//		};
//		
//		List<Student> asList = Arrays.asList(new Student(1, "Raja", "Pune"),new Student(2, "Vaibhav", "Beed"));
//		
//		t.takeStudents(asList);
//		
		
//		Test t = (map)->{
//			
//			//Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//			
//			for (Entry<Integer, Integer> s1 : map.entrySet()) {
//				
//				System.out.println(s1.getKey()+" "+s1.getValue());
//				
//			}
//		};
//		
//		HashMap<Integer, Integer> students = new HashMap<Integer, Integer>();
//		
//		students.put(1, 101);
//		students.put(2, 102);
//		
//		t.takeStudents(students);
		
		
		
		
	}

}
