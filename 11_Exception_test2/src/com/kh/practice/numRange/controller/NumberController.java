package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {
		
	}
//	throws 에러문(혹은 내가만든 에러코드) 를 작성하면 checkDouble코드를 불르는 여기서는 NumberMenu
//	가 try catch 문을 이용해서 에러를 에러 예외 코드를 검수해야함
	public boolean checkDouble(int num1,int num2) throws NumRangeException{
		// 1~100사이가 아니라면 NumRangeException발생, 에러 메시지는 출력 값 참고
		boolean bol = true;
		if(!((num1<=100&&num1>0)&&(num2<=100&&num2>0))){
			// 에러 강제 발생 코드
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
		
		// 매개변수로 들어온 두 값이 1~100 사이 일 때 num1이 num2의 배수면 true,
		// 배수가 아니라면 false 반환
		if(num1%num2==0) {
			bol = true;
		}else {
			bol = false;
		}
		return bol;
//		return num1 % num2 == 0;
	}
}
