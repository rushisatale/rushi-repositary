package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.connection.BookConnector;
import com.entity.Book;

public class Bookdao {

	Connection con = BookConnector.bookConnection();

//	public void createTable() {
//		
//		try {
//		Statement st = con.createStatement();
//		
//		st.execute("create table books (id int, name varchar(22), price double, author varchar(33), quantity int , mfgDate varchar(22),  expDate varchar(22))");
//		System.out.println("Table is created");
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

	public String insertBook(Book book) {

		try {
			PreparedStatement ps = con.prepareStatement("insert into books values(?,?,?,?,?,?,?)");

			ps.setInt(1, book.getId());
			ps.setString(2, book.getName());
			ps.setDouble(3, book.getPrice());
			ps.setString(4, book.getAuthor());
			ps.setInt(5, book.getQnty());
			ps.setString(6, book.getMfgDate());
			ps.setString(7, book.getExpDate());

			int value = ps.executeUpdate();

			if (value > 0) {

				return "Book inserted";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String updateBook(Book book) {

		try {
			PreparedStatement ps = con.prepareStatement(
					"update books set name=?, price=? ,author=?, quantity=? , mfgDate=? , expDate=? where id =?");

			ps.setString(1, book.getName());
			ps.setDouble(2, book.getPrice());
			ps.setString(3, book.getAuthor());
			ps.setInt(4, book.getQnty());
			ps.setString(5, book.getMfgDate());
			ps.setString(6, book.getExpDate());
			ps.setInt(7, book.getId());

			int value = ps.executeUpdate();

			if (value > 0) {

				return "Book updated";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String delete(int id) {

		try {
			PreparedStatement ps = con.prepareStatement("delete from books where id=?");

			ps.setInt(1, id);

			int value = ps.executeUpdate();

			if (value > 0) {
				return "Book is deleted";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String deleteAll() {

		try {

			PreparedStatement ps = con.prepareStatement("truncate table books");

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "All Books are Deleted";
	}

	public Book getBook(int id) {

		Book book = null;
		try {

			PreparedStatement ps = con.prepareStatement("select * from books where id=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				String auth = rs.getString("author");
				int qty = rs.getInt("quantity");
				String mfg = rs.getString("mfgDate");
				String exp = rs.getString("expDate");

				book = new Book(id1, name, price, auth, qty, mfg, exp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	public ArrayList<Book> getAllBook() {
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		Book book =null;
		
		try {
			
			
			PreparedStatement ps = con.prepareStatement("select * from books");
			
            ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id1=rs.getInt("id");
				String name=rs.getString("name");
				double price=rs.getDouble("price");
				String auth=rs.getString("author");
				int qty=rs.getInt("quantity");
				String mfg=rs.getString("mfgDate");
				String exp=rs.getString("expDate");
			
				book= new Book(id1, name, price, auth, qty, mfg, exp);
			    books.add(book);
		 } 
		}catch (Exception e) {
			e.printStackTrace();
	 }
		
		return books;
	}	
}
