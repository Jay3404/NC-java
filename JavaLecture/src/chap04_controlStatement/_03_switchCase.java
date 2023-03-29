package chap04_controlStatement;

public class _03_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break문을 넣어야 정상적으로 동작하기 때문에
		//case별로 항상 break문을 넣어줘야한다.
		//break문이 없는 경우에는 맞는 조건부터 break문을 만날 때까지의 case가 모두 실행된다.
		String grade = "A";
		 
		switch(grade) {
			case "A":
				System.out.println("점수는 90점이상입니다.");
				break;
			case "B":
				System.out.println("점수는 90점미만 80점 이상입니다.");
				break;
			case "C":
				System.out.println("점수는 80점미만 70점 이상입니다.");
				break;
			case "D":
				System.out.println("점수는 70점미만 60점 이상입니다.");
				break;
			default:
				System.out.println("점수는 60점미만입니다.");
		}
		
		switch(10 % 3) {
			case 1:
				
			case 2:
				
			default:
		}
		
		//boolean은 switch ~ case문의 조건으로 사용불가
		//switch(10 > 20) {}
		
	}

}
