package com.kh.hw.member.controller.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu () {
		
	}
	public void mainMenu(){
		while (true) {
			int memberNum = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE+"명입니다.");
			System.out.println("현재 등록된 회원 수는 "+ memberNum +"명입니다.");
			if(memberNum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록 ");
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다. ");
			}
			System.out.println("2. 회원 검색 ");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 출력");
			System.out.println("9. 끝내기");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: {
				if(memberNum != MemberController.SIZE) {
					insertMember();
					break;
				}else {
					System.out.println("잘못입했습니다.");
				}
			}case 2: {
				searchMember();
				break;
			}case 3: {
				updateMember();
				break;
			}case 4: {
				deleteMember();
				break;
			}case 5: {
				printAll();
				break;
			}
			default:
				System.out.println("잘못입했습니다.");
			}
		}
	}
	
	public void insertMember() {
		System.out.println("아이디 : ");
		String id = sc.next();
		
		boolean isDup = mc.checkId(id);
		if(isDup) {//중복인 경우
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMember();
			return;
		}
		
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("비밀번호 : ");
		String password = sc.next();
		
		System.out.println("이메일 : ");
		String email = sc.next();
		
		char gender = '\u0000';
		while(true) {
			System.out.println("성별 : ");
			gender = sc.next().toUpperCase().charAt(0);
			if(gender == 'M'||gender =='F') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
		}
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	public void searchMember(){
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1: {
			searchId();
			break;
		}case 2: {
			searchName();
			break;
		}case 9: {
			mainMenu();
			break;
		}default:
			System.out.println("잘못된 값 메인으로 돌아갑니다.");
			return;
		}
	}
	
	public void searchId(){
		System.out.println("검색할 아이디 : ");
		String searchId = sc.next();
		String result = mc.searchId(searchId);
		
		if(result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}
	
	public void searchName() {
		System.out.println("검색할 이름 : ");
		String searchName = sc.next();
		
		Member[] result = mc.searchName(searchName);
		
		if(result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(Member m : result) {
				System.out.println(m);
			}
			
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void searchEmail(){
		
	}
	
	public void updateMember(){
		//시실 여기는 위의 member처럼 해야하고
		//아래의 코드는 updatePassword()에 들어가야함
		
		System.out.println("수정할 회원 id : ");
		String id = sc.next();
		
		System.out.println("수정할 회원 비밀번호 : ");
		String password = sc.next();
		
		boolean result = mc.updatePassword(id, password);
		if(result) {
			System.out.println("비밀번호 변경 성공");
		}else {
			System.out.println("존재x");
		}
	}
	
	public void updatePassword(){
		
	}
	
	public void updateName(){
		
	}
	
	public void updateEmail(){
		
	}
	
	public void deleteMember() {
		System.out.println("번호 선택(1,2,9) : ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1: {
			deleteOne();
			break;
		}case 2: {
			deleteAll();
			break;
		}case 9: {
			mainMenu();
			break;
		}default:
			System.out.println("잘못된 값 메인으로 돌아갑니다.");
			return;
		}
		
	}
	
	public void deleteOne(){
		System.out.println("삭제할 회원 아이디 : ");
		String id = sc.next();
		
		System.out.println("정말 삭제하시겠습니까()");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		boolean result = mc.delete(id);
		if(result) {
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("존재 x");
		}
	}
	
	public void deleteAll(){
		System.out.println("삭제할 회원 아이디 : ");
		String id = sc.next();
		
		System.out.println("정말 삭제하시겠습니까()");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		mc.delete();
		System.out.println("성공적으로 삭제하였습니다.");
	}
	
	public void printAll(){
		Member[] m = mc.printAll();
		int memberNum = mc.existMemberNum();
		if(memberNum == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		for(Member mem : m) {
			System.out.println(mem);
		}
	}
}
