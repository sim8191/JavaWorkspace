package com.ck.pracic2.func;

import java.util.Scanner;

public class CastingPractice {
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("±¹¾î : ");
		int num1 = sc.nextInt();
		
		System.out.print("¿µ¾î : ");
		int num2 = sc.nextInt();
		
		System.out.print("¼öÇÐ : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("ÃÑÁ¡ : " + sum);
		
		double average = sum/3;
		System.out.println("Æò±Õ : " + average);
	}
	
}
