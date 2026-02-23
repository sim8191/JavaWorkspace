package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.i + "명입니다.");//count[0],pc.i
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.j + "명입니다.");//count[1],pc.j
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				studentMenu();
				break;
			}
			case 2: {
				employeeMenu();
				break;
			}
			case 9: {
				System.out.println("종료합니다.");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	public void studentMenu() {
		while (true) {
			int[] StudentNum = pc.personCount();
			if (StudentNum[0] != PersonController.SSIZE) {
				System.out.println("1. 학생 추가");
			} else {
				System.out.println("“학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 \r\n" + " 활성화 되지 않습니다.");
			}
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				if (StudentNum[0] != PersonController.SSIZE) {
					insertStudent();
					break;
				} else {
					System.out.println("잘못된 입력");
					break;
				}
			}
			case 2: {
				printStudent();
				break;
			}
			case 9: {
				System.out.println("메인으로");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	public void employeeMenu() {
		while (true) {
			int[] EmployeeNum = pc.personCount();
			if (EmployeeNum[1] != PersonController.ESIZE) {
				System.out.println("1. 사원 추가");
			} else {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 \r\n" + " 활성화 되지 않습니다.");
			}
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				if (EmployeeNum[1] != PersonController.SSIZE) {
					insertEmployee();
					break;
				} else {
					System.out.println("잘못된 입력");
					break;
				}
			}
			case 2: {
				printEmployee();
				break;
			}
			case 9: {
				System.out.println("메인으로");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	public void insertStudent() {
		int[] StudentNum = pc.personCount();
		if (StudentNum[0] != PersonController.SSIZE) {
			System.out.println("학생 이름 : ");
			String name = sc.next();
			System.out.println("학생 나이 : ");
			int age = sc.nextInt();
			System.out.println("학생 키 : ");
			double height = sc.nextDouble();
			System.out.println("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.println("학생 전공 : ");
			String major = sc.next();
			pc.insertStudent(name, age, height, weight, grade, major);
			System.out.println("그만하시려면 N");
			char yesOrNo = sc.next().toUpperCase().charAt(0);

			if (yesOrNo == 'N') {
				return;
			} else {
				insertStudent();
			}
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고  \r\n" + "사원 메뉴로 돌아갑니다.");
			return;
		}
	}

	public void printStudent() {

		Student[] s = pc.printStudent();
		int[] StudentNum = pc.personCount();
		if (StudentNum[0] == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		for (Student stu : s) {
			if(stu == null) {
				return;
			}
			System.out.println(stu);
		}
	}

	public void insertEmployee() {
		int[] EmployeeNum = pc.personCount();
		if (EmployeeNum[0] != PersonController.ESIZE) {
			System.out.println("사원 이름 : ");
			String name = sc.next();
			System.out.println("사원 나이 : ");
			int age = sc.nextInt();
			System.out.println("사원 키 : ");
			double height = sc.nextDouble();
			System.out.println("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("사원 학년 : ");
			int grade = sc.nextInt();
			System.out.println("사원 전공 : ");
			String major = sc.next();
			pc.insertEmployee(name, age, height, weight, grade, major);
			System.out.println("그만하시려면 N");
			char yesOrNo = sc.next().toUpperCase().charAt(0);

			if (yesOrNo == 'N') {
				return;
			} else {
				insertEmployee();
			}
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고  \r\n" + "사원 메뉴로 돌아갑니다.");
			return;
		}
	}

	public void printEmployee() {
		Employee[] e = pc.printEmployee();
		int[] EmployeeNum = pc.personCount();
		if (EmployeeNum[0] == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		for (Employee emp : e) {
			if(emp == null) {
				return;
			}
			System.out.println(emp);
		}

	}
}
