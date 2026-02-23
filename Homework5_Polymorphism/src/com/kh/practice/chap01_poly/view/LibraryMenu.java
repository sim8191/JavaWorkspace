package com.kh.practice.chap01_poly.view;

import java.util.Scanner;
import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	int num = 0;
	Member mb = new Member();
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().toUpperCase().charAt(0);
		Member mb = new Member(name, age, gender, 0);
		lc.insertMemver(mb);
		
		while(true) {
			System.out.println("===메뉴===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				System.out.println(lc.myinfo()); 
				break;
			}case 2: {
				selectAll();
				break;
			}case 3: {
				searchBook();
				break;
			}case 4: {
				rentBook();
				break;
			}case 9: {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
        for (int i = 0; i < bList.length; i++) {
            // 인덱스와 함께 출력 [cite: 71]
            System.out.println(i + "번 도서 : " + bList[i]);
        }
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.next();
        Book[] searchList = lc.searchBook(keyword);

        for (Book b : searchList) {
            if (b != null) { // null이 아닌 것만 출력
                System.out.println(b);
            }
        }
	}
	
	public void rentBook() {
		selectAll(); // 도서 번호를 알기 위해 전체 조회 먼저 호출 [cite: 80]
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();

        int result = lc.rentBook(index);

        // 결과값에 따른 출력 처리 [cite: 85-88]
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
        }
		
	}
}
