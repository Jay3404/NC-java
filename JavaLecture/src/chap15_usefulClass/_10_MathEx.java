package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 5개 정수 입력 => 배열에 저장
		
		//Math.max와 Math.min을 이용하여 
		//최소값, 최대값 구하기
		
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[5];
		
		
		System.out.println("정수 5개를 입력해주세요.");
		intArr[0] = sc.nextInt();
		intArr[1] = sc.nextInt();
		intArr[2] = sc.nextInt();
		intArr[3] = sc.nextInt();
		intArr[4] = sc.nextInt();
		
		int Max = intArr[0];
		int Min = intArr[0];
		
		for(int i = 0; i < intArr.length; i++) {
			if (Max < Math.max(intArr[0], intArr[i])) {
				Max = Math.max(intArr[0], intArr[i]);
			}
		}
		for(int i = 0; i < intArr.length; i++) {
			if (Min > Math.min(intArr[0], intArr[i])) {
				Min = Math.min(intArr[0], intArr[i]);
			}
		}
		
		System.out.println("Max : " + Max +", Min : " + Min);
		
	}

}
