package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		Person ps = new Person();
		ps.changeName("홍길동");
		ps.printName();
	}
}
