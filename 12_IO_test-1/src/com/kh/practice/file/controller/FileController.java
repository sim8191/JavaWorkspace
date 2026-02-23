package com.kh.practice.file.controller;

import java.io.File;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
//		String result = sb.toString();
//		fd.fileSave(file,result);
		fd.fileSave(file,sb.toString());
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		 fd.fileEdit(file, sb.toString());
	}
}

