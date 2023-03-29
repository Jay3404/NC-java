package chap98_homework.HW08_20230323;

import java.math.BigInteger;
import java.util.Scanner;

public class Middle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int a = sc.nextInt();
		
		System.out.println("1부터 "+ a + "까지의 합은 : " + (factorial(BigInteger.valueOf(a))));
		
		System.out.println();
	}
	
	
	
	static BigInteger factorial(BigInteger n) {
		if(n.intValue() == 1) {
			return BigInteger.ONE;
		} else {
			//재귀메소드(함수) : 메소드안에서 해당 메소드 다시 호출
			return n.add(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}
