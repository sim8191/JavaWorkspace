package com.kh.chap01.after.model.vo;

public class SmartPhone extends Product{
	private String mobileAgency;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName
			, int prict, String mobileAgency) {
		super(brand, pCode, pName, prict);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	@Override
	public String information() {
		return super.information() + ", " + mobileAgency;
	}
	
}
