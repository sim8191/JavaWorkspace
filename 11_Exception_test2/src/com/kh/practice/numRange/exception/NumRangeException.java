package com.kh.practice.numRange.exception;

// extends Exception(Exception 상속받으면) 을작성하면 커스텀 오류를 만들수있음
public class NumRangeException extends Exception {
	public NumRangeException() {}
	// 아래의 코드는 에러 발생시 출력할 문자열을 NumberController클레스에 checkDouble에서
//	throw new NumRangeException("1부터 100사이의 값이 아닙니다.");로 받아와서 출력
	public NumRangeException(String msg){
		super(msg);
	}
}
