package chap02_variables;

public class _04_byteType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. byte타입의 변수 선언 및 초기화
		byte num1 = -128;
		byte num2 = 127;
		
		//2. byte의 범위를 넘어가는 값의 할당
		//타입의 표현 범위보다 큰 값을 할당하면 에러발생
		//byte num3 = -129;
		//byte num4 = 128;
		
		//3. 선언된 변수의 값을 범위를 초과하도록 변경했을 때
		//증감연산자 --, ++
		//num1--; => num1 = num1 - 1;
		//num2++; => num2 = num2 + 1;
		num1--;
		
		//범위의 최소값보다 작아질 경우 127부터 다시 시작
		System.out.println(num1);
		
		num2++;
		//범위의 최대값보다 커질 경우 -128부터 다시 시작
		System.out.println(num2);
	}

}
