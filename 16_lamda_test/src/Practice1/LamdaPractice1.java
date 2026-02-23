package Practice1;

public class LamdaPractice1 {
	public static void main(String[] args) {
		String[] arr = {"java","lambda","hi","functinal","wow"};
		printStrings(arr,(str) -> str.length() <= 3);// 1. 길이가 3이하인 경우
//		printStrings(arr,str -> str.length() <= 3);// 1. 길이가 3이하인 경우 // 문자열 1개면 괄호 생략 가능
		System.err.println("======");
		printStrings(arr,(str) -> str.contains("a"));// 2. 문자열에 A포함
		System.err.println("======");
		printStrings(arr,(str) -> str.startsWith("w"));// 2. 문자열에 A포함
		System.err.println("======");
		printStrings(arr,(str) -> (str.length()%2==0&&str.contains("a")));// 2. 문자열에 A포함
	}
	public static void printStrings(String[] arr, StringChecker checker) {
		for(String str : arr) {
			if(checker.check(str)) {
				System.out.println(str);
			}
		}
	}
	
	@FunctionalInterface
	interface StringChecker{
		boolean check(String str);
	}
	
}
