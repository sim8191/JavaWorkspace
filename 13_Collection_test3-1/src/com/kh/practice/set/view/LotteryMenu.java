package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private LotteryController lc = new LotteryController();
	Lottery lty = new Lottery();
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		while(true) {
			System.out.print("1. 추첨 대상 추가\r\n"
					+ "2. 추첨 대상 삭제 \r\n"
					+ "3. 당첨 대상 확인 \r\n"
					+ "4. 정렬된 당첨 대상 확인 \r\n"
					+ "5. 당첨 대상 검색 \r\n"
					+ "9. 종료 \r\n"
					+ "메뉴 번호 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				insertObject();
				break;
			}case 2: {
				deleteObject();
				break;
			}case 3: {
				winObject();
				break;
			}case 4: {
				sortedWinObject();
				break;
			}case 5: {
				searchWinner();
				break;
			}case 9: {
				System.out.println("프로그램 종료.");
				return;
			}
			default:
				System.out.println("잘몯 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void insertObject() {
		System.out.println("추가할 추첨 대상 수 : ");
		int count = sc.nextInt();
		
//		boolean[] barr = new boolean[count];
		for(int i = 0;i<count;i++) {
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("핸드폰 번호('-'빼고) : ");
			String phone = sc.next();
			
//			barr[i] = lc.insertObject(new Lottery(name, phone));
//			if(barr[i] == false) {
			Lottery l = new Lottery(name, phone);
			boolean result = lc.insertObject(l);
			if(!result) {
				System.out.println("중복된 정보입니다. 다시 입려개주세요");
				i--;
			}
			
		}
		System.out.println(count+"명 추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		System.out.println("삭제할 대상의 정보");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		
		boolean tf = lc.deleteObject(new Lottery(name, phone));
		if(tf) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("해당 객체가 없음");
		}
	}
	public void winObject() {
		Set s = lc.winObject();
		System.out.println(s);
		
	}
	
	public void  sortedWinObject() {
		TreeSet<Lottery> set = lc.sortedWinObject();
		Iterator<Lottery> l = set.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}
	
	public void searchWinner() {
		System.out.println("검색할 당첨 대상");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);
		if(result) {
			System.out.println("축하");
		}else {
			System.out.println("다음기회에");
		}
		
	}
	
}
