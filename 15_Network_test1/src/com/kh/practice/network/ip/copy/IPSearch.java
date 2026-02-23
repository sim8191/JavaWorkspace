package com.kh.practice.network.ip.copy;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("호스트 명 : ");
		String hostname = sc.next();
		
		try {
			InetAddress[] arr = InetAddress.getAllByName(hostname);
			System.out.println(hostname+"은 "+arr.length+"개의 ip주소를 가지고 있습니다");
			
			int count = 1;
			for(InetAddress ia : arr) {
				System.out.println((count++)+"번 IP : "+ia.getCanonicalHostName());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
