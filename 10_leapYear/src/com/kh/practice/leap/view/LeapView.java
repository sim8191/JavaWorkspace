package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();
	public LeapView() {
		Calendar call = Calendar.getInstance(); //현제시간 호출
		int year = call.get(Calendar.YEAR); // 현제 연도만 저장
		boolean bl= lc.isLeapYear(year); // 윤연인지 아닌지
		
		System.out.println(year + "년은 " + (
		bl ? "윤년" : "평년")+ "입니다.");
		
		long day = lc.leapDate(call); //총 날짜수 계산
		
		System.out.println("총 날짜 수 : " + day);
	}
}
