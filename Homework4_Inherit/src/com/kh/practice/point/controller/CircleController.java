package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle cc = new Circle();
	// pi => Math.PI
	public String calcArea(int x, int y, int radiuse) {
		cc = new Circle(x, y, radiuse);
		return cc.toString()+" / "+(Math.PI * radiuse * radiuse);
	}
	
	public String calcCircum(int x, int y, int radiuse) {
		cc = new Circle(x, y, radiuse);
		return cc.toString()+" / "+(Math.PI * radiuse * 2);
	}
}
