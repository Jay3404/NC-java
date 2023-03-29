package chap02_variables;

public class _01_initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수의 선언과 사용
		//1. 변수의 선언
		int num1;
		int num2;
		
		//2. 같은 자료형의 변수 여러개 선언
		int num3, num4, num5;
		
		//3. 값의 할당
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		//4. 변수의 선언과 동시에 초기화
		int num6 = 60;
		
		//5. 초기화되지 않은 변수의 사용은 에러를 발생시킴
		//System.out.println(num4);
		//System.out.println(num5);
		
		//6. 값이 할당된 변수의 사용
		//연산을 하거나 출력에 변수를 사용한다.
		//연산의 결과를 통한 초기화
		int result = num1 + num2;
		
		System.out.println(result);
		System.out.println("num6 = " + num6);
		
		//7. 값의 변경
		num6 = 100;
		System.out.println("num6 = " + num6);
	}

}
