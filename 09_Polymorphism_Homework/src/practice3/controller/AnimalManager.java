package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {
	
	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		arr[0] = new Dog("달이","푸들",6);
		arr[1] = new Dog("백구","풍산개",15);
		arr[2] = new Cat("나비","들고양이","경기도","노랑");
		arr[3] = new Dog("황구","진돗개",9);
		arr[4] = new Cat("네로","들고양이","경기도","검정");
//		for(int i = 0;i<arr.length;i++) {
//			arr[i].speak();
//		}
		
		for(Animal ani : arr) {// 뒤쪽은 arr의 길이
			ani.speak();
		}
	}
}
