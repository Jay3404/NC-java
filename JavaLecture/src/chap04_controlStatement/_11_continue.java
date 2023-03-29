package chap04_controlStatement;

import java.util.ArrayList;
import java.util.List;

public class _11_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for문의 continue
		//증감식으로 돌아가는 역할
		for(int i = 0; i < 10; i++) {
			if(i < 5) {
				//0 ~ 4까지는 출력되지 않고 증감식 돌아가서 i를 1 증가시키고
				//다시 조건을 판별
				continue;}
			System.out.println(i);
		}
		
		
		//2. while의 continue
		//while문은 증감식이 없어서 조건식로 돌아간다.
		
		int num = 0;
		while(num <= 20) {
			num ++;
			if (num % 3 ==0)
				continue;
			
			System.out.println(num);
		}
		
		
		//3.
		List<String> memberList = new ArrayList<String>();
		
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).equals("admin"))
				continue;
			String newMemberId = memberList.get(i) + "a";
		}
		
		
		
	}

}
