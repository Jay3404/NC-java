package chap98_homework.HW_20230330;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------조건문--------------------");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int i = Math.max(num1, num2);
		
		while(true) {
			if(num1 % i ==0 && num2 % i == 0) {
				System.out.println("최대공약수는 " + i +"입니다.");
				break;
			}
			i--;
		}
		
		i = 1;
		
		while(true) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println("최소공배수는 " + i + "입니다.");
				break;
			}
			i++;
		}
		
		
		
		b(2);
		
		
		
		
	}
	
	static void b(int n) {
		for(int i=1; i <= 10; i++) {
			
			System.out.println(n + "^" + i + "= " + (int)Math.pow(n, i));
		}
	}

}
