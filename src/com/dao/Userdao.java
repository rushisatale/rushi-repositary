package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.connection.Connecter;
import com.entity.User;

public class Userdao {

	// get connection
	Connection con = Connecter.gettConnection();

//	create table

//	public void createTable() {
//
//		try {
//
//			Statement statement = con.createStatement();
//			statement.execute("create table users (name varchar(22), password varchar(22), email varchar(33), dob varchar(22), mobileNo varchar(22), city varchar(22), age int )");
//			System.out.println("Table created");
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}

	public String insertUser(User user) {

		try {
			PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPsw());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getDob());
			ps.setString(5, user.getMobileNo());
			ps.setString(6, user.getCity());
			ps.setInt(7, user.getAge());

			int value = ps.executeUpdate();
			if (value > 0) {

				return "user insert successfully";
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public String updateUser(User user) {

		try {
			PreparedStatement ps = con.prepareStatement("update  users set password=? , email=? , dob=? , mobileNo=? , city=? , age=?  where name=?");
			ps.setString(1, user.getPsw());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getDob());
			ps.setString(4, user.getMobileNo());
			ps.setString(5, user.getCity());
			ps.setInt(6, user.getAge());
			ps.setString(7, user.getUsername());

			int value = ps.executeUpdate();

			if (value > 0) {

				return "user update successfully";
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	public String deleteUser(String userName) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from users where name=? ");
			ps.setString(1, userName);
			int value = ps.executeUpdate();

			if (value > 0) {

				return "user delete seccessfully";
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	public String deleteAll() {

		try {
			PreparedStatement ps = con.prepareStatement("truncate table employees");

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "all Employee are deleted";
	}

	public User getUser(String name) {

		User user = null;

		try {
			PreparedStatement ps = con.prepareStatement("select * from users where name=?");
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				String name1 = rs.getString("name");
				String psw = rs.getString("password");
				String email = rs.getString("email");
				String dob = rs.getString("dob");
				String mob = rs.getString("mobileNo");
				String city = rs.getString("city");
				int age = rs.getInt("age");

				user = new User(name1, psw, email, dob, mob, age, city);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return user;

	}

	public ArrayList<User> getAllUser() {

		ArrayList<User> userlist = new ArrayList<User>();

		User user = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from users");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				String name1 = rs.getString("name");
				String psw = rs.getString("password");
				String email = rs.getString("email");
				String dob = rs.getString("dob");
				String mob = rs.getString("mobileNo");
				String city = rs.getString("city");
				int age = rs.getInt("age");

				user = new User(name1, psw, email, dob, mob, age, city);
				userlist.add(user);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return userlist;
	}

}
