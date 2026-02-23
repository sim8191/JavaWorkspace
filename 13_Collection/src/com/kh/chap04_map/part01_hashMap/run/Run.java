package com.kh.chap04_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class Run {
	public static void main(String[] args) {
		/* //어레이 리스트 헤시멥 많이 사용
		 * HashMap(중요 많이 사용)
		 *  - 많은 양의 데이터를 "빠르게 저장하고 관리"하기 위하여 사용하는 클래스로.
		 *    key값과 value값을 함께 저장한다.
		 *  - 계층구조상 List, Set계열과 다른 Map계열 인터페이스를 상속한 클래스로,
		 *    사용하는 메서드가 다르다.
		 *  - 데이터를 저장할 떄 key, value를 한 쌍으로 저장하고, key를 통해 value
		 *    가 저장된 위치에 접근한다.
		 *  - key값의 중복을 허용하지 않는다
		 *  - 동일한 key값에 데이터를 저장하면, 마지막으로 추가된 value값이 저장된다.
		 *  
		 * */
		// key값의 자료형은 String
		// value값의 자료형은 Snack
		HashMap<String , Snack> hm = new HashMap<>();
		
		// 1. put(K key, V value) : map공간에 key,value를 세트로 추가하는 메서드
		hm.put("다이제", new Snack("초코",800));// 키값중복으로 value삭제
		hm.put("칸초", new Snack("초코",400));
		hm.put("두쫀쿠", new Snack("초코",450));
		hm.put("포테이토칩", new Snack("양파",500));
		
		hm.put("다이제", new Snack("초코",900));
		System.out.println(hm);
		
		// 2. get(K key) : v -> HashMap에서 key와 일치하는 value값을 찾는 메서드
		System.out.println(hm.get("두쫀쿠"));
		
		// 3. size() : 초기화된 데이터 수 반환
		System.out.println(hm.size());
		
		// 4. replace(K key, V Value)
		//  - hashmap에서 key값과 일치하는 값을 찾아, 새로 전달된 value로
		//    "교체"하는 메서드
		hm.replace("다이제", new Snack("오리지널",700));//키 값이 반드시 있어야 지만 교체 가능
		//hm.put말고 hm.replace쓰는 이유 정말 말그대로 교체만 하기 때문(안전하게 교체만함)
		// 그렇기때문에 key값이 hashmap에 있어야 지만 작동
		
		// 5. remove(Key K) : KEY값과 일치하는 값을 찾아서 제거해주는 메서드
		//                    key와 value 함께 제거
		hm.remove("다이제");
		System.out.println(hm.get("다이제"));
		
		
		System.out.println("============");
		// Map계열 데이터 반복문 돌리기
		// 방법 1. keySet()을 활용한 반복
		// - keySet() : 맵의 key값들을 따로 Set에 담아 반환해주는 메서드
		Set<String> set = hm.keySet();
		for(String key : set) {
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		
		// 방법 2. entrySet()을 활용한 반복
		//  - 맵의 key, value값이 담긴 entry를 set에 담아 반환해주는 메서드.
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		// 자바.유틸.멥
		for(Entry<String, Snack> entry : entrySet) {//3시 39분
			System.out.println("Key"+entry.getKey());
			System.out.println("value"+entry.getValue());
		}
		
		
	}
}
