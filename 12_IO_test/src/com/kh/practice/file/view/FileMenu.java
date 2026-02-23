package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

// menu -> Controller -> Dao로 호출
public class FileMenu {
	StringBuilder sb = new StringBuilder();
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	public void mainMenu() {
		while (true) {
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				fileSave();
				break;
			}case 2: {
				fileOpen();
				break;
			}case 3: {
				fileEdit();
				break;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
		
		
	}
	
	public void fileSave(){
		System.out.println("파일에 저장할 내용을 입력");
		String name;
		boolean tf;
		while(true){
			System.out.println("내용 : ");
			String str = sc.next();
			if(str.equals("ex끝it")) {
				System.out.println("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
				name = sc.next();
				
				if(fc.checkName(name)) {
					System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
					char ch = sc.next().toUpperCase().charAt(0);
					if(ch == 'N') {
						fc.fileSave(name,sb);
					}
				}
				fc.fileSave(name,sb);
				
			}else {
				sb.append(str);
				continue;
			}
			break;
			
		}
		 
	}
	
	public void fileOpen(){
		System.out.println("찾을 파일명 : ");
		String name;
	}
	
	public void fileEdit(){}
	
}
