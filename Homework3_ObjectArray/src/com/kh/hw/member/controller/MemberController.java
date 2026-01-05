package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	Member[] m = new Member[10];
	public MemberController() {
		
	}
	public int existMemberNum() {
		return 0;
	}
	public Boolean checkId(String inputId) {
		return true;
	}
	
	public void insertMember(String id, String name, 
	String password, String email, 
	String gender, int age){} 
	public String searchId(String id){
		return "";
	}
	
	public Member[] searchName(String name){
		
		return m;
	} 
	public Member[] searchEmail(String email){
		
		return m;
	}
	public Boolean updatePassword(String id, 
			String password) {
		return true;
	}
	
	public Boolean updateName(String id, 
	String name) {
		
		return true;
	}
	
	public Boolean updateEmail(String id, 
			String email){
		
		return true;
	}
	
	public Boolean delete(String id){
		
		return true;
	}
	
	public void delete() {
		
	}
	
	public Member[] printAll(){
		
		return m;
	}
	
}
