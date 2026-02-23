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
		int[] rss2 = new int[4];
		int rowSum = 0;
		int columnSum = 0;
		int sum = 0;
		
		for(int i = 0;i<rss.length-1;i++) {
			rowSum = 0;
			columnSum = 0;
			for(int j = 0;j<rss.length;j++) {
				if(i<rss.length-1&&j<rss[i].length-1) {
					System.out.print("rss["+i+"]["+j+"] : ");
					rss[i][j] = sc.nextInt();
					rowSum += rss[i][j];
				}
				if(j == rss[i].length-1) {
					rss[i][j] = rowSum;
				}
			}
			sum += rowSum;
		}
		System.out.println();
		
		for(int i = 0;i<rss.length-1;i++) {
			rowSum = 0;
			columnSum = 0;
			for(int j = 0;j<rss.length;j++) {
				if(i<rss.length-1&&j<rss[i].length-1) {
					columnSum += rss[j][i];
				}
				if(j == rss[i].length-1) {
					rss[j][i] = columnSum;
				}
			}
			sum += columnSum;
			rss[rss.length-1][rss.length-1] = sum;
		}
		
		for(int i = 0;i<rss.length;i++) {
			for(int j = 0;j<rss[i].length;j++) {
				System.out.printf("%4d",rss[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice_4() {
		int[][] arr = new int[4][4];
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j]*2;
			}
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
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
	public void practice6(){
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		for(int i = 0;i<strArr.length;i++) {
			
			for(int j = 0;j<strArr.length;j++) {
				System.out.print(" " + strArr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0;i<strArr.length;i++) {
			for(int j = 0;j<strArr[i].length;j++) {
				System.out.print(" " + strArr[j][i]);
			}
			System.out.println();
		}
	}
	
	public void practice7(){}
	public void practice8(){}
	public void practice9(){}
}
