package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	Member mb = new Member();
	
	int num = 0;
	
	public void mainMenu() {
		do {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			char gender = sc.next().toUpperCase().charAt(0);
			mb = new Member(name, age, gender, 0);
		}while(false);
		
		while(true) {
			System.out.println("===메뉴===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				lc.myinfo();
				break;
			}case 2: {
				selectAll();
				break;
			}case 3: {
				searchBook();
				break;
			}case 4: {
				rentBook();
				break;
			}case 9: {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	
	public void selectAll() {
		lc.selectAll();
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String str = sc.next();
		lc.searchBook(str);
	}
	
	public void rentBook() {
		System.out.println("대여할 도서 번호 : ");
		num = sc.nextInt();
		
	}
}
