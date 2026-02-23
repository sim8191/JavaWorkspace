package com.kh.practice.network.api.copy;

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
		try {
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
			String serviceKey = "7a1914936309a478e0fe0524134183694505fe9ece6b92f6624cf04de257822a";
			String stationName = URLEncoder.encode("종로구","UTF-8");
			String dataTerm = "DAILY";
			
			serviceUrl += "?serviceKey="+serviceKey
					+"&stationName="+stationName
					+"&dataTerm="+dataTerm;
			
			URL url = new URL(serviceUrl);
			
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(url.openConnection().getInputStream()))){
				String line = null;
				while((line = br.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
