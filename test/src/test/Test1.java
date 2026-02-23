package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		IntStream intStream = Arrays.stream(arr);
//		boolean isAllPositive = intStream.anyMatch(n -> n>7);
//		
//		System.out.println(isAllPositive);
		
//		System.out.println(intStream);
//		System.out.println(intStream.sum());
		System.out.println(intStream.count());
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		String[] sArr = {"아자스","야르","무지컬"};
		Stream<String> stream = Arrays.stream(sArr);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,2);
		System.out.println(list.isEmpty());
//		Arrays.stream(list).
		
		
		
		list.stream();
		
		
		
		
	}
}
