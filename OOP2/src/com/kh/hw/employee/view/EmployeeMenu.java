package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가 ");
			System.out.println("2. 사원 수정 ");
			System.out.println("3. 사원 삭제 ");
			System.out.println("4. 사원 출력 ");
			System.out.println("9. 프로그램 종료 ");
			int num = sc.nextInt();
			if(!(num >= 1 && num <= 4||num==9)) {
				System.out.println("번호를 잘못 입력했습니다.");
				continue;
			}else {
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
				}
				default:
					System.out.println("종료합니다.");
					return;
				}
			}
		}
	}

	public void insertEmp() {
		System.out.println("사원 번호 : ");
		int empNo = sc.nextInt();
		System.out.println("사원 이름 : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("사원 성별 : ");
		char gender = sc.next().charAt(0);
		System.out.println("사원 번호 : ");
		String phone = sc.nextLine();
		sc.nextLine();
		System.out.println("추가 정보를 더 입력하시겠습니까?(y/n)");
		char yesOrNo = sc.next().charAt(0);
		if(yesOrNo == 'y' || yesOrNo=='Y') {
			System.out.println("사원 부서 : ");
			String dept = sc.next();
			System.out.println("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.println("보너스 율 : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		}else {
			ec.add(empNo, name, gender, phone);
		}
		
	}

	public void updateEmp() {
		while(true) {
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화번호 ");
			System.out.println("2. 사원 연봉 ");
			System.out.println("3. 보너스율  ");
			System.out.println("9. 돌아가기 ");
			System.out.println("메뉴 번호를 누르세요.");
			int num = sc.nextInt();
			if(!(num >= 1 && num <= 3||num==9)) {
				System.out.println("번호를 잘못 입력했습니다.");
				continue;
			}else {
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
				}default:
					System.out.println("메인 메뉴로 돌아갑니다.");
					return;
				}
			}
		}
		
	}
	
	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까?");
		char yesOrNo = sc.next().charAt(0);
		if(yesOrNo == 'y' || yesOrNo=='Y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공 했습니다.");
			return;
		}else {
			return;
		}
	}


	public void printEmp() {
		System.out.println(ec.inform());
		return;
	}
}
