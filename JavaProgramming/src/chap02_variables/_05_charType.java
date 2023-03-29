package chap02_variables;

public class _05_charType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. char 타입의 변수 선언 및 초기화
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';
		
		char ch4 = '가';
		char ch5 = 44032;
		char ch6 = '\uAC00';
		
		//2. 문자를 유니코드 10진수로 변환
		char ch7 = '자';
		//해당 char 타입의 변수를 int 변수에 저장하면
		//10진수 유니코드 값을 추출
		int uniCode = ch7;
		//형변환 char타입 변수 ch7을 int타입으로 변경
		System.out.println((int)ch7);
		
		//3. 빈 칸을 사용할 때는 space 값을 추가해야 된다.
		//그냥 빈칸을 변수의 값으로 지정하면 에러발생
		//char ch8 = '';
		char ch9 = ' ';
		
		//4. char 타입의 변수 출력
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
		System.out.println(uniCode);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
