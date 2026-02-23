package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	NumberController nc = new NumberController();
	Scanner sc = new Scanner(System.in);
	public void menu() {
		while(true){
			System.out.println("정수1 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 : ");
			int num2 = sc.nextInt();
			
			try {
				Boolean bool = nc.checkDouble(num1, num2);
				System.out.println(num1+"은(는) " + num2 + "의 배수인가 ? " + bool);
			} catch (NumRangeException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("또는");
			System.out.println();
		}
		
	}
}
