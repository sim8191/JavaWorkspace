package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		//내가 작성한 코드
//		StringTokenizer st = new StringTokenizer(str, " ");
//		int a = st.countTokens();
//		System.out.print("토큰 처리 후 글자 : ");
//		while(st.hasMoreTokens()) { // stn에 토큰이 1개이상 있는 경우 true/ false
//			System.out.print(st.nextToken()+ " ");
//		}
//		return  "\n토큰 처리 후 개수 : " + a;
		
		// 방법1.
		System.out.println(str.replace(" ", ""));
		
		// 방법2. split(" ")을 활용하여 " "기준 문자를 분리하고, 분리된 분자를 다시 하나로 합친다.
		String[] arr = str.split(" ");//[j,a,v,a....]
		String result = "";
		for(String s : arr) {
			result += s;
		}
		System.out.println("split : "+result);
		
		// 방법3. StringTokenizer이용
		StringTokenizer st = new StringTokenizer(str, " ");
		String result2 = "";
		while(st.hasMoreTokens()) {
			result2 += st.nextToken();
		}
		
		return result2;
	}
	
	public String firstCap(String input) {
		// 내가 작성한 코드(안좋은 방법)
		//replace을 사용시ch와 같은 문자는 모두 바꿈
//		String str = input.toUpperCase();
//		char ch = input.charAt(0);
//		char ch2 = str.charAt(0);
//		String rstr = input.replace(ch ,ch2);
//		return rstr;
		// 방법1. substring으로 문자를 하나 빼고, 대문자로 변경후 합쳐서 반환
//		String first = input.substring(0,1).toUpperCase();
//		String other = input.substring(1);
		
		String first = input.substring(0,1).
				toUpperCase().concat(input.substring(1));
		
		return first;
	}
	
	public int findChar(String input, char one) {
		int count=0;
		char[] arr = input.toCharArray();
		
		for(char ch : arr) {
			if(ch == one) {
				count++;
			}
		}
		
		return count;
	}
}
