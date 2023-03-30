package chap98_homework._0329;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

//--------------------변수--------------------
//1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
//
//2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
//
//3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//    단, 원주율 3.14는 상수로 선언하세요.
//
//4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//
//5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
//
//6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//											  2 * 2 = 4
//											  .....
//											  2 * 9 = 18 
//
//7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
//
//8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a(sc);b(sc);c(20);d(sc);e(sc);f(sc);g(sc);h(sc);
		
		
	}
	
	//1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
	static void a (Scanner sc) {
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("나이>>");
		int age = sc.nextInt();
		System.out.print("성별을>>");
		String gender = sc.next();
		System.out.println("이름: " + name +"\n나이: " + age + "\n성별: " + gender);
	}
	
	//2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
	static void b (Scanner sc) {
		System.out.print("정수1 >>");
		int n1 = sc.nextInt();
		System.out.print("정수2 >>");
		int n2 = sc.nextInt();
		System.out.print("연산기호(+, -, *, /, %) >>");
		char c = sc.next().charAt(0);
		int result = 0;
		switch(c) {
		case '+': result = n1 + n2; break;
		case '-': result = n1 - n2; break;
		case '*': result = n1 * n2; break;
		case '/': result = n1 / n2; break;
		case '%': result = n1 % n2; break;
		}
		System.out.println(n1 +" "+ c + " " +n2 + " = " + result);
	}
	
//3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//  단, 원주율 3.14는 상수로 선언하세요.
	static void c(int radius) {
		final double PI = 3.14;
		//연산 및 처리
		double area = PI * radius * radius;
		double length = 2 * PI * radius;

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);
	}
	
// 4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
	static void d(Scanner sc) {
		int sum = 0;
		double avg = 0.0;
		int[] intArr = new int [5];
		System.out.println("정수 5개를 입력하세요");
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}
		avg = sum / 5;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
	
//5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
	static void e (Scanner sc) {
		int[] intArr = new int [3];
		System.out.println("정수 3개를 입력하세요");
		for(int i=0; i<3; i++) {
			System.out.print(">>");
			intArr[i] = sc.nextInt();
		}
		Arrays.sort(intArr);
		System.out.println("최소 값: " + intArr[0]);
		System.out.println("중간 값: " + intArr[1]);
		System.out.println("최대 값: " + intArr[2]);
	}
	
//6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//	  2 * 2 = 4
//	  .....
//	  2 * 9 = 18 
	static void f(Scanner sc) {
		System.out.print("구구단 단을 입력하세요 >>");
		int n = sc.nextInt();
		for(int i=1; i<10; i++) {
			int nn = n*i;
			System.out.println(n + " * " + i + " = " + nn);
		}
	}
	
//7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
	static void g(Scanner sc) {
		System.out.print("팩토리얼 정수>>");
		int n = sc.nextInt();
		BigInteger result = new BigInteger(String.valueOf(n));
		for(int i=n-1; i>=1; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.println("결과 :" + result);
	}
//8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//  사용자가 입력할 수 있는 값은 2 ~ 30로 제한
	static void h (Scanner sc) {
		int[] intArr = new int[10];
		int cnt = 0;
		System.out.println("정수 10개를 입력하세요");
		
		for(int i=0; i<10; i++) {
			System.out.print("2~30 >>");
			int n = sc.nextInt();
			
			if(n >= 2 || n <= 30) {
				intArr[i] = n;
			}else {
				System.out.println("범위 밖의 숫자입니다.");
				i--;
			}
		}
		
		for(int i : intArr) {
			int chk = 0;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					chk++;
				}
			}
			if(chk == 1) {
				cnt++;
			}
		}
		System.out.println("소수의 개수: " + cnt);
	}
	
}
