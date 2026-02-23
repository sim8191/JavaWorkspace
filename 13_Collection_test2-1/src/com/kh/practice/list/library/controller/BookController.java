package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List bookList = new ArrayList();
	
	public BookController() {
		// 초기 값 4개 추가 
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000)); 
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000)); 
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500)); 
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList selectList() {
		return (ArrayList) bookList;
	}
	
	public ArrayList searchBook(String keyword) {
		// 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성 
		ArrayList searchList = new ArrayList();
		
		for(Object o : bookList) {
			Book b = (Book) o;
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		// 삭제된 도서를 담을 Book객체 (Book removeBook) 선언 및 null로 초기화 
		Book removeBook = null;
		
		for(int i = 0; i<bookList.size(); i++) {
			Book b = (Book) bookList.get(i);
			if(b.getTitle().equals(title) && 
					b.getAuthor().equals(author)) {
				removeBook = (Book) bookList.remove(i);
			}
		}
		return removeBook;
	}
	
	public int ascBook() {
		Collections.sort(bookList);
		return 1;
	}
	
	
	
	
	
	
	
	
}

