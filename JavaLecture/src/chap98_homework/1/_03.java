package chap98_homework._0329;

import java.util.Scanner;

public class _03 {
//	--------------------연산자--------------------
//
//	1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//	  (메소드로 따로 만들지 말고 메인메소드에서 구현)
//
//	2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//
//	3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
//
//	4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//
//	5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
//
//	6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
//
//	7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//
//	8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//	  (메소드로 따로 만들지 말고 메인메소드에서 구현)
	static void a (Scanner sc) {
		System.out.println("두 개의 정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		System.out.print(">>");
		int n2 = sc.nextInt();
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
		System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
		System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
	}
//	2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 
//	21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
	static void b (int n) {
		
	}
	
//	3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
	static void c (Scanner sc) {
		System.out.println("정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		
		if(n1%2==0 && n1%7==0) {
			System.out.println("2와 7의 공배수");
		}else {
			System.out.println("2와 7의 공배수가 아님");
		}
	}
	
	
//	4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
	static void d (Scanner sc) {
		System.out.println("문자열 입력");
		String str = sc.next();
		if(str.equals("Hello")) {
			System.out.println("Hello입니다.");
		}else {
			System.out.println("Hello가 아닙니다.");
		}
	}
	
//	5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
	static void e (Scanner sc) {
		System.out.println("정수 입력");
		int n = sc.nextInt();
		String result = (n%2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}
	
//	6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
	static void f (Scanner sc) {
		System.out.println("정수 입력");
		int n = sc.nextInt();
		String result = n > 100 ? "100보다 큼" : ((n<100) ? "100보다 작음": (n == 100?"100":"나올 수 없는 내용"));
	}
//	7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//
	static void g (Scanner sc) {
		System.out.println("실수 두개 입력");
		System.out.print(">>");
		double d1 = sc.nextDouble();
		System.out.print(">>");
		double d2 = sc.nextDouble();
		System.out.println(d1 + " + " + d2 + " = " + (d1+d2));
		System.out.println(d1 + " - " + d2 + " = " + (d1-d2));
		System.out.println(d1 + " x " + d2 + " = " + (d1*d2));
		System.out.println(d1 + " / " + d2 + " = " + (d1/d2));
		System.out.println(d1 + " % " + d2 + " = " + (d1%d2));
	}
//	8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
	static void h (Scanner sc) {
		System.out.println("문자열 입력");
		System.out.print(">>");
		String str = sc.next();
		System.out.println("정수 입력");
		System.out.print(">>");
		int n = sc.nextInt();
		System.out.println("입력한 문자열 " + str +"이고, 입력한 숫자는 " + n + "입니다.");
	}
}
