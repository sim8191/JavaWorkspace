package com.kh.practice.file.view;

import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;

import com.kh.practice.file.controller.FileController;

// menu -> Controller -> Dao로 호출
public class FileMenu {
	
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	public void mainMenu() {
		while (true) {
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			int menu = sc.nextInt();
			switch (menu) {
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
		StringBuilder sb = new StringBuilder();
//		while(true){
//			System.out.println("파일에 저장할 내용을 입력");
//			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
//			String name;
//			System.out.println("내용 : ");
//			String str = sc.nextLine(); sc.nextLine();
//			
//			if(str.equals("ex끝it") ) {
//				break;
//			}
//			sb.append(str); // 내가 입력한 값을 StringBuilder에 기록
//		}
		sb = addText();
		
		while(true) {
			System.out.println("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();
			sc.nextLine();
			
			boolean isFileExist = fc.checkName(fileName);
			
			if(isFileExist) {
				fc.fileSave(fileName, sb);
				return;
			}
			
			System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/m) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			if(ch == 'Y') {
				fc.fileSave(fileName, sb);
			}else {
				continue;
			}
			break;
		}
		
	}
	
	public void fileOpen(){
		System.out.println("열 파일명 : ");
		String fileName = sc.nextLine(); sc.nextLine();
		
		boolean exists = fc.checkName(fileName);
		
		if(!exists){
			System.out.println("존재하지 않는 파일입니다.");
			return;
//			throw new RuntimeException("존재하지 않는 파일입니다.");
		}
		System.out.println(fc.fileOpen(fileName));
	}
	
	public void fileEdit(){
		StringBuilder sb = new StringBuilder();
		
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		boolean exists = fc.checkName(fileName);
		
		if(!exists) {
			System.out.println("없는 파일입니다.");
			return;
		}
		
		sb = addText();
		fc.fileEdit(fileName, sb);
		
		
	}
	
	private StringBuilder addText() {
		StringBuilder sb = new StringBuilder();
		while(true){
			System.out.println("파일에 저장할 내용을 입력");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			String name;
			System.out.println("내용 : ");
			String str = sc.nextLine(); sc.nextLine();
			
			if(str.equals("ex끝it") ) {
				break;
			}
			sb.append(str+"\n"); // 내가 입력한 값을 StringBuilder에 기록
		}
		return sb;
		
	}
	
	
}
