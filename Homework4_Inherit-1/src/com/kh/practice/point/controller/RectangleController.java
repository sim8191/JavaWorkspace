package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle rtg = new Rectangle();
	public String calcArea(int x, int y, int height, int width) {
		rtg = new Rectangle(x, y, height, width);
		return rtg.toString()+" / " + (height*width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		rtg = new Rectangle(x, y, height, width);
		return rtg.toString()+" / " + (2*(height+width));
	}
	
}
