package chap02_variables;

public class _03_scopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 메인메소드 지역변수
		//메인 메소드에서만 사용가능
		int num1 = 100;
		
		//2. 제어문의 지역변수
		if(num1 > 50) {
			int num2 = 50;
			
			//제어문은 메인메소드에 포함되어 있어
			//메인메소드의 지역변수인 num1 사용가능
			System.out.println(num1 + ", " + num2);
		}
		//num2가 제어문의 지역변수이기 때문에 
		//제어문 밖에서는 사용 불가능
		//System.out.println(num1 + ", " + num2);
		
		//메소드의 호출
		//메소드가 호출될 때 
		//메소드의 지역변수가 메모리에 저장
		checkScope(1, 2, 'a');
		callCheckScope();
		//메소드의 호출이 끝났을 때 지역변수가 메모리에서 삭제
		
		//num3 checkScope에서 선언된 지역변수므로
		//메인 메소드에서는 사용할 수 없다.
		//System.out.println(num3);
	}
	
	//메소드
	public static void checkScope(int a, int b, char c) {
		//사용자 정의 메소드 지역변수
		int num3 = 10;
		
		System.out.println(num3);
	}
	
	public static void callCheckScope() {
		checkScope(1, 2, 'a');
	}
}
