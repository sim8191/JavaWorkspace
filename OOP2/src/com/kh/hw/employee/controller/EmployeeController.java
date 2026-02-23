package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	int i = 0;
	Employee[] epl = new Employee[100];
	public void add(int empNo, String name, char gender, String phone) {
		if (i >= epl.length) {
	        System.out.println("더 이상 사원을 추가할 수 없습니다.");
	        return;
	    }
		epl[i] = new Employee();
		epl[i].setEmpNo(empNo);
		epl[i].setName(name);
		epl[i].setGender(gender);
		epl[i].setPhone(phone);
		i++;
	}
	
	public void add(int empNo, String name, char gender, String phone, 
			String dept, int salary, double bonus) {
		if (i >= epl.length) {
	        System.out.println("더 이상 사원을 추가할 수 없습니다.");
	        return;
	    }
		epl[i] = new Employee();
		epl[i].setEmpNo(empNo);
		epl[i].setName(name);
		epl[i].setGender(gender);
		epl[i].setPhone(phone);
		epl[i].setDept(dept);
		epl[i].setSalary(salary);
		epl[i].setBonus(bonus);
		i++;
	}
	
	public void modify(String phone){ 
		 // 받아온 매개변수를 이용하여 해당 정보 수정 
	} 
	
	public void modify(int salary){ 
		 // 받아온 매개변수를 이용하여 해당 정보 수정 
	} 
	
	public void modify(double bonus){ 
		 // 받아온 매개변수를 이용하여 해당 정보 수정 
	} 
	
	public void Employee() {
		
	}
	
	public void remove(){ 
		 // 객체 e에 null을 저장하여 객체 삭제 
		i--;
	} 
	
	public String inform(){ 
		 // 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환 
		if(i==0) {
			return "사원 데이터가 없습니다";
		}else {
			String print = epl[i].pringEmployee();
			return print;
		}
	}
}
