package chap02_variables;

public class _10_booleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. int타입 변수 선언 및 초기화
		int num1 = 10;
		int num2 = 15;
		
		//2. boolean타입 변수 선언 및 연산을 통한 초기화
		//삼항연산자 조건 ? 결과1 : 결과2
		//조건이 true일 경우 결과1, false일 때는 결과2
		boolean result1 = num1 % 2 == 0 ? true : false;
		boolean result2 = num2 % 2 == 0 ? true : false;
		
		//3. boolean타입 값 출력
		System.out.println(result1);
		System.out.println(result2);
	}

}
