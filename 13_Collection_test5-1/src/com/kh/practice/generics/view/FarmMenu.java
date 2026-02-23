package com.kh.practice.generics.view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH 마트 ==========");
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 :");
			int menu = sc.nextInt();

			switch (menu) {
			case 1 -> adminMenu();
			case 2 -> customerMenu();
			case 9 -> {
				System.out.println("종료");
				return;
			}
			}
		}
	}

	public void adminMenu() {
		while (true) {
			System.out.print("******* 직원 메뉴 *******\r\n" + "1. 새 농산물 추가\r\n" + "2. 종류 삭제 \r\n" + "3. 수량 수정 \r\n"
					+ "4. 농산물 목록 \r\n" + "9. 메인으로 돌아가기 \r\n" + "메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1 -> addNewKind();
			case 2 -> removeKind();
			case 3 -> changeAmount();
			case 4 -> printFarm();
			case 9 -> {
				return;
			}
			}

		}

	}

	public void customerMenu() {
		while (true) {
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			System.out.print("******* 고객 메뉴 *******" + "1. 농산물 사기 \r\n" + "2. 농산물 빼기 \r\n" + "3. 구입한 농산물 보기 \r\n"
					+ "9. 메인으로 돌아가기 \r\n" + "메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1 -> buyFarm();
			case 2 -> removeFarm();
			case 3 -> printBuyFarm();
			case 9 -> {
				return;
			}
			}
		}

		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
	}

	public void addNewKind() {
		System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
		int kind = sc.nextInt();
		
		if(!(kind >= 1 && kind <= 3)) {
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
			addNewKind();
			return;
		}
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("수량 : ");
		int amount = sc.nextInt();
		
		Farm f = null;
		if(kind == 1) {
			f = new Fruit("과일", name);
		}else if(kind == 2) {
			f = new Vegetable("야채", name);
		}else {
			f = new Nut("견과류", name);
		}
		
		boolean result = fc.addNewKind(f, amount);
		if(result) {
			System.out.println("새 농산물이 추가되었습니다.");
		}else {
			System.out.println("추가 실패했습니다.. 다시입력해주세요.");
			addNewKind();
			return;
		}
	}

	public void removeKind() {
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			int kind = sc.nextInt();
			
			if(!(kind >= 1 && kind <= 3)) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			Farm f = null;
			if(kind == 1) {
				f = new Fruit("과일", name);
			}else if(kind == 2) {
				f = new Vegetable("야채", name);
			}else {
				f = new Nut("견과류", name);
			}
			
			boolean result = fc.removeKind(f);
			if(result) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			}else {
				System.out.println("추가 실패했습니다.. 다시입력해주세요.");
			}
		}
	}

	public void changeAmount() {
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			int kind = sc.nextInt();
			
			if(!(kind >= 1 && kind <= 3)) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			Farm f = null;
			if(kind == 1) {
				f = new Fruit("과일", name);
			}else if(kind == 2) {
				f = new Vegetable("야채", name);
			}else {
				f = new Nut("견과류", name);
			}
			
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			
			
			boolean result = fc.changeAmount(f, amount);
			if(result) {
				System.out.println("수량이 수정되었습니다..");
				break;
			}else {
				System.out.println("수정 실패했습니다.. 다시입력해주세요.");
			}
		}
	}

	public void printFarm() {
//		fc의 printFarm()의 반환 값을 이용하여 keySet()을 통해
//		“종류 : 이름(n개)” 형식으로 출력
		Map<Farm, Integer> map =fc.printFarm();
		Set<Farm> set =  map.keySet();
		for(Farm f : set) {
			System.out.println(f+"("+map.get(f)+"개)");
		}
		
	}
	
	private Farm inputFarm() {
		Farm f = null;
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			int kind = sc.nextInt();
			
			if(!(kind >= 1 && kind <= 3)) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			if(kind == 1) {
				f = new Fruit("과일", name);
			}else if(kind == 2) {
				f = new Vegetable("야채", name);
			}else {
				f = new Nut("견과류", name);
			}
			break;
		}
		return f;
	}
	
	public void buyFarm() {
		Farm f = inputFarm();
		boolean result = fc.buyFarm(f);
		
		if(result) {
			System.out.println("구매에 성공하였습니다.");
		}else {
			System.out.println("마트에 없는 물건이나거 수량이 없습니다. 다시 입력해주세요.");
			buyFarm();
		}
	}

	public void removeFarm() {
		Farm f = inputFarm();
		
		boolean result = fc.removeFarm(f);
		
		if(result) {
			System.out.println("구매취소에 성공하였습니다.");
		}else {
			System.out.println("구매목록에 없습니다.");
			removeFarm();
		}
		
	}

	public void printBuyFarm() {
//		fc의 printBuyFarm()의 반환 값을 이용하여 Iterator를 통해 출력
		List<Farm> list = fc.printBuyFarm();
		Iterator<Farm> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}









