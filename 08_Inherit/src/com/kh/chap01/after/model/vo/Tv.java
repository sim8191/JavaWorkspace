package com.kh.chap01.after.model.vo;

public class Tv extends Product{
	private int inch;
	
	public Tv() {}
	
	public Tv(String brand, String pCode, String pName
			, int prict, int inch) {
		super(brand, pCode, pName, prict);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String information() {
		return super.information()+", "+inch;
	}
	
}
