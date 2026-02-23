package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	Member mb = new Member();
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	public void mainMenu() {
		while(true){
			System.out.println("1. 회원가입 \r\n"
					+ "2. 로그인 \r\n"
					+ "3. 같은 이름 회원 찾기 \r\n"
					+ "9. 종료 \r\n"
					+ "메뉴 번호 선택 :");
			int num = sc.nextInt();
			
			switch (num) {
			case 1: {
				 joinMembership();
				break;
			}case 2: {
				 logIn();
				break;
			}case 3: {
				sameName();
				return;
			}case 9: {
				System.out.println("종료");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	
	public void memberMenu() {
		while(true){
			System.out.println("1. 비밀번호 바꾸기 \r\n"
					+ "2. 이름 바꾸기 \r\n"
					+ "3. 로그아웃   \r\n"
					+ "메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1: {
				changePassword();
				break;
			}case 2: {
				changeName();
				break;
			}case 3: {
				System.out.println("종료");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	
	public void joinMembership() {
		System.out.println("id입력 : ");
		String ID = sc.next();
		System.out.println("password입력 : ");
		String password = sc.next();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		boolean result = mc.joinMembership(ID,new Member(name, password));
		if(result) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		}else {
			System.out.println("중복된 아이디 입니다. 다시 입력해주세요");
			joinMembership();
		}
	}
	
	public void logIn() {
		
	}
	
	public void changePassword() {
		System.out.println("비밀 번호를 바꿀 id입력 : ");
		String ID = sc.next();
		
	}
	public void changeName() {
		
	}
	public void sameName() {
		mc.sameName(null);
	}
}
