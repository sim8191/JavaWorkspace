package com.kh.practice.book.controller;

import java.io.FileWriter;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	BookDAO bd = new BookDAO();
	public void makeFile(){
		try {
			FileWriter fw = new FileWriter("testfile.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileSave(Book[] bArr){
		bd.fileSave(bArr);
	}
	public Book[] fileRead(){
		return bd.fileRead();
	}
}
