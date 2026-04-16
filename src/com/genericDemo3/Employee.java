package com.genericDemo3;

public class Employee {
	
	private int empId;
	
	private String empName;
	
	private String dep;
	
	private double salary;

	public Employee(int empId, String empName, String dep, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dep = dep;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDep() {
		return dep;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dep=" + dep + ", salary=" + salary + "]";
	}
	
	
	

}
