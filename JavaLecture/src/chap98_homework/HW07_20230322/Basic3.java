package chap98_homework.HW07_20230322;

import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		
		String str1 = sc.nextLine();
		
		System.out.println(str1.replaceAll("a|e|i|o|u|A|E|I|O|U", ""));
		
		
	}

}
