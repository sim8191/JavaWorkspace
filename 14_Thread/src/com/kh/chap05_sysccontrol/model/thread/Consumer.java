package com.kh.chap05_sysccontrol.model.thread;

public class Consumer implements Runnable{

	private Data data;
	
	public Consumer(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			data.getDate();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
