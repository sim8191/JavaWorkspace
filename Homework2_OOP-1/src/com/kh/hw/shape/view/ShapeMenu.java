package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;


//삼각형 사각형 선택 및 입출력 담당
public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private TriangleController tcr = new TriangleController();
	private SquareController scr = new SquareController();
	
	public void inputMenu() {
		int type = 0;
		while(true) {
			System.out.println("====도형 프로그램====");
			System.out.println("3.삼각형");
			System.out.println("4.사각형");
			System.out.println("9.프로그램 종료");
			type = sc.nextInt();
			
			switch(type) {
			case 3:{
				triangleMenu();
			}case 4:{
				squareMenu();
			}case 9:{
				System.out.println("프로그램 종료");
				return;
			}default:{
				System.out.println("잘못된 번호...다시입력해주세요.");
				continue;
			}
			}
		}
	}
	
	public void triangleMenu() {
		int type = 3;
		int num =0;
		while(true) {
			System.out.println("삼각형");
			System.out.println("1.삼 면적");
			System.out.println("2.삼 색칠");
			System.out.println("3.삼 정보");
			System.out.println("9.메인으로");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				inputSize(type, num);
				break;
			}case 2: {
				inputSize(type, num);
				break;
			}case 3: {
				printlnformation(type);
				break;
			}case 9: {
				System.out.println("메인으로 넘어감");
				inputMenu();
				return;
			}
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		} 
	}
	
	public void squareMenu() {
		int type = 4;
		int num = 0;
		while(true) {
			System.out.println("사각형");
			System.out.println("1.사 둘레");
			System.out.println("2.사 면적");
			System.out.println("3.사 색칠");
			System.out.println("4.사 정보");
			System.out.println("9.메인으로 ");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				inputSize(type, num);
				break;
			}case 2: {
				inputSize(type, num);
				break;
			}case 3: {
				inputSize(type, num);
				break;
			}case 4: {
				printlnformation(type);
				break;
			}case 9: {
				System.out.println("메인으로 넘어감");
				inputMenu();
				return;
			}
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}
	
	public void inputSize(int type, int menuNum){
		double height = 0;
		double whidh = 0;
		String color = " ";
		if(type == 3) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				whidh = sc.nextDouble();
				tcr.calcArea(height,whidh);
				System.out.println("삼각형 면적 : "+tcr.calcArea(height,whidh));
//				
				return;
			}else if(menuNum == 2) {
				//삼 색상 변경 호출
				System.out.print("삼각형 새깔을 입력 : ");
				color = sc.next();
				tcr.paintColor(color);
				return;
			}else if(menuNum == 9) {
				squareMenu();
				return;
			}else {
				System.out.println("잘못 입력");
			}
		}else {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				whidh = sc.nextDouble();
				System.out.println("사각형 둘레 : "+scr.calcPerimeter(height, whidh));
				return;
			}else if(menuNum == 2) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				whidh = sc.nextDouble();
				System.out.println("사각형 면적 : "+scr.calcArea(height,whidh));
				
				return;
			}else if(menuNum == 3) {
				//사 색상 변경 호출
				System.out.print("사각형 새깔을 입력 : ");
				color = sc.next();
				scr.paintColor(color);
				return;
			}else if(menuNum == 9) {
				squareMenu();
				return;
			}else {
				System.out.println("잘못 입력");
			}
		}
		
	}
	
	public void printlnformation(int type){
		if(type == 3) {
			System.out.println(tcr.print());
		}else {
			System.out.println(scr.print());
		}
	}
	

}
