package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainManu() {
		while (true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				tokenMenu();
				break;
			}case 2: {
				inputMenu();
				break;
			}case 3: {
				System.out.println("프로그램 종료");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 저리전 글자 : " + str);
		System.out.println("토큰 저리전 개수 : " + str.length());
//		System.out.println(tc.afterToken(str));
		str = tc.afterToken(str);
		System.out.println("터큰 처리후 글자 : " + str);
		System.out.println("터큰 처리후 개수 : " + str.length());
		System.out.println("모두 대문자 "+str.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열 입력 : ");
		String str = sc.next();
//		String str2 = tc.firstCap(str);
//		System.out.println("첫 글자 대문자 : " + str2);
//		System.out.println("찾을 문자 하나 입력 : ");
//		char ch = sc.next().charAt(0);
//		int i = tc.findChar(str, ch);
//		System.out.println(ch+" 문자가 들어간 개수 : "+i);
		
		System.out.println(tc.firstCap(str));
		
		System.out.println("찾을 문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		int i = tc.findChar(str, ch);
		
		System.out.println(ch+" 문자가 들어간 개수 : "+i);
	}
}
