package com.service;

import java.util.ArrayList;

import com.dao.Bookdao;
import com.entity.Book;
import com.exception.BookNotFoundException;
import com.exception.BooksNotFoundException;
import com.exception.SomethingWentWrong;

public class BookService {
	
	Bookdao dao = new Bookdao();
	
	public String insertBook(Book book) {
		
		
		String msg = dao.insertBook(book);
		
		if(msg==null) {
			
			throw new SomethingWentWrong("check your sql query");
		}
		
		return msg;
	}
	
	public String updateBook(Book book) {
		
		String msg = dao.updateBook(book);
		
		if(msg==null) {
			throw new BookNotFoundException("Book is not available check your id");
		}
		
		return msg;
	}
	
	public String deleteBook(int id) {
		
		String msg= dao.delete(id);
		
		if(msg==null) {
			
			throw new BookNotFoundException("id : "+id+"   Book is not Exist ");
		}
		
		return msg;
	}
	
	public String deleteAll() {
		return dao.deleteAll();
	}

	public Book getBook(int id) {
		
		Book book= dao.getBook(id);
		if(book == null) {
			
			throw new BookNotFoundException("id : "+id+" Book is not Exist ");
		}
		return book;
	}
	
	public ArrayList<Book> getAllBook(){
		
		ArrayList<Book> msg=dao.getAllBook();
		
		if(msg .isEmpty()) {
			
			throw new BooksNotFoundException("There Are no Books");
		}
		
		return msg;
	}
}
