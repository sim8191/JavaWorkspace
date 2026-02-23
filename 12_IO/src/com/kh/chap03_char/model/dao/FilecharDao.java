package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilecharDao {
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2byte단위로 출력하는 스트림
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt", true); // 파일이 없다면 생성, 이어쓰기.
			fw.write("재밌는 io시간.....\n");
			fw.write("잘 즐기고 계신가요...\n");
			fw.write(' ');
			
			char[] arr = {'a','p','p','l','e'};
			fw.write(arr);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {//4시 22분
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();//이거는 필수로 작성해야함
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
