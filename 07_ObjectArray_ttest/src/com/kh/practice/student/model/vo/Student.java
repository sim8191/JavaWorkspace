package com.kh.practice.student.model.vo;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student() {
		
	}
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
		String print = "이름 : "+getName()+"/ 과목 : "+getSubject()
				+"/ 점수 : "+getScore();
		return print;
	}
}
