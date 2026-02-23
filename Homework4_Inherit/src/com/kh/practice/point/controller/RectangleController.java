package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle rp = new Rectangle();
	public String calcArea(int x, int y, int height, int width) {
		rp = new Rectangle(x, y, height, width);
		return rp.toString()+" / " + (height*width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		rp = new Rectangle(x, y, height, width);
		return rp.toString()+" / " + (2*(height+width));
	}
	
}
