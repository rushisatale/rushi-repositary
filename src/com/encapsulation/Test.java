package com.encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setName("Rushi");
	    System.out.println("Name   : "+e.getName());
	    
	    e.setEmail("rushi@gamil.com");
	    System.out.println("Email  : "+e.getEmail());
	    
	    e.setDep("It Department");
	    System.out.println("Dep    : "+e.getDep());
	    
	    e.setGender("Male");
	    System.out.println("Gender : "+e.getGender());
//	    
	    e.setSalary(25000);
	    System.out.println("Salary : "+e.getSalary());
	}

}
