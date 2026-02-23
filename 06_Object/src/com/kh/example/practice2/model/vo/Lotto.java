package com.kh.example.practice2.model.vo;

public class Lotto {
	private int[] lotto = new int[6];
	{
		for(int i = 0;i<lotto.length;i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
			for (int j = 0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public Lotto() {//생성자
		//여기다가 코드를 작성 해도됨
	}
	
	public void information() {
		for(int i = 0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
