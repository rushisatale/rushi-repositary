package com.controller;

import java.util.ArrayList;

import com.entity.Book;
import com.service.BookService;

public class BookController {

	
	BookService service = new BookService();
	
	public String insertBook(Book book) {
		
		return service.insertBook(book);
	}
	
	public String updateBook(Book book) {
		
		return service.updateBook(book);
	}
	
	public String deleteBook(int id) {
		
		return service.deleteBook(id);
	}
	
	public String deleteAll() {
		
		return service.deleteAll();
	}
	
	public Book getBook(int id) {
		return service.getBook(id);
	}
	
	public ArrayList<Book> getAllBook(){
		
		return service.getAllBook();
	}
}
