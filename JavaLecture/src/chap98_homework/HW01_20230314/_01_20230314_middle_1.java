package chap98_homework.HW01_20230314;

public class _01_20230314_middle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 
		 * 출력된 값은 모두 증감연산자가 포함된 상태입니다. 
		 * 11 12 12 10 10 8
		 */
		
		
		
		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--); //후위 증감연산자를 사용하면, 가장 마지막에 계산 -> 출력 먼저하고, 계산
		System.out.println(--num); //값 : 10, 출력 : 10
		System.out.println(num--); //출력 : 10, 값 : 9
		System.out.println(--num); //값 : 8 출력 : 8
		
	}

}
