package com.kh.practice.generics.view;

import java.util.Scanner;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("======마트======");
		while (true) {
			System.out.println("******* 메인 메뉴 ******* \r\n" + "  1. 직원메뉴  \r\n" + "  2. 손님 메뉴  //  \r\n"
					+ "  9. 종료   // “프로그램 종료.” 출력 후 main()으로 리턴 \r\n" + "  메뉴 번호 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				adminMenu();
				break;
			}
			case 2: {
				customerMenu();
				break;
			}
			case 9: {
				System.out.println("프로그램 종료.");
				return;
			}
			default: {
				System.out.println("잘못된 입력");
			}

			}
		}

	}

	public void adminMenu() {
		while (true) {
			System.out.println("******* 직원 메뉴 ******* \r\n"
					+ "  1. 새 농산물 추가\r\n"
					+ "  2. 종류 삭제\r\n"
					+ "  3. 수량 수정\r\n"
					+ "  4. 농산물 목록 \r\n"
					+ "  9. 메인으로 돌아가기 \r\n"
					+ "  메뉴 번호 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				addNewKind();
				break;
			}
			case 2: {
				removeKind();
				break;
			}
			case 3: {
				changeAmount();
				break;
			}
			case 4: {
				 printFarm();
				 break;
			}
			case 9: {
				mainMenu();
				break;
			}
			default: {
				System.out.println("잘못된 입력");
			}

			}
		}

	}

	public void customerMenu() {
		System.out.println("현재 마트 농산물 수량");
		printFarm();
		while (true) {
			System.out.println("******* 고객 메뉴 ******* \r\n" + "  1. 농산물 사기 \r\n"
					+ "  2. 농산물 빼기 \r\n" + "  3. 구입한 농산물 보기\r\n"
					+ "  9. 메인으로 돌아가기\r\n" + "  메뉴 번호 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				buyFarm();
				break;
			}
			case 2: {
				removeFarm();
				break;
			}
			case 3: {
				printBuyFarm();
				break;
			}
			case 9: {
				mainMenu();
				return;
			}
			default: {
				System.out.println("잘못된 입력");
			}
			}

		}
	}

	public void addNewKind() {

	}

	public void removeKind() {

	}

	public void changeAmount() {

	}

	public void printFarm() {

	}

	public void buyFarm() {

	}

	public void removeFarm() {

	}

	public void printBuyFarm() {

	}
}
