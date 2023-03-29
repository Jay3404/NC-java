package chap98_homework.HW02_20230315;

import java.util.Random;
import java.util.Scanner;

public class _02_20230315_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요. while문내에 조건문을 넣어주면 됨");
//		
//		int i = 1;
//		
//		while(true) {
//			if(i % 2 == 0)
//				System.out.print(i + " ");
//			else if(i > 10)
//				break;
//			i++;
//		}
//		
//		System.out.println();
//		System.out.println("-------------------------------------------------------------------------------");
//		System.out.println("2. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요");
//	
//		int sum = 0;
//		
//		for(i = 1; i < 1000; i++) {
//			if (i % 2 == 0 && i % 7 == 0) 
//				sum += i;
//		}
//		System.out.println(sum);
//	
//		
//		
//		System.out.println("-------------------------------------------------------------------------------");
//		System.out.println("3. 구구단을 이렇게 출력하세요. 2x1=2 3x1=3...9x1=9 2x2=4 2x9=18........9x9=81");
//		
//		for(i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				System.out.print(j + " X " + i + " = " + j*i + " " );
//			}
//			System.out.println();
//		}
	
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("4. 가위바위보 게임");
	
//		4. 가위, 바위, 보 게임을 만드세요.
//		com에 0~2까지의 랜덤값을 발생시키고
//		(0:가위, 1:바위, 2:보)
//		사용자가 가위, 바위, 보를 입력하여
//		com과의 승무패를 출력하세요.
//		(예시) com = 2, 사용자가 바위를 입력하면 => 졌습니다.
//		com=1, 사용자가 바위를 입력하면 => 비겼습니다.
//		com=0, 사용자가 바위를 입력하면 => 이겼습니다.
		
		Scanner sc = new Scanner(System.in);
		Random com1 = new Random();
		int com = com1.nextInt(3);
		int winCnt = 0;
		int loseCnt = 0;
		int drawCnt = 0;
		
		
		while(true) {
			String[] winRate = new String[6];
			
			winRate[0] = "이긴 횟수 : ";
			winRate[2] = " 진 횟수 : ";
			winRate[4] = " 비긴 횟수 : ";
			com = com1.nextInt(3);
			System.out.print("가위바위보 게임을 하겠습니다.");
			System.out.println("가위 : 0, 바위 : 1, 보 : 2");
			System.out.println("값을 입력해주세요.");
			int input = sc.nextInt();
			
			if (input != 0 && input != 1 && input != 2) {
				System.out.println("값을 잘못 입력하셨습니다. 0, 1, 2 중의 값을 입력해주세요.");
				continue;}
			
			String user1 = "";
			String comp = "";
			
			if (input == 0)
				user1 = "가위";
			if (input == 1) 
				user1 = "바위";
			if (input == 2)
				user1 = "보";
			
			if (com == 0)
				comp = "가위";
			if (com == 1) 
				comp = "바위";
			if (com == 2)
				comp = "보";
			
			if (input == com) {
				System.out.println("사용자는 "+ user1 + ", 컴퓨터는 " + comp + "을(를) 내어 비겼습니다." );
				drawCnt++;
			}
			else if((com == 0 && input == 1) || (com == 1 && input == 2) || (com == 2 && input == 0)) {
				System.out.println("사용자는 "+ user1 + ", 컴퓨터는 " + comp + "을(를) 내어 사용자가 이겼습니다." );
				winCnt++;
			}
			else {
				System.out.println("사용자는 "+ user1 + ", 컴퓨터는 " + comp + "을(를) 내어 졌습니다." );
				loseCnt++;		
			}
			winRate[1] = winCnt + "회 입니다.";
			winRate[3] = loseCnt + "회 입니다. ";	
			winRate[5] = drawCnt + "회 입니다.";
			
			System.out.print(winRate[0] + winRate[1] + winRate[2] + winRate[3] + winRate[4] + winRate[5]);
			System.out.println();
			System.out.println("게임을 다시 하시겠습니까??");
			System.out.println("계속하기(y) 그만하기(n)");
			String regame = sc.next();
			if ("n".equals(regame) || "N".equals(regame)) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
	}

}
