package com.kh.chap04_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun {
	public static void main(String[] args) {
		/*
		 * Properties(중요 많이 사용됨,실무에서도)
		 *  - Map계열 인터페이스를 구현한 클래스로, key, value상으로 값을 저장
		 *  - 단, Properties는 key, value값을 모두 "String"으로 관리하는 것을
		 *  권장하며, 파일입출력메서드(io)를 지원한다.
		 *  - 주로 프로젝트의 설정정보를 기록하는데 사용한다.
		 * */
		Properties prop = new Properties();
		
		// map계열 인터페이스를 구현하였기 때문에 put메서드 사용 가능.
//		prop.put("다이제", new Snack("초코맛", 500)); // 이런식으로 할거면 hashMap으로 하는게 좋다고함
		// 그리고 이런식으로는 사용하지 않는다고 함
		
		// 1. setProperty(String, String) 
		prop.setProperty("list", "ArrayList");// 많이 사용되는 메서드는 아님
		prop.setProperty("set", "HashSet"); // 이런식으로 저장가능한다라고만 알고 있으셈
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		// 2. getProperty(String key)
		// - key에 저장된 value값을 가져오는 메서드
		System.out.println(prop.getProperty("set"));
		
		// 3. store(OutputStream os, String Comments)
		// - prop에 담긴 key,value를 모두 출력스트림을 활용하여 출력하는 메서드
		try {//트라이케치 할때 되도록 멀치 케치로 할것
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 4. load(InputStream is) : properties를 읽어오는데 사용하는 메서드
		Properties prop2 = new Properties();
		
		System.out.println(prop2);
		
		try {
			prop2.load(new FileInputStream("test.properties"));
			System.out.println(prop2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
