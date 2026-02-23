package com.kh.chap02_byte.model.vo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
//  - 데이터에 연결하기 위한 용도의 클래스를 관리하는 패키지
public class FileByteDao {
	// 자바프로그램에서 외부매체로 데이터를 출력하는 프로그램
	public void fileSave() {
//		FileOutputStream : 파일로 데이터를 1byte단위로 출력하는 스트림
		
//		작성하는 방법
//		new FileOutPutStream(입출력하파일객체 혹은 파일명);
		FileOutputStream fout = null;
		try {
//			FileOutputStream fout = new FileOutputStream("a_byte.txt");
			// 1. FileOutStream 객체 생성 == 입출력할 파일과 연결
			//  - 매개변수로 전달한 파일이 존재하지 않으면 해당파일 새로 생성하면서 통로가 개설된다.
			//  - 존재하는 파일이면 즉시 통로 연결
			//  - true 미작성시 : 기존에 해당 파일에 내용으 덮어씌우기방식으로 출력
			//  - true 작성시 : 이어쓰기방식으로 출력한다.
//			FileOutputStream fout = new FileOutputStream("a_byte.txt");
//			FileOutputStream fout = new FileOutputStream(new File("a_byte.txt"));
//			FileOutputStream fout = new FileOutputStream(new File("a_byte.txt"), true);
			fout = new FileOutputStream(new File("a_byte.txt"));//finally에서 오류나서 try밖에서 선언한거임
			// 왜 오류가 나냐 try에서 선언하면 try내부에서만 사용가능하니까(Scanner를 class에서 선언하는 이유랑 같은거)
			
			// 2. 연졀통로로 데이터 출력
			//     - write() : -128(사실상 0) ~ 127까지의 숫자만 사용가능. 즉, 영문자만제대로 표현될 수 이싿.
			fout.write(65); // A
			fout.write(66); // B
			fout.write('민'); // 일반 바이트스트림으로는 한글과 같은 유니코드문자는 표현이 불가능한다.
			
			byte[] bArr = {99,100,101};
			fout.write(bArr); // cde
			
//			// 3. 다 쓴 스트림 반납하기
//			fout.close();// 여기에 작성하면 경우에따라 반납이 안될수 있음
		} catch (FileNotFoundException e) {//해당파일이 없으면 오류
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 어떤 예외가 발생앴든 안했든, 반드시 실행하는 구문을 작성하는 블럭
			// 3. 다 쓴 스트림 반납하기
			try {
				fout.close(); // 에러가 났든 아니든 무조건 자원 반납가능
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 자바프로그램으로 데이터를 입력받는 기능
	public void fileRead(){
		FileInputStream fin = null; // try 블럭과 finally에서 동시에 사용
		
		// 1. 입출력객체생성하기
		try {
			// 1. 입출력객체생성하기(많이 사용될 친구)
			fin = new FileInputStream("a_byte.txt"); // 반드시 존재하는 파일제시
			
			// 2. 입력매체로부터 데이터 읽어오기
			// read() : int
			//  - 1byte씩 데이터를 읽어온다.
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());// 더이상 읽은 값이 없는 경우 -1반환
			
//			int value = fin.read();
//			while(value != -1) {
//				System.out.println(value);
//				value = fin.read();
//			}
			
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	
	
}
