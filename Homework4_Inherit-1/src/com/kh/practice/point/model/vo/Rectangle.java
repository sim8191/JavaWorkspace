package com.kh.practice.point.model.vo;

public class Rectangle extends Point{

	private int whith;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int whith, int height) {
		super(x, y);
		this.whith = whith;
		this.height = height;
	}

	public int getWhith() {
		return whith;
	}

	public void setWhith(int whith) {
		this.whith = whith;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ " " + whith + " " + height;
	}
	
}
