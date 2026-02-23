package com.kh.chap02_string.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C_StringTokenizer {
	public void method() {
		String str = "Java,Oracle,JDBC,HTML,Spring";
		
		// 구분자를 제시해서 문자열을 구분자 기준으로 분리 시키는 방법
		// 방법 1. 문자열.split(구분자) : String[]
		//  - 분리된 분자열들을 String[]에 담아서 관리해주는 메서드
		String[] arr = str.split(",");//[Java, Oracle, JDBC, HTML, Spring]
	
		System.out.println(Arrays.toString(arr));
		// 단점 성능에 좋지않음
		// 문자열 길이에 따라서 성능이 달라짐(속도록 메모리도 비효율적)
		
		
		// 방법2. 분리된 각각의 문자열들을 토큰으로 취급하여 관리하는 방법(메모리친화적)
		//      StringTokenizer stn = new StringTokenizer(문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열의 개수 : " + stn.countTokens());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		//System.out.println(stn.nextToken());
		// NoSuchElementException
		// 현재 남아있는 토큰의 갯수범위를 벗어나면 에러 발생.
//		while(stn.countTokens()>0) { 
		while(stn.hasMoreTokens()) { // stn에 토큰이 1개이상 있는 경우 true/ false
			System.out.println(stn.nextToken());
		}
		//단점 
		// 특정부분만을 받아올수는 없음
	
	}
}
