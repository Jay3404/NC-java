package chap98_homework._0317;

import java.util.Scanner;

public class RockScissPaper {
	//몇승 몇무 몇패인지 셀 변수
		private int win = 0;
		private int draw = 0;
		private int lose = 0;
		
		//승점 담아줄 변수(승:1, 무:0, 패:-1)
		private int score = 0;
		
		//승무패 기록을 담아줄 배열
		private char[] wdl;
		
		Scanner sc = new Scanner(System.in);
		
		//게임 실행 메소드
		public void start() {
			while(true) {
					
				//사용자가 입력한 round 만큼 게임진행
				System.out.print("진행할 게임의 판 수를 입력하세요. >>");
				int round = sc.nextInt();
				wdl = new char[round];
					
				//총 10판 진행
				for(int i = 0; i < wdl.length; i++) {
					//클래스 안에 랜덤 변수를 발생시키는 메소드
					//1 ~ 3까지 랜덤 변수 발생(1:가위, 2:바위, 3:보)
					int randomVal = generateRandom();
					//int randomVal2 = generateRandom();
						
					//사용자 입력 값 받아서 정수형 변환해주는 메소드
					System.out.print(i+1 + "판 ");
					int userNum = convertUserInput(sc);
						
					if(userNum == 0) {
						System.out.println("잘못 입력하셨습니다.");
						//해당 게임을 다시 진행하기 위해 1 감소
						//for문에서 continue문을 만나면 증감식으로 이동하기 때문
						i--;
						continue;
					}
						
					//승, 무, 패 판단해주는 메소드
					//가위, 바위, 보 비교
					//무승부
					judgeWdl(userNum, randomVal, i);
						
						
						
				}
				//승점 계산해주는 메소드
				//승점 계산
				sumScore();

				if(reGame()) {
					break;
				} else {
					continue;
				}
			}
			System.out.println("끝");
		}
		
		//1~3 중 랜덤 값 발생시키는 메소드
		public int generateRandom() {
			int n = (int)(Math.random()*3)+1;
			return n;
		}
		
		//사용자 입력 값을 정수형을 변환해주는 메소드
		public int convertUserInput(Scanner sc) {
			System.out.print("사용자 입력 값 >>");
			String input = sc.next();
			int n = 0;
			switch(input) {
				case "가위": n = 1; break;
				case "바위": n = 2; break;
				case "보": n = 3; break;
			}
			return n;
		}
		
		//승, 무, 패 판단 메소드
		public void judgeWdl(int userNum, int randomVal, int i) {
			if(userNum == randomVal) {
				System.out.println("비겼습니다.");
				wdl[i] = 'd';
			}else if(userNum == 1 && randomVal == 3 || 
					userNum == 2 && randomVal == 1 || 
					userNum == 3 && randomVal == 2) {
				System.out.println("이겼습니다.");
				wdl[i] = 'w';
				score += 1;
			}else {
				System.out.println("졌습니다.");
				wdl[i] = 'l';
				if(score>0) {
					score -= 1;
				}
			}
			i++;
		}
		
		//승점 계산 및 출력 메소드
		public void sumScore() {
			System.out.println("승점: " + score);
			for(int i=0; i<wdl.length; i++) {
				System.out.print(i+1 + "판: " + wdl[i] + ", ");
			}
			System.out.println();
		}
		
		public boolean reGame() {
			boolean regame = true;
			int n;
			while(true) {
				System.out.print("다시 하시하려면 1, 끝내시려면 0 >>");
				n = sc.nextInt();
				if(n == 1) {
					regame = false;
					break;
				}else if(n == 0) {
					regame = true;
					break;
				}
			}
			return regame;
		}
}
