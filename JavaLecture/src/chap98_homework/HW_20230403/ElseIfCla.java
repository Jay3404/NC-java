package chap98_homework.HW_20230403;

public class ElseIfCla extends ElseCla{
	public void makeIf(int num) {
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}
	}
	
	public void makeElseIf(int num) {
		if(num == 5) {
			System.out.println("5입니다.");
		}
	}
	
	public void makeElse(int num) {
		if(num < 5) {
			System.out.println("5보다 작습니다.");
		}
	}
	
}
