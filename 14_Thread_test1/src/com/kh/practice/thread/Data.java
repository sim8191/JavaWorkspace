package com.kh.practice.thread;

public class Data {
	private int value;
	private boolean inEmpty = true;
	public Data() {
		
	}
	
	public void setValue(int value) {
		synchronized (this) {
			if(inEmpty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			this.value = value;
			inEmpty = false;
			System.out.println("put value : "+value);
			System.out.println("값이 입력되었습니다.");
			notify(); // 컨슈머가 대기중인경우 깨우는 메서드
//			notifyAll(); // wait()를 여러개 깨워야 할때의 메서드
		}
		this.value = value;
	}
	
//	public int getValue() throws EmptyException{
//		int test = 0;
//		synchronized (this) {
//			if(inEmpty) {
//				try {
//					//다른 스레드가 깨우기 전까지 대기상태로 전환.
//					wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			// 아이템소비
//			test = value;
//			value = 0;
//			inEmpty = true;
//			System.out.println("get value : "+test);
//			System.out.println("값을 꺼냈습니다. value 가 비었습니다.");
//			notify();
//		}
//		return test;
//	}
	public int getValue(){
		int test = 0;
		synchronized (this) {
			while (inEmpty) {
				try {
	                // 문제 요구사항: 값이 없는데 꺼내려 할 때 EmptyException 발생 
	                throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오...");
	            } catch (EmptyException e) {
	                System.out.println(e.getMessage()); // 예외 메시지 출력 [cite: 232]
	                try {
	                    wait(); // 예외 발생 후 대기 상태로 진입
	                } catch (InterruptedException ie) {
	                    ie.printStackTrace();
	                }
	            }
	        }
			// 아이템소비
			test = value;
			value = 0;
			inEmpty = true;
			System.out.println("get value : "+test);
			System.out.println("값을 꺼냈습니다. value 가 비었습니다.");
			notify();
		}
		return test;
	}
}
