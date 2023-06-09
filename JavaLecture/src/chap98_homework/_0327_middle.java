package chap98_homework;

import java.util.*;

public class _0327_middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//        4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
        
//        Map<String, Integer> map1 = new HashMap<>();
//        String top = "";
//        int max = 0;
//        for (int i = 0; i < 4; i++) {
//            System.out.print("이름>>");
//            String name = sc.next();
//            System.out.print("점수>>");
//            int score = sc.nextInt();
//            map1.put(name, score);
//            
////            if (max < score) {
////                max = score;
////                top = name;
////            }
//        }
        
//        Iterator<String> it = map1.keySet().iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            if (max < map1.get(key)) {
//                max = map1.get(key);
//                top = key;
//            }
//        }
//        System.out.println("이름: " + top + " / " + "점수: " + max);


//        2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서
//        Map<String, Integer>에 담은 후 출력하세요.
//        ex) {"3" : 1({1, 2}), "4" : 1({1, 3}), "5" : 2({1, 4}, {2, 3})}
        int[] intArr = {1, 2, 3, 4, 5};
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < intArr.length-1; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                int sum = intArr[i] + intArr[j];
                String strSum = Integer.toString(sum);
                if (map2.get(strSum) == null) {
                    map2.put(strSum, 1);
                }else {
                    map2.put(strSum, map2.get(strSum)+1);
                }
            }
        }

        System.out.println(map2);








//        3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
        List<PhoneInfo> phoneList =
                new ArrayList<>();
//        for(int i=0; i<5; i++) {
//        	System.out.print("이름>> ");
//        	String name = sc.next();
//        	System.out.print("번호>> ");
//        	String num = sc.next();
//        	phoneList.add(
//                    new PhoneInfo(name, num)
//                );
//        }
        int tryNum = 0;
        String name;
        String num;
        
        while(true) {
			System.out.println("이름과 전화번호를 입력하실려면 1, 그만입력하시려면 2를 입력해주세요.");
			tryNum = sc.nextInt();
			if (tryNum == 1) {
				System.out.print("이름>> ");
	        	name = sc.next();
	        	System.out.print("번호>> ");
	        	num = sc.next();
	        	phoneList.add(
	                    new PhoneInfo(name, num)
	                );
			}else if(tryNum == 2) {
				System.out.println("입력을 종료하셨으므로 정보를 출력하겠습니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
        
        List<Map<String, String>> mapList =
                new ArrayList<>();

        for (PhoneInfo p : phoneList) {
            Map<String, String> map =
                    new HashMap<>();
            map.put("name", p.getName());
            map.put("phoneNum", p.getPhoneNum());

            mapList.add(map);
        }

        for(int i = 0; i < mapList.size(); i++) {
            System.out.println(mapList.get(i));
        }

    }
}
