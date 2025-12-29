package com.kh.practice.dimension;

import java.util.Iterator;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		String[][] rss = new String[3][3];
		
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				rss[i][j] = "("+i+", "+j+")";
			}
		}
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				System.out.print(rss[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2(){
		int[][] rss = new int[4][4];
		int count = 0;
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				rss[i][j] = ++count;
				System.out.printf("%4d",rss[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3(){
		int[][] rss = new int[4][4];
		int count = 0;
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				rss[i][j] = ++count;
				
			}
			
		}
		for(int i = rss.length-1;0 <= i;i--) {
			for(int j = rss[i].length-1;0<=j;j--) {
				System.out.printf("%4d",rss[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4(){
		int[][] rss = new int[4][4];
		int sum = 0;
		
		for(int i = 0;i<rss.length-1;i++) {
			for(int j = 0;j<rss.length-1;j++) {
				System.out.println("rss["+i+"]["+j+"]");
				rss[i][j] = sc.nextInt();
				rss[rss.length-1][rss.length-1] = rss[i][j];
			}
		}
		System.out.println("test");
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				if(j<(rss[i].length)-1) {
					sum += rss[i][j];
				}else {
					rss[i][j] = sum;
				}
			}
		}
		
		for(int i = 0;i<rss.length-1;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				System.out.println();
			}
		}
	}
	
	public void practice5(){
		System.out.println("행 크기 : ");
		int num1 = sc.nextInt();
		System.out.println("열 크기 : ");
		int num2 = sc.nextInt();
		if(num1<1||num1>10||num2<1||num2>10) {
			System.out.println("1~10사이의 정수를 입력하시요");
			practice5();
			return;
		}
		char[][] rss = new char[num1][num2];
		
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				rss[i][j] = (char)('A'+(Math.random() * 25));
			}
		}
		
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				System.out.print(rss[i][j]+" ");
			}
			System.out.println();
		}
	}
	//숙제는 안해되됨
	public void practice6(){}
	public void practice7(){}
	public void practice8(){}
	public void practice9(){}
}
