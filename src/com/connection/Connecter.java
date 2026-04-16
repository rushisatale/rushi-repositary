package com.connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class Connecter {
	
	private static final String url="jdbc:mysql://localhost:3306/user";
	
	private static final String un="root";
	
	private static final String pw="Rushikesh07";
	
	public static Connection gettConnection() {
		
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		 con= DriverManager.getConnection(url, un, pw);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
