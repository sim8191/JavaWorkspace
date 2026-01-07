package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();
	public LeapView() {
		Calendar cal1 = new GregorianCalendar();
		int year = cal1.get(Calendar.YEAR);
//		int year = 2019;
		boolean bl= lc.isLeapYear(year);
		String str = "평년";
		if(bl == true) {
			str = "윤년";
		}
		System.out.println(year + "년은 " + str + "입니다.");
		
		
		Calendar dDay = new GregorianCalendar(1,1,1);
		long day = lc.leapDate(dDay);
		
		
//		if(bl == true) {
//			day += 366;
//		}else {
//			day += 365;
//		}leapDate에다가 만들어야함
		
		System.out.println("총 날짜 수 : " + day);
	}
}
