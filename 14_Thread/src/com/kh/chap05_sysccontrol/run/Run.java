package com.kh.chap05_sysccontrol.run;

import com.kh.chap05_sysccontrol.model.thread.Consumer;
import com.kh.chap05_sysccontrol.model.thread.Data;
import com.kh.chap05_sysccontrol.model.thread.Provider;

// 여기는 너무어려우면 포기해도 좋다고함(그래도 내용은 알고 있어야함)
// 스레드 컨트롤을 우리가 직접 할필요는 없지만 내용은 알고있어야함
public class Run {
	public static void main(String[] args) {
		Data data = new Data();
		Thread provider = new Thread(new Provider(data));
		Thread consumer = new Thread(new Consumer(data));
		
		provider.start();
		consumer.start();
		
	}
}
