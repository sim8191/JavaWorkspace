package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	int i=0, j=0;
	Employee e = new Employee();
	public void add(int empNo, String name, char gender, String phone) {
		
		Employee[] Erss1 = new Employee[i];
		new Employee(empNo,name,gender,phone);
		i++;
		
	}
	public void add(int empNo, String name, char gender, String phone, String dept, int salary,
			double bonus) {
		Employee[] Erss1 = new Employee[j];
		new Employee(empNo,name,gender,phone,dept,salary,bonus);
		j++;
	}
}
