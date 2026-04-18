package com.entity;

public class Book {

private int id;
	
	private String name;
	
	private double price;
	
	private String author;
	
	private int qnty;
	
	private String mfgDate;
	
	private String expDate;

	public Book(int id, String name, double price, String author, int qnty, String mfgDate, String expDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.qnty = qnty;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public int getQnty() {
		return qnty;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	@Override
	public String toString() {
		return "BookMain [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", qnty=" + qnty
				+ ", mfgDate=" + mfgDate + ", expDate=" + expDate + "]";
	}
}
