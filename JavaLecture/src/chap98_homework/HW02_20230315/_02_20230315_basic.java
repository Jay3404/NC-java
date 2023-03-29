package chap98_homework.HW02_20230315;

public class _02_20230315_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 10 ~ 1까지 거꾸로 while문으로 출력
		System.out.println("1. 10 ~ 1까지 거꾸로 while문으로 출력");
		int i = 10;
		while(true) {
			if(i < 1)
				break;
			System.out.print(i + " ");
			i--;}
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력");
		
		i = 10;
		do {
			System.out.print(i + " ");
			i--;
		} while(i>0);
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("3. 10 ~ 1까지 거꾸로 for문으로 출력");
		
		for(i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("4. 1 ~ 100까지 합을 while문으로 출력");
		
		i = 1;
		int sum = 0;
		
		while(true) {
			sum += i;
			i++;
			if (i > 100) {
				System.out.println(sum);
				break;
			}
		}

		System.out.println("-----------------------------------");
		System.out.println("5. 1 ~ 100까지 합을 do ~ while문으로 출력");
		
		i = 1;
		sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i <= 100);
		System.out.println(sum);
		
		System.out.println("-----------------------------------");
		System.out.println("6. 1 ~ 100까지 합을 for문으로 출력");
		
		sum = 0;
		for(i = 1 ;i <= 100; i++) {
			sum += i;	
		}System.out.println(sum);
		
		
		
	}

}
