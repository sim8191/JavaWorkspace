package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();// exists()이함수가 file이 있다면 true 없다면 false를 반환
	}

	public void fileSave(String file, String s) {
		// FileWriter(한글지원을 함)
		FileWriter fw = null;

		try {
			// 파일 생성
			fw = new FileWriter(file);
			fw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public StringBuilder fileOpen(String file) {
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			fr = new FileReader(file);
			
			int value = 0;
			while((value = fr.read())!= -1) {
				sb.append((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return sb;
	}

	public void fileEdit(String file, String s) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			fw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
