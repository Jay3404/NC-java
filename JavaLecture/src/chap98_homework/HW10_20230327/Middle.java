package chap98_homework.HW10_20230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import chap98_homework.nc230316.PhoneInfo;

public class Middle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//		  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		Scanner sc = new Scanner(System.in);
//		Map<String, Integer> map1 = new HashMap<String, Integer>();
//		String stu = "";
//		int score;
//		int max = 0;
//		String firstStu = "";
//		
//		System.out.println("문제 1번 : 4명의 학생과 점수를 입력해주세요.");
//		for(int i = 0; i < 4; i++) {
//			stu = sc.next();
//			score = sc.nextInt();
//			map1.put(stu, score);
//			if (max < score) {
//				max = score;
//				firstStu = stu;
//			}
//		}
//		System.out.println("최고점을 맞은 학생은 " + firstStu + "이고, 점수는 " + max + "점입니다.");
//		
//		System.out.println("-------------------------------------------------------");
////		2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서 
////	    Map<String, Integer>에 담은 후 출력하세요. 
////	    ex) {"3" : 1({1, 2}), "4" : 1({1, 3}), "5" : 2({1, 4}, {2, 3})}
//		System.out.println("2번 문제");
//		
//		int[] arr = {1, 2, 3, 4, 5};
//		Map<String, Integer> map2 = new HashMap<String, Integer>();
//		
//		for(int i = 0; i < 5; i ++) {
//			for(int j = 4; j > i; j --) {
//				if (map2.containsKey(String.valueOf(arr[i] + arr[j]))){
//					map2.merge(String.valueOf(arr[i] + arr[j]), map2.get(String.valueOf(arr[i] + arr[j])), (oldValue, newValue) -> oldValue + 1);
//				}else {
//					map2.put(String.valueOf(arr[i] + arr[j]), 1);
//				}
//			}
//		}
//		System.out.println(map2);
//		
//		System.out.println("------------------------------------------------------------------");
		
		
//		3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
		List<PhoneInfo> phList = new ArrayList<PhoneInfo>();
				
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		PhoneInfo pi = new PhoneInfo();
		int tryNum;

		while(true) {
			System.out.println("이름과 전화번호를 입력하실려면 1, 그만입력하시려면 2를 입력해주세요.");
			tryNum = sc.nextInt();
			if (tryNum == 1) {
				System.out.println("이름과 전화번호를 입력해주세요.");
				pi.insertPhoneInfo(sc.next(), sc.next());
			}else if(tryNum == 2) {
				System.out.println("입력을 종료하셨으므로 정보를 출력하겠습니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		Map<String,Object> map3 = pi.loadInfo();
		

		mapList.add(map3.get(map3));
		System.out.println(mapList);
		
		
		
	}
}
