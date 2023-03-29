package chap98_homework.HW07_20230322;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int index = 0;
		System.out.println("문자열을 입력해주세요.");
		String str1 = sc.nextLine();
		
		for(int i = 0; i < str1.length()-1; i++) {
			char str2 = str1.charAt(i);
			if (str2 == '가' || str2 == '바') {
				index ++;
			}
		}
		if (index == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		}else {
			System.out.println("가, 바가 총 " + index + "개 있습니다.");
		}
		
	}

}
