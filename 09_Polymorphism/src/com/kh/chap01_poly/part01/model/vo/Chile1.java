package com.kh.chap01_poly.part01.model.vo;

public class Chile1 extends Parent {
	private int z;
	public Chile1() {
		
	}
	public Chile1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void printChild1() {
		System.out.println("child1 메서드");
	}
	
	
	public void print() {
		System.out.println("오버리이딩한 자식메서드1");
	}
	
}
