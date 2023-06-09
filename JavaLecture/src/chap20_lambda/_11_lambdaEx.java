package chap20_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap20_lambda.clazz.UserCharString;

public class _11_lambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<UserCharString> ucsList = new ArrayList<UserCharString>();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("문자열을 입력하세요");
			ucsList.add(new UserCharString(sc.next()));
		}
		
		System.out.println("찾을 문자를 입력하세요.");
		char ch = sc.next().charAt(0);

		
		for(UserCharString u : ucsList) {
			u.changeStr(ch, (c, s) -> {
				String returnStr = "";
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == c) {
						returnStr = s;
					}
				}
				return returnStr;
			});
		}
		
		System.out.println(ucsList);
		
		sc.close();
	}

}
