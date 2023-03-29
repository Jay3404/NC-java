package chap03_operator;

public class _04_threeOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 삼항 조건 연산자
		int num1 = 120;
		int num2 = 11;
		int result = num1 / num2 == 10 / num2 
				? num1 * 2 : num2 * 2;
		
		System.out.println(result); 
		//=>num2 * 2 => 11 * 2 => 22
		
		//2. 삼항 조건 연산자의 중첩
		result = num1 / num2 == 10 / num2 
				? num1 * 2 > 100 ? 101 : 99 
				: num2 * 2 > 100 ? 11 : 22;
		System.out.println(result); //22
		
		result = (num1 / num2 == 10 / num2) 
				? (num1 * 2 > 100 ? 101 : 99) 
				: (num2 * 2 > 100 ? 11 : 22);
		System.out.println(result);
		
		
		
		
		
		
		
	}

}
