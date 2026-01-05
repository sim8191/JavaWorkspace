package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	public void mainMenu(){
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 "+"명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 "+"명입니다.");
		
		while(true) {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				studentMenu();
				break;
			}case 2: {
				employeeMenu();
				break;
			}case 9: {
				System.out.println("종료합니다.");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	
	public void studentMenu(){
		while(true) {
			int[] StudentNum = pc.personCount();
			if(StudentNum[0] != PersonController.SSIZE) {
				System.out.println("1. 학생 추가");
			}else {
				System.out.println("“학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 \r\n"
						+ " 활성화 되지 않습니다.");
			}
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				if(StudentNum[0] != PersonController.SSIZE) {
					System.out.println("잘못된 입력");
					break;
				}else {
					insertStudent();
					break;					
				}
			}case 2: {
				printStudent();
				break;
			}case 9: {
				System.out.println("메인으로");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	public void employeeMenu(){
		while(true) {
			int[] EmployeeNum = pc.personCount();
			if(EmployeeNum[1] != PersonController.ESIZE) {
				System.out.println("1. 사원 추가");
			}else {
				System.out.println("“학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 \r\n"
						+ " 활성화 되지 않습니다.");
			}
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				if(EmployeeNum[0] != PersonController.SSIZE) {
					System.out.println("잘못된 입력");
					break;
				}else {
					insertEmployee();
					break;					
				}
			}case 2: {
				printEmployee();
				break;
			}case 9: {
				System.out.println("메인으로");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
	public void insertStudent(){}
	public void printStudent(){}
	public void insertEmployee(){}
	public void printEmployee(){}
}
