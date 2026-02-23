package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	Member[] m = new Member[SIZE];// [new Member(), null,null....]
	public final static int SIZE = 10;

	public MemberController() {

	}

	public int existMemberNum() {
		// 현재 존재하는 멤버 수 반환
		int count = 0;
		for (Member mem : m) {
			// 객체가 초기화 된경우
			if (mem != null) {
				count++;
			}
		}
		// 여기는 호출할 때마다 항상 새롭게 숫자를 샘
		// 그래서 클래스에서 선언해서 할수 도 있음
		return count;
	}

	public Boolean checkId(String inputId) {
		// 아이디 중복확인 메소드
		boolean isDup = false;
		for (Member mem : m) {
			// 객체배열에 저장된 Member객체의 id값과 사용자가 입력한 id값을 비교.
			if (mem != null && inputId.equals(mem.getId())) {
				isDup = true;
				break;
			}

		}
		return isDup;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		Member mem = new Member(id, name, password, email, gender, age);
		// 생성한 객체를 겍채
//		for() {
//			set서치 
//		}
	}

	public String searchId(String id) {
		// member객체 배열에서 id와 일치하는 회원의 정보를 찾은 후, 회원의 정보를 반환
		for(Member mem : m) {
			if(mem != null && mem.getId().equals(id)) {
				return mem.toString();
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		Member[] m = new Member[SIZE];
		int index = 0;
		for(Member mem : this.m) {
			if(mem != null && mem.getName().equals(name)) {
				m[index++] = mem;
			}
		}
		if(index == 0) {
			return null;
		}else {
			Member[] copy = Arrays.copyOf(m, index);
			return copy;
 		}
	}

	public Member[] searchEmail(String email) {
		//위의 서치 시리즈 보면서 작성해보기
		return m;
	}

	public Boolean updatePassword(String id, String password) {
		for(int i = 0;i<m.length;i++) {
			Member mem = m[i];
			if(mem != null && mem.getId().equals(id)) {
				mem.setPassword(password);
				return true;
			}
		}
		return false;
	}

	public Boolean updateName(String id, String name) {

		return true;
	}

	public Boolean updateEmail(String id, String email) {

		return true;
	}

	public Boolean delete(String id) {
		for(int i = 0;i<m.length;i++) {//여기서는 향상된 for문 못씀 11시 43분
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;//삭제처리
				return true;//삭제완료
			}
		}
		return false;
	}

	public void delete() {
//		for(int i = 0;i<m.length;i++) {//여기서는 향상된 for문 못씀 11시 43분
//			m[i] = null;
//		}
		m = new Member[SIZE];
	}

	public Member[] printAll() {
		
		return m;
	}

}
