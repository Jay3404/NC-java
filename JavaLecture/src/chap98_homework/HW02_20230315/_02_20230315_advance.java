package chap98_homework.HW02_20230315;

import java.util.Random;
import java.util.Scanner;

public class _02_20230315_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 돈의 액수를 입금하세요
//		   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//		   출력 개수는 단위가 큰 것 순서로 계산합니다
//		   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		
		System.out.println("1. 돈을 입금해주세요.");
		
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
		
		int input = sc.nextInt();
		
		while((input / 50000) > 0) {
			a += 1;
			// input = 70000 - 50000 =20000, a = 1;
			input = input - 50000;
		}
		while((input / 10000) > 0) {
			b++;
			input -= 10000;
		}
		while(input / 5000 > 0) {
			c++;
			input -= 5000;
		}
		while(input / 1000 > 0) {
			d++;
			input -= 1000;
		}
		while(input / 500 > 0) {
			e++;
			input -= 500;
		}
		while(input / 100 > 0) {
			f++;
			input -= 100;
		}
		while(input / 50 > 0) {
			g++;
			input -= 50;
		}
		while(input / 10 > 0) {
			h++;
			input -= 10;
		}
		
		System.out.println("오만원 " + a+ "매, 만원 " + b+ "매, 오천원"+c +"매, 천원 "+ d+"매, 500원 "+ e+"개, 100원 "+ f+"개, 50원 "+ g+"개, 10원 "+ h+"개");
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("2. 369게임을 하자");
		
//		2. 369게임을 작성합니다.
//		   1~99까지의 정수를 입력받고
//		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//		   2개가 있으면 "박수짝짝"을 출력하세요
//		   예를 들어 13은 "박수짝"
//		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		
		String inputStr = sc.next();
		String answer = "박수";
		int clapCnt = 0;
		
		for(int i = 0; i < inputStr.length(); i++ ) {
			char ch = inputStr.charAt(i);
			
			if(ch == '3' || ch == '6' || ch == '9') {
				answer += "짝";
				clapCnt++;			
			}
		}
		if (clapCnt > 0) 
			System.out.println(answer);

		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("3. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요.");
		
		String ans1 = "";
		String ans2 = "";
		
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				
				if ((10*i + j) + (10*j + i) == 99) {
					ans1 = ans1 + i + " ";
					ans2 = ans2 + j + " ";
				}			
			}
		}
		System.out.println("A : " + ans1);
		System.out.println("B : " + ans2);
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("4. 별을 출력하여라");

//		4. 다음과 같이 출력하세요.
//			 
//				*
//			   ***
//			  *****
//			 *******
//			*********
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {	
				if (i <= j)
					System.out.print(" ");}
				
			for(int j = 0 ; j < 10; j++ ) {
				if (j < 2 * i + 1)
					System.out.print("*");}
			
			System.out.println();
		}		
	}
}
