package com.kh.chap02.loop;

import java.util.Random;

public class B_While {
	/*
	 * while문
	 * [표현법]
	 * 
	 * [초기식]//필수아님
	 * while(조건식){
	 *  // 반복적으로 수행할 코드
	 *  [증감식]// 필수아님
	 * }
	 * */
	
	public void method1() {
		//for문을 while문으로 변경
		
		int i=0;
		while(i<5) {
			System.out.println("안녕");
			i++;
		}
		System.out.println(i);//5(4아니다. 해깔리지마)
	}
	
	public void method2() {
		// while문으로 5회 반복하여 아래 코드 줄력
		// 1 2 3 4 5
		int i=0;
		while(i<5) {
			i++;
			System.out.print(i + " ");
		}
//		while(i<5) {
//			System.out.print(++i + " ");
//		}
		System.out.println();
		
		while(i>0) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
	
	}
	
	public void method3() {
		// 1부터 랜덤값(1~10)까지의 총 합계를 while문으로 작성
		// 출력예시 : 1부터 XXX까지의 합계는 XXX입니다.
		int i=0;
		int random = (int)(Math.random() * 10 + 1);//Math.random() : 랜덤갑 설정0.1~1.0까지
		int sum = 0;
//		while(i<random) {
//			i++;
//			sum += i;
//		}
		while(i<random) {
			sum += ++i;
		}

		System.out.print(random + " " + sum);
	}
	
	/*
	 * do-while
	 * [표현법]
	 * do{
	 *  // 반복 실행할 코드(단, 최초1회는 반드시 수행)
	 * } while(조건식)
	 * - do-while문은 별도의 조건검사 없이 최초 1회는 무조건 실행된다.
	 * */
	public void method4() {
		do {
			System.out.println("하이!");
		}while(false);
	}
	
	public void method5() {
		//do-while문을 활용하여
		//1 2 3 4 5출력
		int i=0;
		do {
			System.out.print(++i+" ");
		}while(i<5);
	}
}
