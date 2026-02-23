package com.kh.practice.thread;

import java.util.Random;

public class Provider extends Thread{
	
	private Data data;
	
	public Provider(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			int num = new Random().nextInt(100);
			data.setValue(num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
