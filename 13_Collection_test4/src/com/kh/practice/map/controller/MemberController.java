package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String , Member> hm = new HashMap<>();
	public boolean joinMembership(String id, Member m) {
		boolean bool = true;
		if(hm.get(id) == null) {
			hm.put(id,m);
		}else {
			bool = false;
		}
		return bool;
	}
	public String logIn(String id,
			String password) {
		return "";
	}

	
	public boolean changePassword(String id ,String oldPw,String newPw) {
//		hm.replace(id, Member.setPassword(newPw));
		return false;
	}
	
	public void changeName(String id, String newName) {
		
	}
	
	public TreeMap sameName(String name) {
		
		return null;
	}
}
