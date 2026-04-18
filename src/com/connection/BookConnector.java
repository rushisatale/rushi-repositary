package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookConnector {

	private static final String url="jdbc:mysql://localhost:3306/book";
	
	private static final String un = "root";
	
	private static final String psw = "Rushikesh07";
	
	
	public static Connection bookConnection() {
		
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con = DriverManager.getConnection(url, un, psw);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
