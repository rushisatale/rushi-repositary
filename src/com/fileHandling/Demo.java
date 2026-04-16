package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.encapsulation.Employee;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		e.setId("6");
		e.setName("Utkarsh");
		e.setGender("male");
		e.setDep("IT");
		e.setEmail("utkarsh@gmail.com");
		
		FileWriter fw=null;
		try {
		 fw = new FileWriter("D:\\Java Lecture\\files(File Handling )\\employee.txt",true);
		fw.write("\n=============================");
		fw.write("\nId         = " +e.getId());
		fw.write("\nName       = " +e.getName());
		fw.write("\ngender     = " +e.getGender());
		fw.write("\ndepartment = " +e.getDep());
		fw.write("\nemail      = " +e.getEmail());

		System.out.println("Data is added");
		
		fw.flush();
		
		}catch(IOException i) {
			
			System.out.println(i.getMessage());
		}finally {
			try {
			fw.close();
			}catch(IOException i) {
				System.out.println(i.getMessage());
			}
		}
		
	}

}
