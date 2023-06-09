package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_arrayListEx02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 문자열을 입력
		//길이를 10만큼씩 잘라서
		//ArrayList에 저장
		//남은 문자열의 길이가 10보다 작으면 남은 문자열을 Arraylist에 저장
		// ex) abcdefghijklmnop
		//[abcdefghij, klmnop]
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		String str = sc.next();
		int index = str.length() / 10;
		ArrayList arr = new ArrayList();
		
		for(int i = 0; i <= index; i++) {
			if(index > 0 && index != i) {
				arr.add(str.substring(10*(i), 10*(i+1)));
			}else if (index == i) {
				arr.add(str.substring(10*i, str.length()));
			}
		}
		System.out.println(arr);

	}
	
}
