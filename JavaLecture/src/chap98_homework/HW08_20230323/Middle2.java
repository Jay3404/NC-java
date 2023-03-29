package chap98_homework.HW08_20230323;

import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력해주세요.");
		int a = sc.nextInt();
		String str1 = "유용한 클래스는 많다. 다양한 라이브러리를 활용한다.";
		
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();
		
		System.out.println(sb.charAt(a));
		
	}

}
