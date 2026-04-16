package com.ConsumerDemo;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private double salary;

	public Employee(int id, String name, String email, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", salary="
				+ salary + "]";
	}
	
	

}
