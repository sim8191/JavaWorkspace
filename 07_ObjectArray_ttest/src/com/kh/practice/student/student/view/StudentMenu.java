package com.kh.practice.student.student.view;

import com.kh.practice.student.model.vo.Student;
import com.kh.practice.student.student.controller.StudentController;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("====학생 정보 출력====");
		Student[] arr = ssm.printStudent();//학생객체배열
		for(Student s : arr) {
			System.out.println(s.inform());
		}
		
		System.out.println();
		System.out.println("====학생 성적 출력====");
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+(int)dArr[0]);
		System.out.println("학생 점수 평균 : "+dArr[1]+"\n");
		
		System.out.println("====성적 결과 출력====");
		for(Student s : arr) {
			System.out.println(s.getName()+"은 "+(
					s.getScore()< StudentController.CUT_LINE ? "재시험 대상입니다.":"통과입니다."));
		}
		
	}
}
