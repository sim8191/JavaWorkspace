package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	public void mainMenu(){
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				saveScore();
				break;
			}case 2: {
				readScore();
				break;
			}case 9: {
				System.out.println("종료함");
				return;
			}
			default:
				System.out.println("잘못된 입력");
			}
		}
		
	}
	
	public void saveScore(){
		int num = 0;
		while(true) {
			System.out.println(++num + "번 째 학생 정보 기록");
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.println("수학 점수 : ");
			int math = sc.nextInt();
			int sum = kor+eng+math;
			double avg = sum/3;
			System.out.println("추가 입력");
			scr.saveScore(name, kor, eng, math, sum, avg);
			char ch = sc.next().toUpperCase().charAt(0);
			if(ch == 'N') break;
		}
	}
	
	public void readScore(){
		int count = 0;
		int sumAll = 0;
		double avgAll = 0;
		try (DataInputStream dis = scr.readScore();){
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			while(true) {
				System.out.println(dis.readUTF()+"\t"
						+dis.readInt()+"\t"+dis.readInt()+"\t"+dis.readInt()+"\t");
				int sum = dis.readInt();
				double avg = dis.readDouble();
				System.out.println("\t"+sum+"\t"+avg);
				
				count++;
				sumAll += sum;
				avgAll = sumAll/count;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (EOFException e) {
			System.out.println("읽은 횟수\t전제 합계\t전체평균");
			System.out.println(count+"\t"+sumAll+"\t"+avgAll);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
