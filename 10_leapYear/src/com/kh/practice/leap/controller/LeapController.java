package com.kh.practice.leap.controller;

import java.time.LocalDate;
import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		boolean bl = true;
		if(!(((year%4==0)&&!(year%100==0)||(year%400 == 0)))) {
			bl = false;
		}
		return bl;
	}
	
	public long leapDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int Day = c.get(Calendar.DATE);
		long totalDays = 0;
		for(int i = 1;i<year;i++) {
			if(isLeapYear(i)) {
				totalDays += 365;
			}else {
				totalDays += 366;
			}
		}
		
		for(int i = 0;i<month;i++) {
			switch (i) {
			case 1, 3, 5, 7, 8, 10, 12: {
				totalDays += 31;
				break;
			}case 4, 6, 9, 11: {
				totalDays += 30;
				break;
			}case 2: {
				totalDays += isLeapYear(c.get(Calendar.YEAR))? 29:30;
				break;
			}
			}
		}
		
		totalDays += Day;
		return totalDays;
	}	
}

