package chap98_homework.HW_20230330;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generateNum();
		
		
		
		
	}

	static void start() {
		
		inputMoney();
		
		
		
		
		
	}
	
	
	
	
	
	
	static void generateNum() {
		Random rand = new Random();
		int[] chooseNums = new int[6];
		int chooseNum = rand.nextInt(45) + 1;
		
		chooseNums[0] = chooseNum;
		
		for(int i = 1; i < chooseNums.length; i++) {
			chooseNum = rand.nextInt(45) + 1;
			if(isDuplicate(chooseNums, chooseNum)) {
				chooseNum = rand.nextInt(45) + 1;
				i--;
			}else if(!isDuplicate(chooseNums, chooseNum)) {
				chooseNums[i] = chooseNum;
			}
		}
	}
	
	
	static boolean isDuplicate(int[] chooseNums, int chooseNum) {
		boolean result = false;
		int i = 0;
		
		while(chooseNums[i] != 0) {
			if(chooseNums[i] == chooseNum) {
				return result = true;
			}i++;
		}return result;
	}
	
	static int inputMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구입금액을 입력해 주세요.");
		
		int result = 0;
		while(true) {
			int num = sc.nextInt();
			if((num / 1000 == 0) || (num % 1000 != 0) ) {
				System.out.println("[ERROR] 구입 금액은 천원 이상으로 천원 단위로 입력해야합니다.");
				System.out.println("구입금액을 다시 입력해 주세요.");
				
			}else if(num % 1000 == 0) {
				result = num / 1000;
				break;
			}
		}
		return result;
	}
	
	static void inputAnswerNum() {
		
	}
	
	static void compareNum() {
		
	}
	
	
	
	
	
}
