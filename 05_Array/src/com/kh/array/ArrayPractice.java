package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		
		int[] arran = new int[10];
		// 배열의 길이만큼 반복 진행
		for(int i =0;i<arran.length;i++) {
			arran[i] = 10-i;
		}
		for(int i =0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
		}
		System.out.println(Arrays.toString(arran));
		
		
	}
	
	public void practice2(){
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("잘못된 숫자");
			practice2();
			return;
		}
		
		int[] arran = new int[num];
		
		for(int i = 0;i<num;i++) {
			arran[i] = i+1;
		}
		
		for(int i =0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
		}
		System.out.println(Arrays.toString(arran));
	}
	
	public void practice3() {
		int[] arran = new int[10];
		
		for(int i = 0;i<arran.length;i++) {
			arran[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i =0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
		}
		System.out.println(Arrays.toString(arran));
	}
	
	public void practice4() {
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
//		if(num<0||6<num) {
//			System.out.println("잘못 입력하셨습니다.");
//			practice4();
//			return;
//		}
		
		if(!(num>=0&&6<=num)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		String[] str = {"월","화","수","목","금","토","일"};
		System.out.println(str[num]+"요일");
	}
	
	public void practice5() {
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("잘못된 숫자");
			practice5();
			return;
		}
		
		int i = 0;
		
		int[] arran = new int[num];
		
		while(i<num) {
			System.out.println("배열"+i+"번째 인덱스에 넣을 값 : ");
			arran[i] = sc.nextInt(); 
			i++;
		}
		int sum = 0;
		for(i = 0;i<arran.length;i++) {
			System.out.print(arran[i]+" ");
			sum += arran[i];
		}
		
		System.out.println("\n총 합 : "+sum);
		
			
	}
	
	public void practice6() {
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
	        boolean bool = false; 
	        
	        for(int j = 0; j < count; j++) {
	            if(str.charAt(i) == ch[j]) {
	            	bool = true;
	                break; 
	            }
	        }
	        
	        if(!bool) {
	            ch[count] = str.charAt(i);
	            count++;
	        }
	    }
		System.out.print("문자열에 있는 문자 : ");
		for(int j = 0; j < count; j++) {
			System.out.print(ch[j]+" ");
        }
		
		
		System.out.println("\n문자 개수 : " + count);
			
		
		
	}
	
	public void practice7() {
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] chtest = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			chtest[i] = str.charAt(i);
		}
//		char[] arr = str.toCharArray();//문자열을 문자배열로 변경하는 매서드.
//		위의 for문이랑 같은거임
		
		int count = 0;
		System.out.print(str+"에 "+ch+"가 존재하는 위치 : ");
		for(int i = 0; i < chtest.length; i++) {
			if(chtest[i]==ch) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+ch + " 개수 : " + count);
		
		
	}
	
	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] ch = new char[str.length()];
