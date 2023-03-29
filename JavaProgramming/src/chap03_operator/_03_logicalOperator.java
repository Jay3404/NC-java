package chap03_operator;

public class _03_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 관계 연산자
		int num1 = 100;
		int num2 = 300;
		
		System.out.println("num1 < num2 : " 
							+ (num1 < num2)); 
							//true
		
		System.out.println("num1 >= num2 : " 
							+ (num1 >= num2)); 
							//false
		
		System.out.println("num1 == num2 : " 
							+ (num1 == num2));
							//false
		System.out.println("-------------------");
		
		//2. 논리 연산자
		int num3 = 10;
		int num4 = 20;
		
		System.out.println("num1 < num2 &&" +
				  "num3 / num4 == 0 = " 
				+ (num1 < num2 && num3 / num4 == 0));
				//true && true => true
		
		
		System.out.println("false || num4"
				+ " * num2 < 100 = " 
				+ (false || num4 * num2 < 100));
				//false || false => false
		
		System.out.println("!(num4 < 2000) = " +
				(!(num4 < 2000))); //!true => false
		
		
		
		
		
		
		
	}

}
