package com.kh.practice.score.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreDAO {
	BufferedWriter bw = null;

	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		int count = 0;
		int sumsum = 0;
		double avgavg = 0;
		try {
			bw = new BufferedWriter(new FileWriter(new File("StuScore.txt"), true));
			bw.write(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
			bw.newLine();
			count++;
			sumsum += sum;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		avgavg = sumsum/count;
		try {
			bw.write(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public DataInputStream readScore() throws FileNotFoundException {
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("StuScore.txt"));) {
			// read : 한글자씩 반환
//			System.out.println(br.readLine());//한줄씩 값을 문자열로 반환
			String value = "";
			while ((value = br.readLine()) != null) {
				System.out.println(value);
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
//			
}
