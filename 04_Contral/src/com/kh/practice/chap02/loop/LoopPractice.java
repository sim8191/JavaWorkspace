package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		while (true) {
//			System.out.println("1이상의 숫자를 입력하세요 : ");
//			int num1 = sc.nextInt();
//			int i = 0;
//			if (num1 <= 0) {
//				System.out.println("0이하의 숫자");
//				continue;
//			}
//			for (i = 1; i <= num1; i++) {
//				System.out.print(i + " ");
//			}
//			break;
//		}
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		int i = 0;
		if(num1<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			practice1();
			return;
		}
		for (i = 1; i <= num1; i++) {
			System.out.print(i + " ");
		}

	}

	public void practice2() {
//		while (true) {
//			System.out.println("1이상의 숫자를 입력하세요 : ");
//			int num1 = sc.nextInt();
//			if (num1 <= 0) {
//				System.out.println("0이하의 숫자");
//				continue;
//			}
//			for (; num1 > 0; num1--) {
//				System.out.print(num1 + " ");
//			}
//			break;
//		}
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if(num1<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			practice2();
			return;
		}
		for (; num1 > 0; num1--) {
			System.out.print(num1 + " ");
		}

	}

	public void practice3() {
		System.out.println("1이상의 숫잘를 입력하세요 : ");
		int num1 = sc.nextInt();
		int i = 0;
		int sum = 0;
//		for (i = 1; i <= num1; i++) {
//			sum += i;
//			if (num1 == i) {
//				System.out.print(i);
//			} else {
//				System.out.print(i + " + ");
//			}
//		}
		for (i = 1; i <= num1; i++) {
			sum += i;
			System.out.print(i+ ((i!=num1)?"+":"="));
			
		}
		System.out.println(sum);
	}

	public void practice4() {
//		int num1 = 0;
//		int num2 = 0;
//		while (true) {
//			System.out.println("1이상의 숫잘를 입력하세요 : ");
//			num1 = sc.nextInt();
//			System.out.println("1이상의 숫잘를 입력하세요 : ");
//			num2 = sc.nextInt();
//			if ((num1 < 1) || (num2 < 1)) {
//				System.out.println("다시입력");
//			} else {
//				for (; num1 <= num2; num1++) {
//					System.out.print(num1 + " ");
//				}
//				break;
//			}
//		}
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if ((num1 < 1) || (num2 < 1)) {
			System.out.println("1이상의 수를 입력해주세요.");
			practice4();
			return;
		}
		
		int min = num1>num2?num2:num1; 
		int	max = num1>num2?num1:num2;
		
		for (int i = min; i <= max; i++) {
			System.out.print(i+" ");
		}
	}

	public void practice5() {
		int num1 = 0;
		while (true) {
			System.out.println("1~9의 숫자를 입력하세요 : ");
			num1 = sc.nextInt();
			if ((num1 < 1) || (num1 >= 9)) {
				System.out.println("다시입력");
			} else {
				for (; num1 <= 9; num1++) {
					System.out.println("==="+num1+"단===");
					for(int i=1;i<10;i++) {
						System.out.println(i + " X " + num1 + " = " + (i*num1));
					}
					System.out.println();
				}
				break;
			}
		}
	}

	public void practice6() {
		System.out.println("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("공차 입력하세요 : ");
		int num2 = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
		
	}

	public void practice7() {
		while (true) {
			System.out.println("연산자(+, -, *, /, %) : ");
			String str1 = sc.next();
			char ch =str1.charAt(0);
			
			if (str1.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println("정수1 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 : ");
			int num2 = sc.nextInt();

			if(num2 == 0 &&(ch=='/'||ch=='%')) {
				System.out.println("0으로 나눌수 없습니다.");
				continue;
			}
			
			double sum = 0;
			switch (str1.charAt(0)) {
			case '+': {
				sum = num1 + num2;
				break;
			}
			case '-': {
				sum = num1 - num2;
				break;
			}
			case '*': {
				sum = num1 * num2;
				break;
			}
			case '/': {
				sum = num1 / num2;
				break;
			}
			case '%': {
				sum = num1 % num2;
				break;
			}
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				continue;
			}
			System.out.println(num1 + "" + str1 + "" + num2 + " = " + sum);
			
		}
	}

	public void practice8() {
		System.out.println("정수 입력하세요 : ");
		int num1 = sc.nextInt();
		
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public void practice9() {
		System.out.println("정수 입력하세요 : ");
		int num1 = sc.nextInt();
		
		for (int i = 0; i < num1; i++) {
			for (int j = num1; j > i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public void practice10() {
		
		System.out.println("정수 입력하세요 : ");
		int num1 = sc.nextInt();

		if (num1 <= 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		if (!((num1 % 2 == 0) || (num1 % 3 == 0))) {
			System.out.println("소수입니다.");
		} else if ((num1 == 2) || (num1 == 3)) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("정수입니다.");
		}

	}

	public void practice11() {
//		System.out.println("정수 입력하세요 : ");
//		int num1 = sc.nextInt();
//
//		if (num1 <= 1) {
//			System.out.println("잘못 입력하셨습니다.");
//			return;
//		}
//		int cot = 0;
//		for (int i = 2; i <= num1; i++) {
//			if (!((i % 2 == 0) || (i % 3 == 0))) {
//				System.out.println(i + " ");
//				cot++;
//			} else if ((i == 2) || (i == 3)) {
//				System.out.println(i + " ");
//				cot++;
//			}
//		}
//		System.out.println("2부터" + num1 + "까지의 소수의 개수는 " + cot + "개입니다.");
//	
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		// 외부반복문 : 2~내가 입력한 값까지 반복.
		// 내부반복문 : 현재 값이 소수인지 아닌지 판단.
		int count = 0;
		for(int i = 2;i<=num;i++) {
			boolean isPrime = true;
			for(int j = 0;j<=i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println("2부터 "+num+"짜지 소수의 개수는 "+count+"개 입니다.");
		
	}

	public void practice12() {
		System.out.print("정수 입력하세요 : ");
		int num = sc.nextInt();

		if (num <= 1) {
			System.out.print("잘못 입력하셨습니다.");
			return;
		}
		int cot1 = 0;
		for (int i = 2; i <= num; i++) {
			if (((i % 2 == 0) || (i % 3 == 0))) {
				System.out.print(i+" ");
				if((i % 2 == 0) && (i % 3 == 0)) {
					cot1++;
				}
			} 
		}
		System.out.println("\ncount : " + cot1);

	}

}
