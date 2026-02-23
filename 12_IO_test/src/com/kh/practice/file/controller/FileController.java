package com.kh.practice.file.controller;

import java.io.File;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	FileDAO fd = new FileDAO();
	public boolean checkName(String file) {
		File aaa = new File(file);;
		return aaa.exists();//exists()이함수가 file이 있다면 true 없다면 false를 반환
	}
	
	public void fileSave(String file, StringBuilder sb) {
		
	}
	
	public StringBuilder fileOpen(String file) {
		return null;
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		 
	}
}
