package com.kh.chap03_generic.model.vo;

// 현재 클래스에서 사용할 타입변수 지정
public class Generic < T , G>{
	/*
	 * 제네릭 설정방법
	 *  - 제네릭(타입변수)는 여러 참조자료형으로 대체될 수 있는 부분을 하나의 문자로 표현
	 *  한다.
	 *  EX) <T>, <G>,.....
	 *  - 제네릭은 class 및 method, 필드에 각각지정할 수 있다.
	 * */
	T t; //T에 들어갈 값은 사용자가 정하는 거고 지정을 안한다면 오브젝으로 되는거임
	G g; // 위와 같음, 또한 G말고 아무 글자나 넣어도 되지만 관례상 대문자 1개만 넣는거
	//<> : 다이아몬드 연산자
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}
	
	// 메서드레벨 제네릭 설정
	public static <V> void printTest(V item) {//(내가 별도의 제네릭을 지정하지 않고 하겠다는 의미)
		//<V>는 별도의 오브젝이 된거임(V는 벨류를 의미하는 데 여기서 별의는 없음)
	}
}
