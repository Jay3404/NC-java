package chap03_operator;

public class _02_arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 대입 연산자
		//왼쪽 항의 변수에 오른쪽 항의 값을 대입
		int a = 10;
		int b = 6;
		int c = b;
		
		//2. 산술 연산자
		int num1 = 30;
		int num2 = 7;
		int result;
		
		//덧셈연산
		result = num1 + num2;
		System.out.println("num1 + num2 = " 
						+ result); //37
		
		//뺄셈연산
		result = num1 - num2;
		System.out.println("num1 - num2 = " 
						+ result); //23
		
		//곱셈연산
		result = num1 * num2;
		System.out.println("num1 * num2 = " 
						+ result); //210
		
		//나눗셈연산
		result = num1 / num2;
		System.out.println("num1 / num2 = " 
						+ result); //4
		
		//나머지연산(몇의 배수인지 검사할 때 주로사용)
		//2로 나눈 나머지가 0이면 2의 배수
		//3으로 나눈 나머지가 0이면 3의 배수
		result = num1 % num2;
		System.out.println("num1 % num2 = " 
						+ result); //2

		//3. 복합 대입 연산자
		int num3 = 10;
		int num4 = 3;
		
		num3 += num4; // num3 = num3 + num4;
		System.out.println("num3 += num4 => " 
						+ num3); //10 + 3 = 13
		
		num3 -= num4; // num3 = num3 - num4;
		System.out.println("num3 -= num4 => "
						+ num3); //13 - 3 = 10
		
		num3 *= num4; // num3 = num3 * num4;
		System.out.println("num3 *= num4 => " 
						+ num3); //10 * 3 = 30
		
		num3 /= num4; // num3 = num3 / num4;
		System.out.println("num3 /= num4 => " 
						+ num3); //30 / 3 = 10
		
		num3 %= num4; // num3 = num3 % num4;
		System.out.println("num3 %= num4 => " 
						+ num3); //10 % 3 = 1
		
		
		
		
		
		
	}

}
