package chap98_homework.HW10_20230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		
		System.out.println("1번 문제 : 정수를 5개 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		
		System.out.println("--------------------------------------------");
//		2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
		LinkedList list = new LinkedList();
		System.out.println("2번 문제 : 정수를 5개 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		list.set(3, 100);
		list.set(4, 200);
		System.out.println(list);
		System.out.println("--------------------------------------------");
		
//		3. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		System.out.println("3번 문제 : 알파벳을 하나 입력해주세요.");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String str = sc.next();
		
		while(true) {
			if(str.length() > 1) {
				System.out.println("알파벳 하나를 다시 입력해주세요.");
				str = sc.next();
			}else {
				break;
			}
		}
		char result = (char)str.charAt(0);
		map.put(str, (int)result);
		System.out.println(map);
		
		
	}

}
