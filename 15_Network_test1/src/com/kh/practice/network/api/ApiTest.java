package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		String serviceKey = "7a1914936309a478e0fe0524134183694505fe9ece6b92f6624cf04de257822a";
		String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		
//		serviceUrl += "&sidoName="+"서울";
		try {
			serviceUrl += "?serviceKey="+serviceKey;// 스페이스발 들어가면 안됨
			serviceUrl += "&sidoName="+ URLEncoder.encode("서울","UTF-8");
			
			URL url = new URL(serviceUrl);
			URLConnection conn = url.openConnection();
			
			//2
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			//읽어온 데이터를 저장할 StringBuilder
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line = reader.readLine()) != null) {
				sb.append(line).append("\n");//url안의 코드 추출
			}
			System.out.println(sb.toString());//url안의 html코드 출력
			//2의 끝 url안에 있는 html복사
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
