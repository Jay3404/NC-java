package chap98_homework.HW07_20230322;

import java.util.Scanner;

public class Middle1 {
	
	public String reverseString(String str1) {
		String result = "";
		for(int i = 0 ; i < str1.length(); i++) {
			result = str1.charAt(i) + result;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Middle1 md = new Middle1();
		
		System.out.println("문자열을 입력해주세요.");
		String str1 = sc.nextLine();
		
		System.out.println(md.reverseString(str1));
	}

}
