package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		while(true){
			System.out.println("1. 새 도서 추가   \r\n"
					+ "2. 도서 전체 조회  \r\n"
					+ "3. 도서 검색 조회  \r\n"
					+ "4. 도서 삭제   \r\n"
					+ "5. 도서 명 오름차순 정렬  \r\n"
					+ "9. 종료    \r\n"
					+ "메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1: {
				insertBook();
				break;
			}case 2: {
				selectList();
				break;
			}case 3: {
				searchBook();
				break;
			}case 4: {
				deleteBook();
				break;
			}case 5: {
				ascBook();
				break;
			}case 9: {
				System.out.println("종료");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	public void insertBook() {
		Book bk = new Book();
		System.out.println("도서명 : ");
		String title = sc.next();
		System.out.println("저자명 : ");
		String author = sc.next();
		String category = " ";
		while(true) {
			System.out.println("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
			int categorynum = sc.nextInt();
			switch (categorynum) {
			case 1: {
				category = "인문";
				break;
			}case 2: {
				category = "자연과학";
				break;
			}case 3: {
				category = "의료";
				break;
			}case 4: {
				category = "기타";
				break;
			}
			default: {
				System.out.println("잘못된 입력");
				continue;
			}
			}
			break;
		}
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		bc.insertBook(new Book(title, author, category, price));
		
	}

	public void selectList() {
		System.out.println(bc.selectList()+"\n");
	}

	public void searchBook() {
		System.out.println("검색 키워드 : ");
		String keyword = sc.next();
		ArrayList al = bc.searchBook(keyword);
		if(al == null) {
			System.out.println("키워드 가 없음");
		}else {
			System.out.println(al);
		}
	}

	public void deleteBook() {

	}

	public void ascBook() {

	}
}
