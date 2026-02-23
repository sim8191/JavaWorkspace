package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

//정삼각형 기능 담당
public class TriangleController {
	Shape sp = new Shape();
	
	public double calcArea(double height, double width) {
		double tcalcArea = (width*height)/2;
		sp.setHeight(height);
		sp.setWhidh(width);
		sp.setType(3);
		return tcalcArea; 
	}
	
	public void paintColor(String color) {
		sp.setColor(color);
	}
	
	public String print() {
		String tPrint = "삼각형 , height : "
				+sp.getHeight()+", whide : "+sp.getWhidh()+", 색상 : "+sp.information();
		return tPrint;
	}
}
