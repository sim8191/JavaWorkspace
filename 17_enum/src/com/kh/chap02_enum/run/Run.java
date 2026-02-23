package com.kh.chap02_enum.run;

import com.kh.chap02_enum.model._enum.CarColor;

public class Run {
	public static void main(String[] args) {
		System.out.println(CarColor.BLACK);
		System.out.println(CarColor.BLACK.getColor());
		System.out.println(CarColor.valueOf("BLACK"));// CarColor.BLACK의 상수값을 가져온거임
		System.out.println(CarColor.valueOf(1));
//		System.out.println(CarColor.valueOf(10)); // 에러나서 CarColor 의 valueOf 호출
		CarColor.RED.printTest();
		
	}
	
}
