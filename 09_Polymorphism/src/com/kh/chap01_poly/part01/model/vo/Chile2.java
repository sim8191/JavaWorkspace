package com.kh.chap01_poly.part01.model.vo;

public class Chile2 extends Parent {
	public Chile2() {
		
	}

	public Chile2(int x, int y) {
		super(x, y);
	}
	
	public void printChild2() {
		System.out.println("child2 메서드");
		
	}
	
	public void print() {
		System.out.println("오버리이딩한 자식메서드2");
	}
	
}
