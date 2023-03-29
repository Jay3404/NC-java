package chap98_homework.HW03_20230316;

public class _03_20230316_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. int배열 10개 생성 후 3의 배수를 거꾸로 출력해라.");
//		1.int배열을 10개 생성해라.
//		 int배열에 3의 배수를 차례대로 저장해라.
//		 그리고 거꾸로 출력해라.
		
		int[] arr = new int[10];
		int x = 0;
		int y = 0;
		
		
		while(x < arr.length) {
			y++;
			if (y % 3 == 0) {
				arr[x++] = y; 
			}
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("2. int배열 10개 생성 후 사용자로부터 값을 받아 출력후 총합을 구하라.");
		
//		2.int배열을 10개 생성해라
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 
//		  총합을 구하세요

		
		
		
		
		
		
		
		
		
		
		
		
		
//		3.int 배열로 10개의 공간을 생성하라
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하라
//		  
//		4. 정수 10개를 입력받아 배열에 저장하고, 
//		이 정수중에서 2의 배수와 3의 배수를 출력하세요
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
