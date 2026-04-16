package com.bipredicate;

import java.util.function.BiPredicate;

import com.ConsumerDemo.Employee;
import com.biconsumerDemo.Student;

public class Demo2 {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bp =(a,b)->a==b;
			System.out.println(bp.test(10,11));
//		
//		System.out.println(bp.test(10, 20));
		
		
//		BiPredicate<Employee, Student> bp = (a,b)->{
//			
////			return a.equals(b);
////			return a.getId()==b.getId();
//			return a.getSalary()>50000;
//		};
//		
//        boolean test = bp.test(new Employee(101, "Ravi", "ravi@gmail.com", "male",25000), new Student(101, "Ramesh", "Computer Science", 87.00));
//        
//        System.out.println(test);
	}

}
