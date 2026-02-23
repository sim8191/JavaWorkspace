package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String , Member> map = new HashMap<>();
	public boolean joinMembership(String id, Member m) {
		// 1. put메서드를 활요한 방법 (가능은 하지만 적절치는 못함)
//		Member prev = map.put(id, m);
		
		// 2. containsKey메서드를 활용한 방법
		boolean result = map.containsKey(id);
		if(result) {
			return false;
		}else {
			map.put(id,m);
			return true;
		}
		
		// 3. if문으로 하기 이건 내가한거임(선생님은 안함)
//		if(map.get(id) == null) {
//			map.put(id,m);
//		}else {
//			result = false;
//		}
//		return result;
	}
	
	public String logIn(String id,
			String password) {
		String name = null;
		if(map.containsKey(id)) {
			return null;
		}
		
		if(map.get(id).getPassword().equals(password)) {
			name = map.get(id).getName();
		}
		
		return name;
	}

	
	public boolean changePassword(String id ,String oldPw,String newPw) {
		if(map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName); // 위의 changePassword처럼 안한이유
		//menu에 changeName()에서 걸러줬기때문에 그럼
		// 허나 원래는 해줘야 지됨
	}
	
	public TreeMap<String, String> sameName(String name) {
		Set<String> keys = map.keySet();
		TreeMap<String, String> tree = new TreeMap<String, String>();
		
		for(String key : keys) {
			String str = map.get(key).getName();
			if(str.equals(name)) {
				tree.put(key, name);//id와 name
			}
		}
		return tree;
	}
}
