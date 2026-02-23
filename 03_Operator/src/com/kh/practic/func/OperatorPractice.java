package com.kh.practic.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int num3 = 100/29;
		int num4 = 100%29;
		System.out.println("1인당 사탕 개수 : " + num3);
		System.out.println("남은 사탕 개수 : " + num4);
	}
	public void practice2() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int num1 = sc.nextInt();
		System.out.print("반 : ");
		int num2 = sc.nextInt();
		System.out.print("번호 : ");
		int num3 = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소주점 아래 두째자릭까지) : ");
		double num4 = sc.nextDouble();
		
		String gender2 = (gender == 'M'||gender == 'm'||gender == '남')?"남학생":"여학생";
		System.out.println(num1+"학년 "+num2+"반 "+
				num3 + "번 "+name+gender2+"의"+"성적은 "+num4+"이다.");
		
	}
	public void practice3() {
		System.out.print("나이 : ");
		int num1 = sc.nextInt();
		String gender2 = num1<=13?"어린이":(num1<=19?"청소년":"성인");
		System.out.println(gender2);
	}
	
	public void practice4() {
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		int sum = num1+num2+num3;
		System.out.print("합계 : "+sum);
		double average = sum/3;
		System.out.print("합계 : "+average);
		String pass = num1>=40&&num2>=40&&num3>=40&&average>=60?"합격":"불합격";
		System.out.println(pass);
	}
	
	public void practice5() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");//1,3
		char num1 = sc.next().charAt(7);//8
		String gen = num1=='3'||num1=='1'?"남성":"여성";
		System.out.println(gen);
	}
	
	public void practice6() {
		
		System.out.print("숫자 1번 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2번 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 >= num3 || num2 < num3;
		
		System.out.println(result);
	}
	
	public void practice7() {
		System.out.print("숫자 1번 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2번 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자 3번 : ");
		int num3 = sc.nextInt();

		boolean result = num1 == num2 && num2 == num3;
		System.out.println("입력 : " + result);
	}
	
	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		boolean resultA = (num1 + (double)(num1*0.4))>=3000;
		String A = resultA?"3000이상":"3000미만";
		System.out.println("A사원의 연봉/연봉+a : "+num1+"/"+(num1+num1*0.4) + "\n"+A);
		boolean resultB = num2>=3000;
		String B = resultB ? "3000이상":"3000미만";
		System.out.println("A사원의 연봉/연봉+a : "+num2+"/"+(double)num2+ "\n"+B);
		boolean resultC = (num3 + (double)(num3*0.15))>=3000;
		String C = resultC ? "3000이상":"3000미만";
		System.out.println("A사원의 연봉/연봉+a : "+num3+"/"+(num3+num3*0.15) + "\n"+C);
	}
}

