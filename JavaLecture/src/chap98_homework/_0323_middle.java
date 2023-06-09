package chap98_homework;

import java.math.BigDecimal;
import java.math.BigInteger;

public class _0323_middle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n문제 1");
		System.out.println(middle1("hello"));
		
		
		System.out.println("\n문제 2");
		String s = "유용한 클래스는 많다. 다양한 라이브러리를 활용한다.";
		System.out.println(middle2(s,6));
		
		
		System.out.println("\n문제 3");
		int money = 10000;	//원금
		double rate = 0.1;	//금리 10퍼
		int year = 10; 		//기간
		middle3(money, rate, year);
		
		System.out.println("\n문제 4");
		int n = 10;
		System.out.println(middle4(n));
		
	}
	
	//1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	//비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
	static StringBuffer middle1(String str) {
		StringBuffer sb = new StringBuffer(30);
		sb.insert(0, str);

		int index = 0;
		
		for(int i=sb.length(); i<sb.capacity(); i++) {
			if(index == 0) {
				sb.insert(i,'b');
				index++;
			}else if(index == 1) {
				sb.insert(i, 'i');
				index++;
			}else if(index == 2) {
				sb.insert(i, 't');
				index -= 2;
			}
		}
		return sb;
	};
	
//2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
//  사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.
	static char middle2(String str, int n) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.charAt(n);	
	}
	
//3. 처음에 은행에 맡긴 돈은 10000원입니다
//  금리는 연 10%입니다
//  복리이자로 계산했을 때 10년후 얼마가 될까요?
	static void middle3(double money, double rate, int year) {
		BigDecimal mo = new BigDecimal(String.valueOf(money));
		BigDecimal ra = new BigDecimal(String.valueOf(rate));
		BigDecimal ye = new BigDecimal(String.valueOf(year));


		for(int i = 1; i <= year; i++){
			//money = money*(money*rate);
			mo = mo.add(mo.multiply(ra));
			System.out.println(i + "년 후의 금액: " + mo + "원");
		}
	}
	
//4. 재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.
	static int middle4(int n) {
		if (n <= 1) {
			return n;
		}else {
			return middle4(n-1) + n;
		}
	}
	
}
