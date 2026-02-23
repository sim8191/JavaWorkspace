package com.kh.chap01.after.model.vo;
/*
 * 세 클래스 모두 공통적으로 가지고 있는 요소들을 정의해둘 클래스
 * */
public class Product {
	//중복 필드
//	private String brand;
//	private String pCode;
//	private String pName;
//	private int prict;
	// protected = 상속관계에서도 접근 가능함
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int prict;
	
	public Product(){
		
	}
	public Product(String brand, String pCode, String pName, int prict){
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.prict = prict;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrict() {
		return prict;
	}
	public void setPrict(int prict) {
		this.prict = prict;
	}
	
	public String information() {
		return brand+","+pCode+","+pName+","+prict;
	}
}
