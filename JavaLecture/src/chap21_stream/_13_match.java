package chap21_stream;

import java.util.ArrayList;
import java.util.List;

public class _13_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList =
				new ArrayList<Integer>();
	
		for(int i = 1; i <= 10; i++) {
			intList.add(i);
		}
		
		//1. 모든 요소가 3의 배수인지
		boolean result = intList.stream()
				   .allMatch(num -> num % 3 == 0);
//		System.out.println(intList.stream()
//			   .allMatch(num -> num % 3 == 0));
		System.out.println("모든 요소가 3의 배수인지 검사 : " 
						+ result);
		
		//2. 2의 배수가 하나라도 있는지
		result = intList.stream()
				   .anyMatch(num -> num % 2 == 0);
		System.out.println("요소중에 2의 배수가 하나라도 "
				+ "있는지 검사 : " + result);
		
		//3. 모든 요소가 11의 배수가 아닌지
		result = intList.stream()
				   .noneMatch(num -> num % 11 == 0);
		System.out.println("모든 요소가 11의 배수가 아닌지"
				+ " 검사 : " + result);
		
		
		
	}

}
