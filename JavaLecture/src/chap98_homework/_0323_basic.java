package chap98_homework;

public class _0323_basic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n문제 1");
		String str1 = "a"; String str2 = "a"; String str3 = "a";
		System.out.println(basic1(str1, str2, str3));
			
		System.out.println("\n문제 2");
		System.out.println(basic2("hello"));
		
//		3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)
		System.out.println("\n문제 3");
		double d = 16.459;
		System.out.println((double)Math.round(d*100)/100);
		
		
//		4. 문자열 "145.987", "-563.11" 을 double형으로 변경하여
//	     덧셈의 결과를 출력하세요.
		
		String s = "145.987";
		String s1 = "-563.11";
		
		double s2 = Double.parseDouble(s);
		double s3 = Double.parseDouble(s1);
		
		System.out.println(s2 + s3);
		
	}
	
//	1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용필수).
	static StringBuffer basic1(String str1, String str2, String str3) {
		StringBuffer sb = new StringBuffer();
		sb.append(str1); sb.append(str2); sb.append(str3);
		return sb;
	}
	
//	2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//    비어있는 바이트의 공간을 a로 모두 채우시오.
	static StringBuffer basic2(String str) {
		StringBuffer sb = new StringBuffer(30);
		sb.insert(0, str);
		for(int i=sb.length(); i<sb.capacity(); i++) {
			sb.insert(i, 'a');
		}
		return sb;
	};
	
}
