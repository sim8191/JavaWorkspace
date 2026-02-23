package com.kh.practice.map.model.vo;

public class Member {
	private String name;
	private String password;
	
	public Member() {
		
	}
	
	public Member(String password,String name) {
		
	}
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", password=" + password + "]";
	}
	
}
