package chap98_homework.HW_20230330._2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------배열--------------------");
		first(sc);
		
	}
	
//	1. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하는 프로그램의 순서도를 그리세요.
	
	static void first (Scanner sc) {
		
		String inputNum = "1";
		int i = 0;
		int[] intArr = new int[100];
		
		while(true){
			System.out.println("숫자를 입력해주세요.");
			inputNum = sc.next();
			if(inputNum.charAt(0) != 'q') {
				intArr[i] = Integer.valueOf(inputNum);
				i++;
			}else if(inputNum.charAt(0) == 'q') {
				break;
			}
		}
		System.out.println(Arrays.toString(intArr));
	}
	
//	2. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하는 프로그램의 순서도를 그리세요.
	static void 
	
	
	
	
	
	
	
	

}
