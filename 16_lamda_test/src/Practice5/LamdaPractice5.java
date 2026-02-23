package Practice5;

import java.util.function.BiFunction;

public class LamdaPractice5 {
	public static void main(String[] args) {
//		Bifunction<>
	}
	
	public static BiFunction<Integer, Integer, Integer> getOperator(String type){
		BiFunction<Integer, Integer, Integer> bi = null;
		
		switch (type) {
		case "+" -> bi = (a,b) -> a+b;
		case "-" -> bi = (a,b) -> a-b;
		case "*" -> bi = (a,b) -> a*b;
		case "/" -> bi = (a,b) -> a/b;
		case "%" -> bi = (a,b) -> a%b;
		default -> throw new RuntimeException("존재하지 않는 연산자 입니다.");
			
			
		}
		return bi;
	}
		
}
