package chap04_controlStatement;

public class _04_forStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 ~ 100까지의 합
		//1 ~ 100까지의 합을 담아줄 변수 sum
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			//sum = sum + i
			sum += i;}
		System.out.println("1 ~ 100까지의 합 : " + sum);
		System.out.println("for문 종료시 i의 값 : " + i);
		
		
	}

}
