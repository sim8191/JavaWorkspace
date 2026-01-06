package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	Member mem = new Member();
	Book[] bList = new Book[5];
	
	public void insertMemver(Member mem) {
		
	}
	
	public Member myinfo() {
		System.out.println(mem.toString());
		
		return null; 
	}
	
	public Book[] selectAll() {
		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		
		return bList;
	}
	
	public int rentBook(int index) {
	
		return 0;
	}
	
}
