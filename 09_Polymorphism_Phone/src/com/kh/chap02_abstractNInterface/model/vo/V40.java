package com.kh.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen  {
	public  V40() {
		
	}
	public String makeCall(){
		return "";
	}
	public String takeCall(){
		
		return "";
	}
	public String picture(){return "";}
	public String charge(){return "";}
	public String touch(){
		return "";
	}
	public boolean bluetoothPen(){
		
		return false;
	}
	
	@Override
	public String printinformation() {
		// TODO Auto-generated method stub
		return null;
	}
}