//		char[] origin = str.toCharArray();//원본 배열
//		char[] copy = Arrays.copyOf(origin, origin.length);//복사본
		
		for(int i=0;i<str.length();i++) {
			if(7<i) {
				ch[i] = '*';
			}else {
				ch[i] = str.charAt(i);
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
	}
	
	public void practice9() {
//		int[] num = new int[10];
//		for(int i = 0;i < num.length;i++) {
//			num[i] = (int)(Math.random()*10+1);
//		}
//		for(int i = 0;i < num.length;i++) {
//			System.out.print(num[i] + " ");
//		}
//		
//		int max = 0, min = 10;
//		for(int i = 0;i < num.length;i++) {
//			if(max<num[i]) {
//				max = num[i];
//			}
//			if(min>num[i]) {
//				min = num[i];
//			}
//		}
//		System.out.println("\n최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		int[] arr = new int [10];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		//최대값, 최소값
		int max = arr[0], min = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice10() {
//		int[] num = new int[10];
//		int count = 0;
//		
//		loop1:
//		while(count<10) {
//			num[count] = (int)(Math.random()*10+1);
//			for(int i = 0;i < count;i++) {
//				if(num[count]==num[i]) {
//					continue loop1;
//				}
//			}
//			count++;
//		}
//		
//		for(int i = 0;i < num.length;i++) {
//			System.out.print(num[i] + " ");
//		}
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			for(int j = 0;j<i;j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	
	public void practice11() {
//		System.out.println("정수 : ");
//		int num = sc.nextInt();
//		if(num < 3||num%2==0) {
//			System.out.println("다시 입력하세요.");
//			practice11();
//			return;
//		}
//		int[] num2 = new int[num];
//		int count = 0;
//		for(int i=0;i<num;i++) {
//			if(i<((num/2)+1)) {
//				num2[i] = ++count;
//			}else {
//				num2[i] = --count;
//			}
//		}
//		for(int i=0;i<num2.length;i++) {
//			System.out.print(num2[i] + " ");
//		}
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if(!(num % 2 == 1 && num >= 3)) {
			System.out.println("다시 입력");
			practice11();
			return;
		}

		int[] arr = new int[num];
		int mid = num / 2;
		
		int value = 0;
		for(int i=0;i<arr.length;i++) {
			if(i<=mid) {
				arr[i] = ++value;
			}else {
				arr[i] = --value;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		String[] origin = new String[size];
		
		sc.nextLine(); // 개행문자 제거
		
		for (int i=0;i<origin.length;i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			origin[i] = sc.nextLine();// 띄어쓰기 포함.
		}
		
		while(true) {
			//추가 입력시
			System.out.println("추가 입력을 하시겠습니까?");
			char ch = sc.next().charAt(0);
			
			
			if(ch == 'Y'||ch == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
	            int addSize = sc.nextInt();
	            sc.nextLine();
	            
	            int Psize = origin.length;
	            
	            origin = Arrays.copyOf(origin, origin.length + addSize);
	            
				for (int i=Psize;i<Psize+addSize;i++) {
					System.out.print((i + 1) + "번째 문자열 : ");
					origin[i] = sc.nextLine();
				}
				
			}else {
				System.out.println(Arrays.toString(origin));
				break;
			}
		}
		
	}
	
	public void upDown() {

		int num1 = (int) ((Math.random() * 100 + 1));
		int count = 1;
		while (true) {
			System.out.print("1~100사이의 난수를 맞춰보세요.");
			int num2 = sc.nextInt();
			if (num2 < 0 || 100 < num2) {
				System.out.println("1~100사이의 숫자를 입력해주세요.");
				continue;
			}

			if (num1 < num2) {
				System.out.println("DOWN !");
			} else if (num1 > num2) {
				System.out.println("UP !");
			} else {
				System.out.println("정답입니다.");
				System.out.println(count + "회만에 맞추셨습니다.");
				break;
			}
			count++;
		}
	}

	public void rps() {
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		String rsp = "";
		String comrsp = "";
		
		int some = 0, wins = 0, loss = 0, draw = 0;
		
		while (true) {
			System.out.println("가위바위보 : ");
			rsp = sc.next();
			
			if(rsp.equals("exit")) {
				System.out.println(some+"전 "+ wins +"승 " + draw+"무 "+ loss+"패");
				break;
			}
			
			if(!(rsp.equals("가위")||rsp.equals("바위")||rsp.equals("보"))) {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
			
			int random = 0;
			while (true) {
				random = (int)((Math.random()*10 + 1));
				if(random == 10){
					continue;
				}else {
					break;
				}
			}
			
			switch(random) {
				case 1,2,3:{
					comrsp="가위";
					break;
				}case 4,5,6:{
					comrsp="바위";
					break;
				}default : {
					comrsp="보";
				}
			}
			
			System.out.println("컴퓨터 : "+comrsp);
			System.out.println(name+" : "+rsp);
			some++;
			if(comrsp.equals(rsp)){
				System.out.println("비겼습니다.");
				draw++;
			}else if((comrsp.equals("가위")&&rsp.equals("바위"))||
					(comrsp.equals("바위")&&rsp.equals("보"))||
					(comrsp.equals("보")&&rsp.equals("가위"))){
				System.out.println("이겼습니다.");
				wins++;
			}else {
				System.out.println("졌습니다.");
				loss++;
			}
		}
	}
}

