package com.kh.practice.snack.controller;

public class Snack {
	//- : private
	private String kind;//종료
	private String name;//이름
	private String flavor;//맛
	private int numOf;//개수
	private int price;//개수
	
	public Snack() {
		
	}
	
	public Snack(String kind,String name,String flavor
			,int numOf,int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String infomation() {
		String result = kind+"("+name+" - "+flavor+") "+numOf
				+"개" + price+"원";
		return result;
	}
	
	// getter / setter들
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return this.kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String setName() {
		return this.name;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getFlavor() {
		return this.flavor;
	}
	
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getNumOf() {
		return this.numOf;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}
