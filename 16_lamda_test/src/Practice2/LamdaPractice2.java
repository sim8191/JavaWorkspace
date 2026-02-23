package Practice2;

import java.net.InetAddress;

public class LamdaPractice2 {
	public static void main(String[] args) {
		
		Calculator<Integer> adder = (x, y) -> x + y;
		System.out.println(adder.operate(10, 20));
		
		Calculator<Integer> adder2 = (x, y) -> x * y;
		System.out.println(adder2.operate(10, 20));
		
		Calculator<Integer> adder3 = Math::max;
		System.out.println(adder3.operate(10, 20));
		
		Calculator<String> adder4 = (a,b) -> a+"-"+b;
		System.out.println(adder4.operate("test","test2"));
		
//		Calculator<Integer> adder = (x) -> x + x;
//		System.out.println(adder.add(10));
//		
//		Calculator2<Integer> findMax = (int x, int y) -> {
//			if(x<y) {
//				return y;
//			}else {
//				return x;
//			}
//		};
//		System.out.println(findMax.Max(10,20));
//		
//		Calculator3<String> combiner = (String str1, String str2) -> {
//			String test = str1 + str2;
//			System.out.println(test);
//			return 0;
//		};
//		combiner.addstr("test1","test2");
		
	}
	
	
	interface Calculator <V>{
		V operate(V v1, V v2);
	}
	
	interface Calculator1 <V>{
//		V operate(V v1, V v2);
		int add(int v);
	}
	
	interface Calculator2 <V>{
//		V operate(V v1, V v2);
		int Max(int v1, int v2);
	}
	interface Calculator3 <V>{
//		V operate(V v1, V v2);
		int addstr(String v1, String v2);
	}
}
