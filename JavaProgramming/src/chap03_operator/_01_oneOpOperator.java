package chap03_operator;

public class _01_oneOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 부호연산자
		int num1 = 10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println("------------------");
		
		//2-1. 전위 증감연산자
		int num2 = 10;
		
		System.out.println(++num2); //출력: 11, 값: 11
		System.out.println(--num2); //출력: 10, 값: 10
		System.out.println("------------------");
		
		//2-2. 후위 증감연산자
		int num3 = 10;
		
		System.out.println(num3++); //출력: 10, 값: 11
		System.out.println(num3--); //출력: 11, 값: 10
		System.out.println("------------------");
		
		//3. 전위, 후위 증감연산자 혼합
		int num4 = 10;
		
		System.out.println(++num4); //출력: 11, 값: 11
		System.out.println(num4--); //출력: 11, 값: 10
		System.out.println(num4++); //출력: 10, 값: 11
		
		System.out.println(num4); //출력: 11, 값: 11
		
		
		
		
		
		
		
		
		
		
		
	}

}
