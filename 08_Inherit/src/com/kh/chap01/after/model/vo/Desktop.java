package com.kh.chap01.after.model.vo;

//extends Product : Product으로 부터 상속 받겠다.
public class Desktop extends Product {
	
	private boolean allInOne;

	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName
			, int prict, boolean allInOne) {
		// this : 연제 객체, super : 부모 객체
		// 상속 메모리 구조 보여주고
		// 부모객체 필드의 값 초기화 하기
		// 방법 1. 자식클래스에서 부모클래스의 필드에 접근 가능하도록
		// 접근제한자를 수정.(protected)
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.prict = prict;
//		this.allInOne = allInOne;
		// 1번 방법은 그닥 좋은방법은 아님
		
		// 방법 2. 부모클래스에 있는 setter 메서드 사용
//		super.setBrand(brand);
//		setpCode(pCode);
//		setpName(pName);
//		setPrict(prict);
		
		// 방법 3번. 부모생성자 호출하기.
		// 가장많이 쓰는 방법
		// super : 부모의 주소값이 담긴 변수
		super(brand, pCode, pName, prict);
		this.allInOne = allInOne;
		//this가 내포되어 있는 것 자기자신의 주소값
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 겍체의 정보를 문자열로 반환하는 메서드.
	// 오버라이딩 : 부모클래스와 자식클래스의 메서드명이 동일한 케이스.
	public String information() {
//		return getBrand()+", "+getpCode()+", "+getpName()
//		+", "+getPrice()+", "+isAllInOne();
		return super.information() + ", " + allInOne;
	}
	
}
