package com.kh.practice.point.model.vo;
// 기존 클래스 뒤에 부모 클래스(여기서는 extends Point) 작성하면 상속이됨
public class Circle extends Point {
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		
		return super.toString()+ ", " + radius;
	}
}
