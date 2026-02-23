package Practice3;

public class LamdaPractice3 {
	public static void main(String[] args) {
//		MyFunction <String, String> first =  str -> str.toUpperCase();
		MyFunction <String, String> first =  String::toUpperCase;
		System.out.println(first.apply("test"));
		
		MyFunction <String, Boolean> second =  str -> str.length()>=5;
		System.out.println(second.apply("test"));
		
		MyFunction <String, String> third =  str -> {
			String[] arr = str.split("");
			StringBuilder sb = new StringBuilder();
			for(String s : arr) {
				sb.append(s).append("-");
			}
			sb.deleteCharAt(sb.length()-1);
			return sb.toString();
		};
		System.out.println(third.apply("test"));
	}
	
	interface MyFunction<V, B>{
		B apply(V v);
	}
}
