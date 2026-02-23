package com.ck.pracic2.func;

public class CastingPractice2 {
	public void practice2() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum2 / (int)dNum); //2
		System.out.println((int)(iNum1 / iNum2)); // 2

		System.out.println((double)iNum1); // 10.0
		System.out.println(iNum2 * dNum); // 10.0
		
		System.out.println(dNum); //2.5
		System.out.println((double)iNum1 / (double)iNum2); //2.5
		
		System.out.println((int)(iNum1 / fNum)); // 3
		System.out.println((int)fNum); // 3
		
		System.out.println((float)(iNum1 / fNum));
		System.out.println((double)(iNum1) / fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch + iNum1);
		System.out.println((char)(ch + iNum1));	
	}
}
