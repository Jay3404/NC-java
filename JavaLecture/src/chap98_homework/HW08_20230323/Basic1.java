package chap98_homework.HW08_20230323;

import java.util.Scanner;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 세 개 입력해주세요.");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		StringBuffer result;
		
		StringBuffer sb = new StringBuffer();
		result = sb.append(str1).append(str2).append(str3);
		System.out.println(result);
	}

}
