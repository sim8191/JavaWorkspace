package com.kh.hw.shape.model.vo;

// 모양
public class Shape {
	private int type;
	private double height;
	private double whidh;
	private String color = "white";
	
	public Shape(){
		
	}
	
	public Shape(int type,double height,double whidh){
		this.type = type;
		this.height = height;
		this.whidh = whidh;
	}
	
	
	public String information() {
		
		return type+", " +height+ ", "+whidh+", "+color;
	}
	
	//set get
	public void setType(int type) {
		this.type = type;
	}
	public int getType() {
		return this.type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	
	public void setWhidh(double whidh) {
		this.whidh = whidh;
	}
	public double getWhidh() {
		return this.whidh ;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
