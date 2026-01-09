package com.kh.practice.book.view;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;

	public BookMenu() {
		bc.makeFile();
	}

	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				fileSave();
				break;
			}case 2: {
				fileRead();
				break;
			}case 9: {
				System.out.println("프로그램 종료");
				return;
			}
			default:
				System.out.println("없는 번호");
			}
		}
	}

	public void fileSave() {
//		SimpleDateFormat// 이거 사용해서 해야함
		System.out.println("도서 명 : ");
		String title = sc.next();
		System.out.println("저자 명 : ");
		String author = sc.nextLine();
		sc.nextLine();
		System.out.println("도서 가격 : ");
		int price = sc.nextInt();
		System.out.println("출판 날짜(yyyy-mm-dd) : ");
//		int day = sc.next("-");
//		String[] dayarr = day.split("-");
//		Calendar date = new GregorianCalendar(, 0, 27);
		System.out.println("할인율 : ");
		double discount = sc.nextDouble();
	}

	public void fileRead() {

	}

}
