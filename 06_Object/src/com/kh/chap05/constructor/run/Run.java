package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		//기본생성자로 객체 생성
		User u1 = new User();
		
		User u2 = new User("user01");
		
		//내가 선언한 순서대로 값을 넣어야함
		User u3 = new User("user03",30,'M');
		System.out.println(u3.getUserId());
		System.out.println(u3.getAge());
		System.out.println(u3.getGender());
	}
}
