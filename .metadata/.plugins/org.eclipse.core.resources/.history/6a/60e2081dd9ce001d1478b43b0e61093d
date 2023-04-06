package chap98_homework._0329;
//--------------------반복문--------------------
//1. 1부터 10까지의 정수의 합을 출력하세요.
//
//2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//
//3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//
//4. 사용자가 입력한 정수의 약수를  출력하세요.
//
//5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//
//6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//
//7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
//
//8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//
//8-1. *
//     **
//     ***
//     ****
//     *****
//
//8-2. *****
//      ****
//       ***
//        **
//         *
//
//9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.

import java.util.Iterator;
import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		i(sc);
	}
//	--------------------반복문--------------------
//	1. 1부터 10까지의 정수의 합을 출력하세요.
//
	static void a() {
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		System.out.println(result);
	}
//	2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//
	static void b(int n) {
		for(int i=0; i<10; i++) {
			int cnt = 1;
			System.out.print(n);
			for(int j=0; j<=i; j++) {
				System.out.print(" * " + n);
				cnt++;
			}
			System.out.println(" = " + (int)Math.pow(n, cnt));
		}
	}
//	3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//
	static void c (int n) {
		for(int i=1; i<=n; i++) {
			int chk = 0;
			for(int j=1; j<=n; j++) {
				if(i%j == 0) {
					chk++;
				}
			}
			if(chk == 2) {
				System.out.println("소수 :" + i);
			}
		}
	}
	
//	4. 사용자가 입력한 정수의 약수를  출력하세요.
//
	static void d (int n) {
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(n + "의 약수" + i);
			}
		}
	}
//	5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//
	static void e (Scanner sc) {
		int[] arr = new int[10];
		System.out.println("10개의 정수 입력");
		for(int i=0; i<arr.length; i++) {
			System.out.print(">>");
			arr[i] = sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
//	6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//
	static void f (Scanner sc) {
		System.out.println("문자열 입력");
		System.out.print(">>");
		String str = sc.next();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
//	7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
//
	static void g (Scanner sc) {
		System.out.println("두 개의 정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		System.out.print(">>");
		int n2 = sc.nextInt();
		int 최대공약수 = gcd(n1, n2);
		int 최소공배수 = n1 * n2 / 최대공약수;

		System.out.println("최대공약수 :" + 최대공약수);
		System.out.println("최소공배수 :" + 최소공배수);
			
	}
	static  int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
//	8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//
//	8-1. *
//	     **
//	     ***
//	     ****
//	     *****
//
//	8-2. *****
//	      ****
//	       ***
//	        **
//	         *
//
	static void h() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
//	9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
	static void i(Scanner sc) {
		int sum = 0;
		
		while(true) {
			System.out.print(">>");
			char c = sc.next().charAt(0);
			if(c == 'q') {
				break;
			}else {
				sum += c-'0';
			}
		}
		System.out.println("총 합계: " + sum);
	}
	
}
