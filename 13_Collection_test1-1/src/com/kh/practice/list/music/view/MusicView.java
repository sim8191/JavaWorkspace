package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.model.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
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
			sc.nextLine();
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
		System.out.println("====마지막 위치에 곡 추가====");
		System.out.println("곡 명 : ");
		String title = sc.next();
		System.out.println("가수명 : ");
		String singer = sc.next();
		int result = mc.addList(new Music(title,singer));
		
		if(result == 1) {
			System.out.println("추가 성공");			
		}else {
			System.out.println("추가 실패");	
		}
	}
	
	public void addAtZero() {
		System.out.println("====첫 위치에 곡 추가====");
		System.out.println("곡 명 : ");
		String title = sc.next();
		System.out.println("가수명 : ");
		String singer = sc.next();
		int result = mc.addAtZero(new Music(title,singer));
		
		if(result == 1) {
			System.out.println("추가 성공");			
		}else {
			System.out.println("추가 실패");	
		}
	}
	
	public void printAll() {
		System.out.println("====전체 곡 출력====");
		List list = mc.printAll();
		System.out.println(list);
	}
	
	public void searchMusic() {
		System.out.println("===특정 곡 검색===");
		System.out.println("검색할 곡 명 : ");
		String title = sc.next();
		Music m = mc.searchMusic(title);
		
		if(m == null) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			System.out.println("검색한 곡은" + "("+m.getTitle()+", "+
					m.getSinger()+") 입니다.");
		}
		
	}
	
	public void removeMusic(){
		System.out.println("===특정 곡 삭제===");
		System.out.println("삭제할 곡 명 : ");
		String title = sc.next();
		
		Music m = mc.removeMusic(title);
		
		if(m == null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println("삭제한 곡은" + "("+m.getTitle()+", "+
					m.getSinger()+") 입니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("===특정 곡 수정===");
		System.out.println("검색할 곡 명 : ");
		String title = sc.next();
		
		System.out.println("수정할 곡 명 : ");
		String title2 = sc.next();
		System.out.println("수정할 가수명 : ");
		String singer = sc.next();
		Music m = mc.setMusic(title, new Music(title2, singer));
		
		if(m == null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(m+"수정하였습니다.");
		}
		
	}
	
	public void ascTitle(){
		System.out.println("===노래 명 내림차순 정렬===");
		int result = mc.ascTitle();
		if(result == 1) {
			System.out.println("정렬 성공");			
		}else {
			System.out.println("정렬 실패");
		}
	}
	
	public void descSinger() {
		System.out.println("===가수 명 내림차순 정렬===");
		int result = mc.descSinger();
		if(result == 1) {
			System.out.println("정렬 성공");			
		}else {
			System.out.println("정렬 실패");
		}
		
	}
	
}
