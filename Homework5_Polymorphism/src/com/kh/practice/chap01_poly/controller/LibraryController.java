package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {
	Member mem = new Member();
	Book[] bList = new Book[5];
	{
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }
	public void insertMemver(Member mem) {
		this.mem = mem;
	}
	
	public Member myinfo() {
		return mem; 
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] searchList = new Book[5]; // 결과 담을 배열 생성 [cite: 109]
        int count = 0;

        for (Book b : bList) {
            // 책 제목에 키워드가 포함되어 있는지 확인 [cite: 112]
            if (b.getTitle().contains(keyword)) {
                searchList[count++] = b; // 담고 인덱스 증가
            }
        }
        return searchList;
	}
	
	public int rentBook(int index) {
		int result = 0;
        Book selectBook = bList[index];

        // 1. 만화책인 경우 [cite: 121]
        if (selectBook instanceof AniBook) {
            AniBook ani = (AniBook) selectBook; // 다운캐스팅
            if (mem.getAge() < ani.getAccessAge()) {
                result = 1; // 나이 제한 걸림 [cite: 123]
            }
        }
        // 2. 요리책인 경우 [cite: 125]
        else if (selectBook instanceof CookBook) {
            CookBook cook = (CookBook) selectBook; // 다운캐스팅
            if (cook.isCoupon()) { // 쿠폰이 "유"일 경우
                mem.setCouponCount(mem.getCouponCount() + 1); // 쿠폰 수 증가 [cite: 127]
                result = 2; // 쿠폰 발급 성공 [cite: 129]
            }
        }
        
        return result;
	}
	
}
