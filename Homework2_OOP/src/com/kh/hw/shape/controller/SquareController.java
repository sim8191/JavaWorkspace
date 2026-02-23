package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

// 정사각형 기능 담당
public class SquareController {
	Shape sp = new Shape();
	public double calcPerimeter(double height, double width) {
		double Perimeter = width*2+height*2;
		sp.setHeight(height);
		sp.setWhidh(width);
		sp.setType(4);
		return Perimeter; 
	}
	
	public double calcArea(double height, double width) {
		sp.setHeight(height);
		sp.setWhidh(width);
		sp.setType(4);
		return height*width; 
	}
	
	public void paintColor(String color) {
		sp.setColor(color);
	}
	
	public String print() {
		String sPrint = "사각형 , height : "
				+sp.getHeight()+", whide : "+sp.getWhidh()
				+", 색상 : "+sp.information();
		return sPrint;
	}
}
