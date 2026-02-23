package com.kh.example.practice2.model.vo;

public class Circle {
	// 실습 2번
	final private double PI = 3.14;//대문자는 final
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {//머리
		//몸통
		++radius;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	public void getAreaOfCircle() {
		// 원둘레
		double j = 2*PI*(radius); 
		System.out.println(j);
	}
	public void getSizeOfCircle() {
		// 원넓이
		double i = PI*(radius)*(radius);
		System.out.println(i);
	}
}
