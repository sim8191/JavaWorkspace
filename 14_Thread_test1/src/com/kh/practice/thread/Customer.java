package com.kh.practice.thread;

import java.util.Random;

public class Customer extends Thread {
	
	private Data data;
	
	public Customer(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
//			try {
//				data.getValue();
//			} catch (EmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			data.getValue();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
