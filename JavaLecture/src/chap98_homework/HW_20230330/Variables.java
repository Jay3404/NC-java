package chap98_homework.HW_20230330;

import java.util.Arrays;
import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------------------변수--------------------");
		System.out.println("1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		System.out.println("이름 : " + str1 + ", 나이 : " + str2 + ", 성별 : " + str3);
		
		System.out.println("2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.");
		System.out.println("정수 2개와 연산자 하나를 입력해주세요.");
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		String char1 = sc.next();
		
		if(char1.charAt(0) == '+') {
			System.out.println(int1 + " + " + int2 + " = " + (int1 + int2));
		}
		else if(char1.charAt(0) == '-') {
			System.out.println(int1 + " - " + int2 + " = " + (int1 - int2));
		}
		else if(char1.charAt(0) == '*') {
			System.out.println(int1 + " * " + int2 + " = " + (int1 * int2));
		}
		else if(char1.charAt(0) == '/') {
			System.out.println(int1 + " / " + int2 + " = " + (int1 / int2));
		}
		else if(char1.charAt(0) == '%') {
			System.out.println(int1 + " % " + int2 + " = " + (int1 % int2));
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		System.out.println("3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)\r\n"
				+ "    단, 원주율 3.14는 상수로 선언하세요.");
		
		final double PI = 3.14;
		int radius = 20;
		
		System.out.println("넓이 : " + (20 * 20 * PI) + ", 둘레 : " + (2 * 20 * PI));
		
		System.out.println("4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.");
		
		int sum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		
		System.out.println("합계 : " + sum + ", 평균 : " + (sum / 5));
		
		System.out.println("5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.");
		
		Integer[] intArr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		Arrays.sort(intArr);
		
		System.out.print("최소 값은 " + intArr[0]);
		System.out.print(", 중간 값은 " + intArr[1]);
		System.out.println(", 최대 값은 " + intArr[2]);
		
		System.out.println("6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2\r\n"
				+ "											  2 * 2 = 4\r\n"
				+ "											  .....\r\n"
				+ "											  2 * 9 = 18 ");
		
		int a = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
		
		System.out.println("7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)");
		
		int result = 1;
		
		int b = sc.nextInt();
		for(int i = 1; i <= b; i++) {
			result *= i;
		}
		System.out.println(result);
		
		System.out.println("8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)\r\n"
				+ "   사용자가 입력할 수 있는 값은 2 ~ 30로 제한");
		
		int[] input1 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int count = 0;
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 2; j <= 30; j++) {
				if(input1[i] != j) {
					if(input1[i] % j == 0) {
						cnt++;
					}
				}
			}
			if(cnt == 0) {
				count++;
			}else {
				cnt = 0;
			}
		}System.out.println("소수의 개수 : " + count);
		
		
		
		
		
		
		
	}

}
