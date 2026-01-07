package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		boolean bl = true;
		if(!((year%4==0)&&!(year%100==0))) {
			bl = false;
		}
		return bl;
	}
	
	public long leapDate(Calendar c) {
		Calendar now = Calendar.getInstance(); // 현재시간
		long num1 = now.getTimeInMillis();
//		Calendar cal2 = new GregorianCalendar(2019, 2, 1,0,0,0);
//		long num1 = cal2.getTimeInMillis();
		long num2 = c.getTimeInMillis();
		return (num1 - num2)/1000/60/60/24;
		// 여기에 반복문을 만들어야함
	}

	
		
}
