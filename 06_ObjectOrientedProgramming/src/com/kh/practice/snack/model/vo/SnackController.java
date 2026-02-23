package com.kh.practice.snack.model.vo;

import com.kh.practice.snack.controller.Snack;

//기능 담당
public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {
		
	}
	
	public String saveDate(String kind, String name, String flavor
			,int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장완료";
	}
	
	public String confirmData() {
		return s.infomation();
	}
}
