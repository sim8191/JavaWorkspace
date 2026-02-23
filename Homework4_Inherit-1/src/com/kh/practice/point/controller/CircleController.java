package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle cc = new Circle();
	// pi => Math.PI
	public String calcArea(int x, int y, int radius) {
		cc.setX(x);
		cc.setY(y);
		cc.setRadius(radius);
		return "면적 : " + cc +" / "+(Math.PI * radius * radius);
	}
	
	public String calcCircum(int x, int y, int radius) {
		cc = new Circle(x, y, radius); // 필드 초기화.
		return "둘레 : " + cc.toString()+" / "+(Math.PI * radius * 2);
		//cc.toString()이거나 c나 같은거 나옴 1월 5일 2시34분 
	}
}
