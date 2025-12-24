package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		
		int[] arran = new int[10];
		// 배열의 길이만큼 반복 진행
		for(int i =0;i<arran.length;i++) {
			arran[i] = 10-i;
		}
		for(int i =0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
		}
		System.out.println(Arrays.toString(arran));
		
		
	}
	
	public void practice2(){
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("잘못된 숫자");
			practice2();
			return;
		}
		
		int[] arran = new int[num];
		
		for(int i = 0;i<num;i++) {
			arran[i] = i+1;
		}
		
		for(int i =0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
		}
		System.out.println(Arrays.toString(arran));
	}
	
	public void practice3() {
		int[] arran = new int[10];
		
		for(int i = 0;i<arran.length;i++) {
			arran[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i =0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
		}
		System.out.println(Arrays.toString(arran));
	}
	
	public void practice4() {
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
//		if(num<0||6<num) {
//			System.out.println("잘못 입력하셨습니다.");
//			practice4();
//			return;
//		}
		
		if(!(num>=0&&6<=num)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		String[] str = {"월","화","수","목","금","토","일"};
		System.out.println(str[num]+"요일");
	}
	
	public void practice5() {
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("잘못된 숫자");
			practice5();
			return;
		}
		
		int i = 0;
		
		int[] arran = new int[num];
		
		while(i<num) {
			System.out.println("배열"+i+"번째 인덱스에 넣을 값 : ");
			arran[i] = sc.nextInt(); 
			i++;
		}
		int sum = 0;
		for(i = 0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
			sum += arran[i];
		}
		
		System.out.println("\n총 합 : "+sum);
		
			
	}
	
	public void practice6() {
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
	        boolean bool = false; 
	        
	        for(int j = 0; j < count; j++) {
	            if(str.charAt(i) == ch[j]) {
	            	bool = true;
	                break; 
	            }
	        }
	        
	        if(!bool) {
	            ch[count] = str.charAt(i);
	            count++;
	        }
	    }
		System.out.print("문자열에 있는 문자 : ");
		for(int j = 0; j < count; j++) {
			System.out.print(ch[j]+" ");
        }
		
		
		System.out.println("\n문자 개수 : " + count);
			
		
		
	}
	
	public void practice7() {
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] chtest = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			chtest[i] = str.charAt(i);
		}
		int count = 0;
		System.out.print(str+"에 "+ch+"가 존재하는 위치 : ");
		for(int i = 0; i < chtest.length; i++) {
			if(chtest[i]==ch) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+ch + " 개수 : " + count);
		
		
	}
	
	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			if(7<i) {
				ch[i] = '*';
			}else {
				ch[i] = str.charAt(i);
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
	}
	
	public void practice9() {
		int[] num = new int[10];
		for(int i = 0;i < num.length;i++) {
			num[i] = (int)(Math.random()*10+1);
		}
		for(int i = 0;i < num.length;i++) {
			System.out.print(num[i] + " ");
		}
		
		int max = 0, min = 10;
		for(int i = 0;i < num.length;i++) {
			if(max<num[i]) {
				max = num[i];
			}
			if(min>num[i]) {
				min = num[i];
			}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice10() {
		int[] num = new int[10];
		int count = 0;
		
		loop1:
		while(count<10) {
			num[count] = (int)(Math.random()*10+1);
			for(int i = 0;i < count;i++) {
				if(num[count]==num[i]) {
					continue loop1;
				}
			}
			count++;
		}
		
		for(int i = 0;i < num.length;i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	public void practice11() {
		System.out.println("정수 : ");
		int num = sc.nextInt();
		if(num < 3||num%2==0) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}
		int[] num2 = new int[num];
		int count = 0;
		for(int i=0;i<num;i++) {
			if(i<((num/2)+1)) {
				num2[i] = ++count;
			}else {
				num2[i] = --count;
			}
		}
		for(int i=0;i<num2.length;i++) {
			System.out.print(num2[i] + " ");
		}
	}
	
	public void practice12() {
//		System.arraycopy(origin, 0, copy, num2-num, num2);
//		int[] copy = Arrays.copyOf(origin, 5)
		int num = 0;
		int num2 = 0;
		char ch = 'n';
		
		System.out.println("배열의 크기를 입력하세요 : ");
		num = sc.nextInt();
		String[] origin = new String[num];
		String[] copy = new String[num];
		
		loop1:
		while(true) {
			//추가 입력시
			if(!(num2 == 0)) {
				System.out.println("추가 입력 개수");
				num = sc.nextInt();
			}
			
			int count = 0;
			// 문자열 입력
			while(count < num) {
				System.out.println("문자열 : ");
				origin[count++] = sc.next();
			}
			
			num2 += num;// 
			
			
			//추가 입력 여부
			System.out.println("더 값을 입력?");
			ch = sc.next().charAt(0);
			if(ch=='Y'||ch=='y') {
				copy = Arrays.copyOf(origin, num2);
				continue loop1;
			}else {
				
				break;
			}
		}
		
		
	}
	
}
