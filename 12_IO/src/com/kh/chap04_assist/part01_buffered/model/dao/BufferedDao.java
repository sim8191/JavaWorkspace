package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	// BufferdWriter/Reader
	
	public void fileSave() {
		BufferedWriter bw = null;
		
		try {
			// 보조스트림이 Writer계열이라면, 기반스트림도 Writer로 생성해주어야 한다.
			bw = new BufferedWriter(new FileWriter(new File("c_buffer.txt")));
			
			bw.write("안녕하시요?");
			bw.newLine(); // 개행문자 넣어주는 메서드
			bw.write("반갑\n");
			
			bw.flush();//해당코드 혹은 클로즈 안하면 파일만 만들어지고 내용은 안들어감
			// 버퍼공간(8kb)을 비워주는 메서드. close()호출시 자동 호출
//			bw.flush();는 그냥 임의 적으로 닫아주는 거임
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();// 현재는 그냥 둘다 적은거임
			}
		}
	}
	
	public void fileRead() {
		/*
		 * try ~ with ~ resource구문(jdk7이상)
		 * 
		 * try(스트림 객체 생성 ; ......){
		 *  // 코드
		 * }catch(예외클래스){
		 * 
		 * }
		 * 스트림겍체를 try에 붙여넣으면 스트림객체 생성 후 해당 블록의 구문이 실행 완료되면 알아서 자원을
		 * 반납(close)한다.
		 * 
		 * */
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));){
			//read : 한글자씩 반환
//			System.out.println(br.readLine());//한줄씩 값을 문자열로 반환
			String value = "";
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
