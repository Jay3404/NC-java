package chap98_homework._0329;

import java.util.Scanner;

//--------------------형 변환--------------------
//1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
//
//2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
//
//3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//
//4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
//
//5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
//
//6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a(sc);b(sc);c(sc);d(sc);e(sc);f(sc);
		
	}
	
//1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
	static void a(Scanner sc) {
		System.out.println("두 개의 정수를 입력하세요");
		System.out.print(">>");
		String str1 = sc.next();
		System.out.print(">>");
		String str2 = sc.next();
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result);
	}
	
//2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
	static void b(Scanner sc) {
		System.out.println("두 개의 정수를 입력하세요");
		System.out.print(">>");
		int n1 = sc.nextInt();
		System.out.print("(0입력불가)>>");
		int n2 = sc.nextInt();
		double result = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + result);
	}
	
//3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
	static void c(Scanner sc) {
		System.out.println("한 개의 실수를 입력하세요");
		System.out.print(">>");
		Double d = sc.nextDouble();
//		int reuslt = (int)Math.round(d);
		int reuslt = Integer.parseInt(String.valueOf(Math.round(d)));
		System.out.println("정수형: " +  reuslt);
	}
	
//4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
	static void d(Scanner sc) {
		System.out.println("한 개의 실수를 입력하세요");
		System.out.print(">>");
		Double d = sc.nextDouble();
		Double dResult = d*d;
		String strResult = dResult.toString();
		System.out.println("결과: " + strResult);
	}
	
//5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
	static void e(Scanner sc) {
		int iNum = 10;
		long lNum = 20L;
		
		int iNum2 = iNum;
		long lNum2 = lNum;
		
		iNum = (int) lNum2;
		lNum = iNum2;
	}
	
//6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
	static void f(Scanner sc) {
		System.out.println("문자 두 개를 입력하세요");
		System.out.print(">>");
		char c1 = sc.next().charAt(0);
		System.out.print(">>");
		char c2 = sc.next().charAt(0);
		
		System.out.println("첫 번재 문자의 유니코드: " + (int)c1 );
		System.out.println("두 번째 문자의 유니코드: " + (int)c2 );
	}
}
