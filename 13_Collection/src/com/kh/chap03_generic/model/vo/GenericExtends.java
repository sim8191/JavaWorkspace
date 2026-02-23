package com.kh.chap03_generic.model.vo;

public class GenericExtends <T extends Parent>{
	private T type;
	
	public void printing() {
//		((Parent)type).doPrint();//올바르지 않은 제네릭 사용 방식
		
		// doPrint()메서드를 가지고 있는 parent계열 클래스로 T의 범위를 제한하고 싶다면
		// extends를 사용.
		type.doPrint();
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
}
