package chap98_homework.HW10_20230327;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 문제 : 문자열을 입력해주세요.");
		
		String str = sc.next();
		char maxKey = 'a';
		int max = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i ++) {
			if (map.containsKey(str.charAt(i))){
				map.merge(str.charAt(i), map.get(str.charAt(i)), (oldValue, newValue) -> oldValue + 1);
				if(max < map.get(str.charAt(i))) {
					max = map.get(str.charAt(i));
					maxKey = str.charAt(i);
				}
			}else {
				map.put(str.charAt(i), 1);
			}
			
		}
		System.out.println(map);
		System.out.println("가장 많이 등장하는 문자는 " + maxKey + "이고, 등장하는 횟수는 " + max + "입니다.");
		
		System.out.println("---------------------------------------------------------");
		
//		2. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력
		
		List<Integer> arr = new ArrayList<Integer>();
		int score;
		int max1 = 0;
		int value1 = 0; 
		int value2 = 0;
		
		System.out.println("문제 2번 : 5개의 정수 값을 입력해주세요.");
		for(int i = 0; i < 5; i++) {
			score = sc.nextInt();
			arr.add(score);
		}
		for(int i = 0; i < 5; i ++) {
			for(int j = 4; j > i; j --) {
				if (arr.get(i) + arr.get(j) > max1){
					max1 = arr.get(i) + arr.get(j);
					value1 = arr.get(i);
					value2 = arr.get(j);
				}
			}
		}
		System.out.println("가장 큰 정수는 " + max1 + "이고, 그 값은 " + value1 +", "+ value2 + "입니다.");
		
		System.out.println("-------------------------------------------------------");

//		3. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		
		List<Integer> arr1 = new ArrayList<Integer>();
		int inputNum = 0;
		ArrayList valueNum = new ArrayList();
		
		System.out.println("3번 문제 : 6개의 숫자를 입력하세요.");
		for(int i = 0; i < 6; i++) {
			inputNum = sc.nextInt();
			arr1.add(inputNum);
		}
		
		
		
	}

}
