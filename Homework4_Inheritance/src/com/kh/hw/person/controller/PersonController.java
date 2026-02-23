package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	Student[] s = new Student[SSIZE];
	Employee[] e = new Employee[ESIZE];
	public final static int ESIZE = 10;
	public final static int SSIZE = 3;
	public int i = 0;
	public int j = 0;

//
	public int[] personCount() {
		int[] arr = new int[2];
		int count1 = 0;
		for (Student std : s) {
			// 객체가 초기화 된경우
			if (std != null) {
				count1++;
			}
		}

		arr[0] = count1;
		int count2 = 0;
		for (Employee ep : e) {
			// 객체가 초기화 된경우
			if (ep != null) {
				count2++;
			}
		}
		arr[1] = count2;

		return arr;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		s[i] = new Student(name, age, height, weight, grade, major);
		i++;
	}

	public Student[] printStudent() {
		
		return s;
		
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

		e[j] = new Employee(name, age, height, weight, salary, dept);
		j++;

	}

	public Employee[] printEmployee() {
		
		return e;
	}

}
