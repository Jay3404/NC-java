package chap02_variables;

public class _07_longType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 선언 및 초기화
		//int num1 = 10000000000;
		//int의 범위를 넘어가는 리터럴은 항상 L, l을
		//붙여줘야 된다.
		//long num2 = 10000000000;
		
		//L과 l을 붙이는 것에 차이는 없다.
		long num3 = 10000000000L;
		long num4 = 10000000000l;
		
		System.out.println(num3 + ", " + num4);
	}

}
