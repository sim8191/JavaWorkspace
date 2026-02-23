package com.kh.chap05_class.model.vo;

public class Book {
	//필드
	public String title;
	public String author;
	
	public Book() {
		
	}
	
	// 메서드부
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
