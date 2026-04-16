package com.list.Arraylist;

public class Student {
	
	private int id ;
	private String name;
	private String dep;
	private String prnNo;
	private String phoneNo ;
	private String gender;
	
	
	public Student(int id, String name, String dep, String prnNo, String phoneNo, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.prnNo = prnNo;
		this.phoneNo = phoneNo;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}


	public String getPrnNo() {
		return prnNo;
	}


	public void setPrnNo(String prnNo) {
		this.prnNo = prnNo;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dep=" + dep + ", prnNo=" + prnNo + ", phoneNo=" + phoneNo
				+ ", gender=" + gender + "]";
	}
	
	
	
	
}
