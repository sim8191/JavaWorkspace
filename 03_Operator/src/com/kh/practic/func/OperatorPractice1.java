package com.kh.practic.func;

import java.util.Scanner;

public class OperatorPractice1 {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕의 개수 : ");
		int candys = sc.nextInt();
		
		System.out.println("1인당 사탕 개수" + (person/candys));
		System.out.println("남은 사탕 개수" + (person%candys));
		
	}
	
	private void practice2() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classes = sc.nextInt();
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		System.out.print("성별 : ");//되도록 char로 받기
		char ch = sc.next().charAt(0);
		
		System.out.print("성적 : ");
		double d = sc.nextDouble();
		
		System.out.println(grade+"학년 "+classes+"반 "+
				num + "번 "+name+(ch == 'M'?"남학생":"여학생")+"의 성적은 "+d+"이다.");

	}
	
	private void practice3() {
		
		System.out.println("나이");
		int age = sc.nextInt();
		
		String str = age <= 13 ? "어린이":
			(age <= 19 ? "청소년":"성인");
		System.out.println(str);
	}
	private void practice4() {
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		System.out.println(kor>=40&&eng>=40&&math>=40&&avg>=60?"합격":"불합격");
	}
	
	private void practice5() {
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String str = sc.next();
		char gender = str.charAt(7);
		System.out.println(gender == '1'||gender == '3'?"남자":"여자");
		
	}
	
	private void practice6() {
		System.out.print("숫자 1번 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자 2번 : ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자 3번 : ");
		int input = sc.nextInt();
		
		boolean result = input <= num1 && input > num2;
		System.out.println(result);
	}
	
	private void practice7() {
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		System.out.println("입력 : " + result);
		
	}
	
	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int salaryA = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int salaryB = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int salaryC = sc.nextInt();
		
		double inSalaryA = salaryA * 1.4;
		double inSalaryB = salaryB * 1.0;
		double inSalaryC = salaryA * 1.15;
		
		boolean resultA = (salaryA + inSalaryA)>=3000;
		String A = resultA?"3000이상":"3000미만";
		System.out.println("A사원의 연봉/연봉+a : "+salaryA+"/"+inSalaryA + "\n"+A);
		boolean resultB = (salaryB + inSalaryB)>=3000;
		String B = resultB ? "3000이상":"3000미만";
		System.out.println("A사원의 연봉/연봉+a : "+salaryB+"/"+inSalaryB+ "\n"+B);
		boolean resultC = (salaryC + inSalaryC)>=3000;
		String C = resultC ? "3000이상":"3000미만";
		System.out.println("A사원의 연봉/연봉+a : "+salaryC+"/"+inSalaryC + "\n"+C);
	}
}