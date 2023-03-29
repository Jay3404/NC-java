package chap03_operator;

public class _03_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 관계 연산자
		int num1 = 100;
		int num2 = 300;
		
		System.out.println("num1 < num2 : " + (num1 < num2)); //true
		
		System.out.println("num1 >= num2 : " + (num1 >= num2));//false
		
		System.out.println("num1 == num2 : " + (num1 == num2));//false
		
		System.out.println("---------------------------------------------------------");
		
		//2. 논리 연산자
		int num3 = 10;
		int num4 = 20;
		
		System.out.println("num1 < num2 && num3/num4 == 0 = " + (num1 < num2 && num3 / num4 == 0));
		//true && true => true
		
		System.out.println("false || num4 * num2 < 100 = " + (false || num4 * num2 < 100));
		// false || false => false
		
		System.out.println("!(num4 < 2000) = " + !(num4 < 2000)); //!true => false
		
		
		/*
		 * String 값의 동일 여부를 판단할 때 ==을 사용하지 않는다. ==을 사용하면 같은 값인지 비교하는 게 아니고, 같은 객체를 참조하고
		 * 있는지 비교하는 것이다. 값의 동일 여부를 비교하려면 .equals() 메소드를 사용한다.
		 * new String을 안붙이면, 처음에 hello라고 선언된 str1의 메모리 부분에
		 * str2의 주소가 연결되어서 true라는 결과값이 나오므로 아예 따로 저장하기 위해서 new String을 붙임
		 */
		
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		
		//같은 객체를 참조하는지
		System.out.println(str1 == str2);
		
		//값의 동일 여부
		System.out.println(str1.equals(str2));
	}

}
