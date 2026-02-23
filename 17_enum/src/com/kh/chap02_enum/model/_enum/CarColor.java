package com.kh.chap02_enum.model._enum;

import java.util.Arrays;

public enum CarColor {
//	public static final Color BLACK = new Color(0, "black");
	/*
	 * Enum -> Enumeration(열거)/ 클래스 내부의 상수값들을 열거하였기 때문에 enum
	 * 		   이라는 명칭을 쓴다.
	 *         객체단위 상수값들을 간결하게 다루기 위해 고안되었다.
	 * */
//	BLACK,
//	WHITE,
//	RED;
//	private CarColor(int color, String name)를 쓰는순간 아래처럼 변경해야함
	BLACK(0, "black"){//중괄호 열고 닷는것이 익명 클래스 생성하는 거임
		@Override
		public void printTest() {
			System.out.println("검은색 입니다");
		}
	},
	WHITE(1, "white"){
		@Override
		public void printTest() {
			System.out.println("하얀색 입니다.");
		}
	},
	RED(2, "red"){
		public void printTest() {
			System.out.println("빨간색입니다.");
		}
	};
	
	private int color;
	private String name;
	
	private CarColor(int color, String name) {// private으로 쓴이유 여기서만 써야하기 때문
		this.color = color;
		this.name = name;
	}

	//get만 쓰는 이유는 다른데서 값을 변경하는 것을 막을려고
	public final int getColor() {
		return color;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	
	// enum만의 기능
	// - enum내부의 상수값들을 배열로 모아서 반환해주는 메서드
	//   values()
	public static CarColor valueOf(int color) {
//		values();// 반환형이 배열임
		return Arrays
		.stream(values())
		.filter( _enum -> _enum.color == color)
		.findFirst().orElseThrow(() -> new RuntimeException("일치하는 컬러가 없습니다."));
		
	}
	
	
	public abstract void printTest();
	
	
}
