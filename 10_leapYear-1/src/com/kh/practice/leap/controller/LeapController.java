package com.kh.practice.leap.controller;

import java.time.LocalDate;
import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		boolean bl = true;
		if(!((year%4==0)&&!(year%100==0))) {
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
			if(!((i%4==0)&&!(i%100==0))) {
				totalDays += 365;
			}else {
				totalDays += 366;
			}
		}
		
		if(!((year%4==0)&&!(year%100==0))) {
			if(month>2) {
				totalDays++;
			}
		}
		totalDays += Day;
		return totalDays;
	}

	
		
}
