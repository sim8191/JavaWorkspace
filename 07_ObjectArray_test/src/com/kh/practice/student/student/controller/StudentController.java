package com.kh.practice.student.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	Student[] sArr = new Student[5];
	final private int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
	}
	
	public Student[] printStudent(){
		for(int i=0;i<sArr.length;i++) {
			System.out.println(sArr[i].inform());
		}
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		
		for(int i=0;i<sArr.length;i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double avgScore() {
		int num = sumScore();
		double avg = num/5;
		return avg;
	}
	
	public String str() {
		for(int i=0;i<sArr.length;i++) {
			if(sArr[i].getScore()<CUT_LINE) {
				System.out.println(sArr[i].getName()+
						"학생은 통과입니다.");
			}else {
				System.out.println(sArr[i].getName()+
						"학생은 재시험 대상입니다.");
			}
		}
		return"";
	}
}
