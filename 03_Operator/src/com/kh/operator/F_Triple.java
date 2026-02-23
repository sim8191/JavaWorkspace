package com.kh.operator;

public class F_Triple {
	
	/*
	 * 삼항연산자
	 * - 3개의 항목을 가지고 연산하는 연산자
	 * [표현법]
	 * 조건식 ? 조건이 true인 경우 결과값 : 조건이 false인 경우 결과값
	 * */
	
	public void method1() {
		int num = 50;
		
		// num의 값이 양수인지 아닌지 판단.
		boolean result = num > 0 ? true : false;
		System.out.println(result ? "양수입니다." : "음수입니다.");
		
	}
	
	public void method2() {
		int num = 0;
		// num의 값이 양수, 음수, 0중 무엇인지 판다.
		String result = num > 0 ? "양수" : 
			(num < 0 ? "음수" : "0입니다.");
	}
	
	public void quiz() {
        int a = 5;
        int b = 10;
        int c = (++a) + b; //16 = 6 + 10
        int d = c / a; // 2
        int e = c % a; // 4
        int f = e++; // 4 = 4(5)
        int g = (--b) +(d--); // 11 = 9 + 2(1)
        int h = 2;
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
        // 6(7) + 9 / (15 / 4) * (11(10) - 1) % (6 + 2)
        System.out.println("a : "+a); //7
        System.out.println("b : "+b); //9
        System.out.println("c : "+c); //15
        System.out.println("d : "+d); //1
        System.out.println("e : "+e); //6
        System.out.println("f : "+f); //4
        System.out.println("g : "+g); //10
        System.out.println("h : "+h); //2
        System.out.println("i : "+i); //12
    }
}
