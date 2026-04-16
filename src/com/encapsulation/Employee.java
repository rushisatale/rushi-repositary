package com.encapsulation;

public class Employee {
	
	private String id;
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private String dep;
	
	private double salary;
	
	
	public String getName() {
		
		return name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		
		this.name=name;
	}

public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		
		this.email=email;
	}
public String getGender() {
		
		return gender;
	}
	
	public void setGender(String gender) {
		
		this.gender=gender;
	}
	
public String getDep() {
		
		return dep;
	}
	
	public void setDep(String dep) {
		
		this.dep=dep;
	}
	
public double getSalary() {
		
		return salary;
	}
	
	public void setSalary(double salary) {
		
		this.salary=salary;
	}
}
