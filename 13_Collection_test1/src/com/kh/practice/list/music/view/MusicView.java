package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.model.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	public void mainMenu() {
		while(true) {
			System.out.print("******* 메인 메뉴 *******\r\n"
					+ "1. 마지막 위치에 곡 추가 \r\n"
					+ "2. 첫 위치에 곡 추가 \r\n"
					+ "3. 전체 곡 목록 출력 \r\n"
					+ "4. 특정 곡 검색 \r\n"
					+ "5. 특정 곡 삭제 \r\n"
					+ "6. 특정 곡 정보 수정 \r\n"
					+ "7. 곡명 오름차순 정렬 \r\n"
					+ "8. 가수명 내림차순 정렬 \r\n"
					+ "9. 종료 \r\n"
					+ "메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1: {
				addList();
				break;
			}case 2: {
				addAtZero();
				break;
			}case 3: {
				printAll();
				break;
			}case 4: {
				searchMusic();
				break;
			}case 5: {
				removeMusic();
				break;
			}case 6: {
				setMusic();
				break;
			}case 7: {
				ascTitle();
				break;
			}case 8: {
				descSinger();
				break;
			}case 9: {
				System.out.println("프로그램 종료");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
		
	}
	
	public void addList() {
		System.out.println("곡 명 : ");
		String title = sc.next();
		System.out.println("가수명 : ");
		String singer = sc.next();
		mc.addList(new Music(title,singer));
		System.out.println("추가 성공");
	}
	
	public void addAtZero() {
		System.out.println("곡 명 : ");
		String title = sc.next();
		System.out.println("가수명 : ");
		String singer = sc.next();
		mc.addAtZero(new Music(title,singer));
		
	}
	
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.println("===특정 곡 검색===");
		System.out.println("검색할 곡 명 : ");
		String title = sc.next();
	}
	
	public void removeMusic(){
		System.out.println("===특정 곡 삭제===");
		System.out.println("삭제할 곡 명 : ");
		String title = sc.next();
	}
	
	public void setMusic() {
		System.out.println("===특정 곡 수정===");
		System.out.println("삭제할 곡 명 : ");
		String title = sc.next();
	}
	
	public void ascTitle(){
		System.out.println("정렬 성공");
	}
	
	public void descSinger() {
		System.out.println("정렬 성공");
	}
	
}
