package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee epl = new Employee();
	public void add(int empNo, String name, char gender, String phone) {
		epl = new Employee(empNo,name,gender,phone);
		
	}
	
	public void add(int empNo, String name, char gender, String phone, 
			String dept, int salary, double bonus) {
		epl = new Employee(empNo,name,gender,phone,dept,salary,bonus);
		
	}
	
	public void modify(String phone){ 
		epl.setPhone(phone);//이런식으로 정보를 수정
		 // 받아온 매개변수를 이용하여 해당 정보 수정 
	} 
	
	public void modify(int salary){ 
		epl.setSalary(salary);
		 // 받아온 매개변수를 이용하여 해당 정보 수정 
	} 
	
	public void modify(double bonus){ 
		 // 받아온 매개변수를 이용하여 해당 정보 수정 
		epl.setBonus(bonus);
	} 
	
	public void Employee() {
		
	}
	
	public Employee remove(){ 
		 // 객체 e에 null을 저장하여 객체 삭제 
		Employee delete = epl; // 기존 주소값 복사
		epl = null; //삭제처리
		return delete; // 삭제된 주소값 반환
	} 
	
	public String inform(){ 
		 // 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환 
		if(epl == null) return null;
		return epl.toString();
	}
}
