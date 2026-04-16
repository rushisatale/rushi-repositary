package com.entity;

public class User {
	
	private String username ;
	
	private String psw;
	
	private String email;
	
	private String dob;
	
	private String mobileNo;
	
	private int age;
	
	private String city;

	public User(String username, String psw, String email, String dob, String mobileNo, int age, String city) {
		super();
		this.username = username;
		this.psw = psw;
		this.email = email;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.age = age;
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public String getPsw() {
		return psw;
	}

	public String getEmail() {
		return email;
	}

	public String getDob() {
		return dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", psw=" + psw + ", email=" + email + ", dob=" + dob + ", mobileNo="
				+ mobileNo + ", age=" + age + ", city=" + city + "]";
	}
	
	

}
