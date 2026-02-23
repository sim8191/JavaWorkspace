package com.kh.example.practice2.model.vo;

public class Student {
	private static int grade; // 및줄은 static
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	static{
		//스텍틱 초기화
		grade = 1;
	}
	
	{
		//변수 초기화
		//grade = 1; 이렇게 해도 상과은 없음
		name = "심기범";
		classroom = 10;
		height = 170;
		gender = '남';
	}
	
	public Student() {
		
	}
	
	public void information() {
		System.out.println("이름 : "+name + "\n키 : "+
				height+ "\n학년(나이) : " + grade + "\n성별 : "+gender
				+"\n반 : "+classroom+"반");
	}
	
}
