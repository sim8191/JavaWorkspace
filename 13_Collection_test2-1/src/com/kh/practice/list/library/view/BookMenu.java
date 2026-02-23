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
		sc.nextLine();
		System.out.println("도서명 : ");
		String title = sc.nextLine();
		
		System.out.println("저자명 : ");
		String author = sc.nextLine();
		System.out.println("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
		int num = sc.nextInt();
		String[] arr = {"인문","자연과학","의료","기타"};
		System.out.println("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(new Book(title, author, arr[num], price));
		
	}

	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			
		}else {
			for(Book b : bookList) {
				System.out.println(b+"\n");
			}
		}
		
	}

	public void searchBook() {
		System.out.println("검색 키워드 : ");
		String keyword = sc.next();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}
	}

	public void deleteBook() {
		System.out.println("책 제목 : ");
		String title = sc.nextLine();
		sc.nextLine();
		System.out.println("저자명 : ");
		String author = sc.nextLine();
		sc.nextLine();
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("삭제할 도서를 찾았습니다.");
		}else {
			System.out.println("삭제할 도서가 없습니다.");
		}
		
	}

	public void ascBook() {
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
		
	}
}
