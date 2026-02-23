package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		
		return true;
	}
	public void fileSave(String file, String s) {
		FileWriter fw = null; 
		try {
			fw = new FileWriter(file, true);
			fw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public StringBuilder fileOpen(String file) {
		
		return null;
	}
	public void fileEdit(String file, String s){
		
	}
}

