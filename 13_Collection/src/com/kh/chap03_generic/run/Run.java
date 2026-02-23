package com.kh.chap03_generic.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kh.chap03_generic.model.vo.Child1;
import com.kh.chap03_generic.model.vo.Child2;
import com.kh.chap03_generic.model.vo.Generic;
import com.kh.chap03_generic.model.vo.GenericExtends;
import com.kh.chap03_generic.model.vo.Parent;

public class Run {
	public static void main(String[] args) {
		/*
		 * 1. 제네릭 등장 이전 프로그래밍 방식(jdk 5 이전)
		 *  - 컬렉션에 데이터를 추가시 항상 Object객체로 저장해야 했다.
		 *  - 저장된 데이터를 꺼내서 활용시에는 항상 "강제형변환"이 필요했다.
		 *  - 단, 형변환시 잘못된 자료형으로의 형변환을 진행한다면 에러가 발생할 수 있
		 *    었다.
		 * 
		 * */
		List l = new ArrayList();
		for(Object o : l) { // 4시 39분
			// o가 String이 아닌경우 ClassCastException발생.
			String s = (String) o;
		}
		
		/*
		 * 2. 제네릭 등장(JDK 1.5)
		 *  - 데이터의 자료형을 일반화 시켜서 여러 자료형을 다룰 수 있게 만든 문법
		 *  - 클래스의 메서드의 "반환형", "매개변수", 필드의 "자료형"들을 미리 확정
		 *  짓지 않고 파라미터화 하여 나중에 지정할 수 있게 만드는 문법.
		 *  - 즉, 제네릭을 사용하면 다양한 자료형(타입)들을 저장할 수 있기 때문에
		 *    타입변수 라고도 불린다.
		 *  - 제네릭을 사용하면 런타임이 아닌 컴파일 시점에서 에러를 캐치할 수 있으므로
		 *    타입안전성을 확보할 수 있다.
		 * */
		//제네릭이 일반화하다라는 의미도 있음
		//주요 키워드 일반화 제네릭이 없다면 위의 for문 처럼 하나하나 다 현변환 시켜야함
		
		Generic<Integer, String> g1 = new Generic<>();
		//Generic < T , G>를<Integer, String> 제네릭을 설정한거임(뭐로 받겠다고)
		g1.setT(1111);//Integer
		g1.setG("zzzz");//String 이된겨
		Generic.printTest("zzzz"); // 제네릭 미지정시 Object
		Generic.printTest(191919);
//		Generic.<String>printTest(191919);//너제네릭 값으로 String하겠다며 무스소리야 하면서 오류
		
		// 대입될 데이터의 자료형을 미리 지정하지 않고, 컴파일 시점에서 내 맘대로 지정하여
		// 사용하므로 재사용성이 크게 증가하였다.
		
		/*
		 * 3. 제네릭의 extends 문법
		 *  - 제네릭에서의 extends는 클래스간의 상속 개념이 아닌, 제네릭으로 지정한 자료형
		 *  의 범위를 "제한"시키는데 사용한다.
		 *  - <T extends Parent> : T(타입변수)에는 Parent클래스나 Parent 클래스
		 *    를 상속받은 자료형만 대입 가능
		 *  - <T extends Interface> : Interface를 구현한 클래스만 대입 가능.
		 * */
		GenericExtends<Parent> parent = new GenericExtends<>();//<> 안에는 Parent계열만 들어갈수 있음
		GenericExtends<Child1> child1 = new GenericExtends<>();
		// Parent및 Parent자식이 아니가 때문에 타입 설정 오류
//		GenericExtends<String> str = new GenericExtends<>();
		
		parent.setType(new Parent());
		parent.printing();
		child1.setType(new Child1());
		child1.printing();
		
		/*
		 * 4. 와일드카드(?) // 이거는 잘쓰지 않음(알아두기는 해야함)
		 *  - Generic에 들어가야할 자료형을 모르는 경우 사용
		 *  - 와일드카드(?)의 의미는 어떤 자료형이 들어올지 모른다(unknown)의 의미로 사용하며,
		 *    모든자료형(any)이 들어올 수 있다는 의미는 아니다.
		 *  - ?는 extends와 super예약어로 자료형의 범위를 제한할 수 있다.
		 *  - ? extends T : 상한제한 => 와일드카드의 범위를 T 또는 T의 자식들로 제한하는 기능.
		 *  - ? super T   : 하한제한 => 와일드카드의 범위를 T 또는 T의 "조상"들로 제한
		 * */
		// ?는 자료형의 범위가 정해져 있지 않는 상황에 사용.
		GenericExtends<?> unknown = new GenericExtends<>(); // 이상태에서는 사실상 아무것도 못함
//		unknown.setType(new Parent());
//		?로 타입변수 사용시 올바른 값을 사용중인지 검사가 불가능하기 때문에 에러가 발생...
//		?의 제대로된 사용을 위해선 extends와 super를 사용하여 ?의 범위를 제한해야 한다.
		
		// 1) exteds를 통한 와일드카드 상한제한
		GenericExtends<? extends Parent> unknown2 = new GenericExtends<>();
		// ?의 범위 : Parent, Parent의 자식
//		<? extends Parent> == <T extends Parent>두개의 의미가 비슷함(추가설명)
		
//		Child1 c = (Child1)new Parent();
//		Child2 c2 = new Child2();
//		Child1 c2 = new Child2();//에러 별도의 클래스여서
		
//		unknown2.setType(new Parent()); // ?의 범위에 Parent의 자식Child1,Child2가
		// 포함될 수 있으므로 대입불가능한 사황이생긴다.
//		unknown2.setType(new Child1()); // ?의 범위에 Chile2도 포함되어 있으므로 대입불가능
		// 한상황이 생긴다.
//		unknown2.setType(new Child2());
		
		// unknown2가 Child1이든, Chile2든, Parent든, 다형성에 의해 값을 추출하여 대입 가능.
		// 즉, extends를 통한 상한제한은 데이터를 "가져올때" 자주 사용한다. //다형성 개념을 알아야 이해가능
		Parent p = unknown2.getType();
		
		// 2) super를 통한 와일드카드 범위 하한 제한
		// ? super Parent : 와일드카드의 범의는 최하 Parent부터 최상 Object
		GenericExtends<? super Parent> unknown3 = new GenericExtends<>();
		// ? 의 현재범위 : Parent, Object
		
		unknown3.setType(new Parent());
		unknown3.setType(new Child1()); // 다형성의 업캐스팅으로 문제 없이 저장 가능.
		unknown3.setType(new Child2());
		// 값을 "대입"하고자 할때는 super를 통한 하한제한을 사용하는 것이 적절하다.
		
		Parent p3 = unknown3.getType(); //?는 Object일 수 있음. 단, 클래스레벨 제네릭 설정시
		// T extends Parent로 설정했기 때문에 T의 범위는 Parent ~ Parent의 자식클래스로 한정.
		// 그냥 T로 설정하면 오류
		
		// 따라서 타입변수에 extends를 통한 타입제한이 없는 경우, 데이터는 항상 Object형태로만 추출이 가능.
		Object o3 = unknown3.getType();
		//내가 제네릭을 사용할 필요는 없지만 알고는 있어야함
		
		
	}
}
