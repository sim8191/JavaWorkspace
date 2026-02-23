package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.inform();
		Book b2 = new Book("홍길동전","교보","허균");
		b2.inform();
		Book b3 = new Book("홍길동전","교보","허균",10000,0.1);
		b3.inform();
	}

}
