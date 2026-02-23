package com.kh.operator;

public class A_Arithmetic {
	
	// 산술연산자
	// 우선순위 1(* / %) 2(+ -)
	public void method() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 13
		System.out.println("num1 - num2 = " + (num1 - num2)); // 7
		System.out.println("num1 * num2 = " + (num1 * num2)); // 30
		System.out.println("num1 / num2 = " + (num1 / num2)); // 3
		System.out.println("num1 % num2 = " + (num1 % num2)); // 1
		//나누기나 나머지 연산할때 0안들어가게 주의
	}
}
