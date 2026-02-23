package com.kh.chap01.after.run;

import com.kh.chap01.after.model.vo.*;//* : vo.이후에 모든 클래스를 인포트 하겠다는 의미

public class Run {

	public static void main(String[] args) {
		// 겍체 3
		Desktop d = new Desktop("삼성","d-01","삼성대탑",2000,true);
		SmartPhone sp = new SmartPhone("삼성","s-01","삼성갤럭시",1000,"kt");
		Tv t = new Tv("삼성","t-01","삼성갤럭시tv",3000,60);
		
		System.out.println(d.information());
		System.out.println(sp.information());//sp.information()선언시 자식클래스에 
		// information()이 없다면 부모클래스의information()이 출력
		System.out.println(t.information());
		
		/*
		 * 실행하고자 하는 메서드가 자식클래스에 없다면, 자동으로 부모클래스의 메서드를 실행한다..
		 * 단, 자식클래스에 부모클래스에 존재하는 메서드를 재정의(오버라이딩)했다면, 자식클래스가
		 * 실행 우선권을 가진다.
		 * 
		 * 상속 장점
		 * 1. 유지보수가 편해진다.(생산성 증가)
		 * 2. 작은양의 코드로 다양한 클래스를 작성할 수 있다.
		 * 3. 정의해둔 부모클래스를 통해 다른 클래스로의 확장이 용이하다.(확장성이 좋다.)
		 * 
		 * 상속의 특징(주의점)
		 * - 클래스간의 상속은 다중 상속이 불가능하다.(단일 상속만 지원)(단 자바에서는)
		 * - 명시되어있지 않지만 모든 클래스는 "Object클래스의 후소"이다.
		 * 	=> Object의 메서드를 사용할 수 있다.
		 *  => Object의 메서드가 마음에 안들면 오버라이딩이 가능하다.
		 * */
	}
	
}
