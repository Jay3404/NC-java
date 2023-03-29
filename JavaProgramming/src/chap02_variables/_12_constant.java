package chap02_variables;

class _12_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 상수 선언 및 초기화
		final int COUNT_MONTHS = 12;
		final int COUNT_WEEK_DAYS = 7;
		final double PI = 3.14;
		final int MAX_VALUE;
		
		//2. 상수를 선언만 해놓은 상태에서 초기화
		MAX_VALUE = 100;
		
		//3. 상수의 값 변경 시 에러발생
		//값이 지정되지 않은 상수에는 값을 저장할 수 있지만
		//이미 값이 저장된 상수의 값은 변경할 수 없다.
		//COUNT_WEEK_DAYS = 10;
		
		//4. 상수 출력
		System.out.println(MAX_VALUE);
		
		System.out.println("1년은 " + COUNT_MONTHS +
				"개월입니다.");
		System.out.println("일주일은 " + COUNT_WEEK_DAYS +
				"일입니다.");
		System.out.println("반지름이 2인 원의 넓이는 " +
				(2 * 2 * PI) + "입니다.");
		
		
		
		
		
		
		
		
	}

}
