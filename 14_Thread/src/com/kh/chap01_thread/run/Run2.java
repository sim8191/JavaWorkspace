package com.kh.chap01_thread.run;


public class Run2 {
	/*
	 * [실습문제] 알파벳 A~Z 까지 출력하는 스레드 생성 알파벳 a~z 까지 출력하는 스레드 생성 각 스레드 생성후 main스레드에서 실행.
	 * 출력예시 : [대문자쓰레드 시작] [소문자쓰레드 시작] [대문자쓰레드 : A] [대문자쓰레드 : B] [소문자쓰레드 : a] [대문자쓰레드
	 * : C] [소문자쓰레드 : b] .... [소문자쓰레드 : z] [대문자쓰레드 : Z] [대문자쓰레드 종료] [소문자쓰레드 종료]
	 */
	public static void main(String[] args) {
//		Thread th1 = new Thread(()->{ 
//			for(char i = 'A';i<='Z';i++) {
//				System.out.println("대문자 스레드 : "+i);
//			}
//		});
//		th1.start();
//		
//		Thread th2 = new Thread(()->{ 
//			for(char i = 'a';i<='z';i++) {
//				System.out.println("소문자 스레드 : "+i);
//			}
//		});
//		th2.start();
//		
//		class testThread3 extends Thread{
//			@Override
//			public void run() {
//				for(char i = 'a';i<='z';i++) {
//					System.out.println("소문자 스레드 2 : "+i);
//				}
//			}
//		}
//		testThread3 tt3 = new testThread3();
//		tt3.start();
		
		Thread UpperAlpThread = new Thread(()->{ 
			System.out.println("대문자 쓰레드 시작");
			for(int i = 'A';i<='Z';i++) {
				System.out.println("대문자 스레드 : "+(char)i);
			}
			System.out.println("대문자 쓰레드 종료");
		});
		
		Thread LowerAlpThread = new Thread(()->{ 
			System.out.println("소문자 쓰레드 시작");
			for(int i = 'a';i<='z';i++) {
				System.out.println("대문자 스레드 : "+(char)i);
			}
			System.out.println("소문자 쓰레드 종료");
		});
		
		UpperAlpThread.start();
		LowerAlpThread.start();
		
	}
}
