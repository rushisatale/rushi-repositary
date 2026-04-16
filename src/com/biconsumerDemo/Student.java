package com.biconsumerDemo;

public class Student {
	
	private int id;
	
	private String name;
	
	private String dep;
	
	private double marks;

	public Student(int id, String name, String dep, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDep() {
		return dep;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dep=" + dep + ", marks=" + marks + "]";
	}
	
	

}
