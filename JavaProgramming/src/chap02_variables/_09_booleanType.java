package chap02_variables;

public class _09_booleanType {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. boolean타입 변수 선언 및 초기화
		boolean isOver = false;
		int moveMeter = 0;
		
		//무한 반복문
		while(true) {
			//이 안의 코드를 무한 반복 실행
			
			//100미터를 넘어갔을 때 플래그(isOver의 값을
			//true로 변경
			if(moveMeter >= 100) {
				isOver = true;
			} else if(moveMeter <= 30) {
				isOver = false;
			}
			
			//플래그가 true로 바뀌면 30씩 뒤로 이동
			//플래그가 false면 50씩 앞으로 이동
			if(isOver == true) {
				moveMeter = moveMeter - 30;
			} else {
				moveMeter = moveMeter + 50;
			}
			
			System.out.println("현재 위치는 " + moveMeter + "입니다.");
			Thread.sleep(1000);
			
			
			
			
			
		}
	}

}
