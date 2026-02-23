package com.kh.example.practice6.model.vo;

public class Book {
	// 초기화 방법
	//1. 초기화 블록({})
	//2. set,get
	//3. 자동 초기화(jvm)
	//4. 명묵적(명시적) 초기화(title = 0;이런거)
	//5. 인스턴스 초기화
	//초기화 순서 jvm->명시적 초기화 ->인스턴스 초기화,블록 초기화({})-> 생성자를 통한 초기값
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		
	}
	
	public Book(String title,String publisher,String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title,String publisher,String author,
			int price, double discountRate) {
		this(title,publisher,author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println(title+", "+publisher+", "+author+", "+price+", "+discountRate
				+", "+(price-price*discountRate));
	}
	
}
