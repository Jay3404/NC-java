package chap98_homework.HW07_20230322;

import java.util.Scanner;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str1 = sc.nextLine();
		
		int num1 = str1.length();
		
		if(num1 % 2 == 0) {
			System.out.println(str1.substring(num1/2 - 1, num1/2 + 1));
		}else {
			System.out.println(str1.substring(num1/2, num1/2 + 1));
		}
		
		
	}

}
