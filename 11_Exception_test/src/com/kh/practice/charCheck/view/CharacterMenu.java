package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();
	
	public void menu() {
		System.out.println("입력할 문자열 : ");
		String str = sc.nextLine();
		
		try {
			int count = cc.countAlpha(str);
			System.out.println(str + "에 포함된 영문자 개수 " + count);
		}catch(CharCheckException e){
			e.printStackTrace();
		}
		
	}
}
