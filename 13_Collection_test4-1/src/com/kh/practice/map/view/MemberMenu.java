package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

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
		String id = sc.next();
		
		System.out.println("password입력 : ");
		String password = sc.next();
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		Member m = new Member(name, password);
		boolean result = mc.joinMembership(id, m);
		
		if(result) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		}else {
			System.out.println("중복된 아이디 입니다. 다시 입력해주세요");
//			joinMembership();
		}
	}
	
	public void logIn() {
		while(true) {
			
			System.out.println("id입력 : ");
			String id = sc.next();
			
			System.out.println("password입력 : ");
			String password = sc.next();
			
			String result = mc.logIn(id, password);
			
			if(result != null) {
				System.out.println(result+"님 환영합니다.");
				break;
			}else {
				System.out.println("틀린 아이디 또는 비번");
			}
		}
	}
	
	public void changePassword() {
		while(true) {
			System.out.println("비밀 번호를 바꿀 id입력 : ");
			String id = sc.next();
			
			System.out.println("password입력 : ");
			String password = sc.next();
			
			System.out.println("변경할 password입력 : ");
			String change = sc.next();
			
			boolean result = mc.changePassword(id, password, change);
			if(result) {
				System.out.println("비밀번호 변경에 성공");
				break;
			}else {
				System.out.println("비밀번호 변경에 실패");
			}
		}
		
	}
	public void changeName() {
		System.out.println("id입력 : ");
		String id = sc.next();
		
		System.out.println("password입력 : ");
		String password = sc.next();
		
		String name = mc.logIn(id, password);
		if(name == null) {
			System.out.println("이름 변경에 실패했습니다.");
			changeName();
			return;
		}
		
		System.out.println("현제 설정된 이름 : " + name);
		
		System.out.println("변경할 이름 : ");
		String changename = sc.next();
		
		mc.changeName(id, changename);
		System.out.println("이름 변경에 성공하였습니다.");
	}
	
	public void sameName() {
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();		
		
		TreeMap<String, String> map = mc.sameName(name);
		Set<Entry<String, String>> entrys = map.entrySet();
		for(Entry<String, String> entry : entrys) {
			System.out.println(entry.getValue()+"-"+entry.getKey());
		}
		
	}
}
