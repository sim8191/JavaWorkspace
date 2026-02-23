package com.kh.chap01.com;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		System.out.println("1. 입력\n"
				 +"2. 수정\n"+"3. 조회\n"+"4. 삭제\n"
				 +"7. 종류\n"+"메뉴 번호를 입력하세요:");
		int num1 = sc.nextInt();
		
//		if(num1 == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//			return;
//		}
		
		switch (num1) {
		case 1: 
			System.out.println("입력 메뉴입니다.");
			break;
		case 2: 
			System.out.println("수정 메뉴입니다.");
			break;
		case 3: 
			System.out.println("조회 메뉴입니다.");
			break;
		case 4: 
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7: 
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
			//메서드 내 어디서든 사용가능
			//현재 위치에서 메서드를 "종료"시키는 키워드
		}
//		System.out.println("메뉴입니다.");
	}
	
	public void practice2() {
		System.out.println("숫자를 입력하시요");
		int num1 = sc.nextInt();
		
//		if(num1%2 == 1) {
//			System.out.println("홀수");
//		}else if(num1%2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
		//실무에서 선호
		//양수인지 아닌지
		//가드조건문
		//-조건을 만족하지 않으면 즉시 종료하는 패턴
		if(!(num1>0)) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		// 홀수인지 짝수인지
		if(num1%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
	}
	
	public void practice3() {
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double num1 = sum/3.0;
		
		if(kor>=40&&eng>=40&&math>=40&&num1>=60) {
			System.out.println("국어점수 : "+kor+
					"\n영어점수 : "+eng+
					"\n수학점수 : "+math+
					"\n합계점수 : "+sum+
					"\n평균점수 : "+num1+"\n합격입니다.");
		}else {
			System.out.println("국어점수 : "+kor+
					"\n영어점수 : "+eng+
					"\n수학점수 : "+math+"\n불합격입니다.");
		}
		
//		if(!(kor>=40&&eng>=40&&math>=40&&num1>=60)) {
//			System.out.println("불합격입니다.");
//		}
//		System.out.println("합격입니다.");
		
	}
	public void practice4() {
		System.out.println("날짜 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄 입니다.");
			break;
		case 6: case 7:case 8:
			System.out.println("여름 메뉴입니다.");
			break;
		case 9:case 10:case 11:
			System.out.println("가을 메뉴입니다.");
			break;
		case 1: case 2: case 12: 
			System.out.println("겨울 입니다.");
			break;
		default:
			System.out.println("해당하는계절이없습니다.");
		}
		String season = "";
		switch (month) {
		case 3, 4, 5:
			season = "봄";
			break;
		case 6, 7, 8:
			season = "여름";
			break;
		case 9, 10, 11:
			season = "가을";
			break;
		case 1, 2, 12: 
			season = "겨울";
			break;
		default:
			season = "잘못 입력된 달";
			System.out.println(month+"월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.println(month+"월은 " + season + "입니다.");
	}
	
	public void practice5() {
		
		System.out.print("아이디 입력 : ");
		String ID = sc.next();
		System.out.print("비번 입력");
		String Pass = sc.next();
		
//		if(ID.equals("minmin")) {
//			if(Pass.equals("Min1234")) {
//				System.out.println("로그인 성공!");
//			}
//			else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		}else {
//			System.out.println("아이디가 틀렸습니다.");
//		}
		
		if(!ID.equals("minmin")) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		if(!Pass.equals("Min1234")) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		System.out.println("로그인 성공");
		
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급");
		String rank = sc.next();
		
		switch (rank) {
		case ("관리자"): {
			System.out.print("회원관리, 게시글 관리");
		}
		case ("회원"):{
			System.out.print(", 게시글 작성, 댓글 작성");
		}
		default:
			System.out.print(", 게시글 조회\n");
		}
		
	}
	
	public void practice7() {
		System.out.println("키(M)를 입력해 주세요 : ");
		double num1 = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		int Kg = sc.nextInt();
		
		double BMI = (Kg / (num1*num1));
		
		if(BMI < 18.5) {
			System.out.print("저체중");
		}
		else if(BMI < 23) {
			System.out.print("정상체중");
		}
		else if(BMI < 25) {
			System.out.print("과체중");
		}
		else if(BMI < 30) {
			System.out.print("비만");
		}
		else {
			System.out.print("고도 비만");
		}
	}
	
	public void practice8() {
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 : ");
		char Operator = sc.next().charAt(0);
		
		if(num1 > 0 && num2 > 0 &&(Operator=='+'||Operator=='-'||Operator=='/'
				||Operator=='*'||Operator=='%')) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		double sum = 0;
		switch (Operator) {
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
			return;
		}
		System.out.println(num1+""+ Operator +""+ num2 +" = " + sum );
	}
	
	public void practice9() {
		System.out.println("중간 고사 점수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("기말 고사 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("과제 점수 : ");
		int num3 = sc.nextInt();
		
		System.out.println("출석 점수 : ");
		int num4 = sc.nextInt();
		
		double num5 = (20*0.3);
		
		double totalScore = (num1 * 0.2) + (num2 * 0.3) + 
				(num3 * 0.3) + (num4 * 1.0);
		
		if( (20-num4) > (num5)) {
			System.out.println("Fail[출석 회수 부족("+ num4 +"/20)]");
			return;
		}
		
		System.out.println("중간 고사 점수 (20): "+(num1 * 0.2));
		System.out.println("기말 고사 점수 (30): "+(num2 * 0.3));
		System.out.println("과제 점수 (30): "+(num3 * 0.3));
		System.out.println("출석 점수 (20): "+(num4 * 1.0));
		System.out.println("총점 : "+totalScore);
		if (totalScore>=70) {
			System.out.println("PASS");
		}else {
			System.out.println("fail");
		}
		
	}
	
	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.\n"
				+"1. 메뉴 출력\n"+"2. 짝수/홀수\n"+
				"3. 합격/불합격\n"+"4. 계절\n"+
				"5. 로그인\n"+"6. 권한 확인\n"+
				"7. BMI\n"+"8. 계산기\n"+"9. P/F");
		int num1 = sc.nextInt();
		
		switch (num1) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("해당하는번호가 없습니다.");
		}
	}
	
	public void practice11() {
		// 초기 값을 문자열로 받은 경우
//		System.out.print("비밀 번호 입력 : ");
//		String PWnum = sc.next();
//		
//		int num = Integer.parseInt(PWnum);
//		
//		if(num>=10000||num<1000) {
//			System.out.println("자리 수 안 맞음");
//			return;
//		}
//		int num1 = PWnum.charAt(0);
//		int num2 = PWnum.charAt(1);
//		int num3 = PWnum.charAt(2);
//		int num4 = PWnum.charAt(3);

		// 초기 값을 정수값으로 받은 경우
		System.out.print("비밀 번호 입력 : ");
		int PWnum = sc.nextInt();
		
		if(PWnum>=10000||PWnum<1000) {
			System.out.println("자리 수 안 맞음");
			return;
		}
		
		int num1 = PWnum/1000;
		int num2 = num1/100;
		int num3 = num2/10;
		int num4 = num3%10;
		
		if((num1 == num2)||(num2 == num3)||(num3 == num4)||(num4 == num1)||(num2 == num4)||(num3 == num1)) {
			System.out.println("중복값이 있음");
		}else {
			System.out.println("비밀번호 입력성공 : " + PWnum);
		}
	}
}
