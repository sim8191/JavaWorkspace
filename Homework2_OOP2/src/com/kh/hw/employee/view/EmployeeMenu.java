package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	EmployeeController ec = new EmployeeController();
	Scanner sc = new Scanner(System.in);
	public EmployeeMenu() {
		int num = 0;
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			num = sc.nextInt();
			if(!(num==1||num==2||num==3||num==4||num==9)) {
				System.out.println("번호를 잘못 입력 했습니다.");
				continue;
			}
			switch (num) {
			case 1: {
				insertEmp();
				break;
			}case 2: {
				updateEmp();
				break;
			}case 3: {
				deleteEmp();
				break;
			}case 4: {
				printEmp();
				break;
			}default:
				System.out.println("9. 프로그램 종료");
				return;
			}
		}
		
	}
	
	public void insertEmp() {
		
		int i=0;
		int[] rss = new int[i];
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("사원 성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("사원 번호 : ");
		String phone = sc.nextLine();
		sc.nextLine();
		System.out.print("추가 정보를 입력(y/n) : ");
		char yesOrNo = sc.next().charAt(0);
		if(yesOrNo=='Y'||yesOrNo=='y') {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.print("보너스 율 : ");
			double bonus = sc.nextInt();
			ec.add(empNo,name,gender,phone,dept,salary,bonus);
			
			return;
		}else {
			ec.add(empNo,name,gender,phone);
			i++;
			return;
		}
		
	}
	
	public void updateEmp() {
		
	}
	
	public void deleteEmp() {
		
	}
	
	public void printEmp() {
		
	}
}
