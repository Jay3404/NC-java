package chap98_homework.HW07_20230322;

import java.util.Scanner;

public class Basic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 두 개 입력해주세요.");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		if(str1.contains(str2)) {
			System.out.println("포함합니다.");
		}else {
			System.out.println("포함하지 않습니다.");
		}

	}
}
