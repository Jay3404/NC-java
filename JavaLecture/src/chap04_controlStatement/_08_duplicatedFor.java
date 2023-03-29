package chap04_controlStatement;

import java.util.Scanner;

public class _08_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("2~9까지 입력. 0 종료 : ");
			num = sc.nextInt();
			
			if(num == 0 || num == 1) {
				break;
			}
			
			for(int i = 2; i <= num; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.print(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}
			
		}
	}

}
