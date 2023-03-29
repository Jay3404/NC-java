package chap98_homework.HW01_20230314;

public class _01_20230314_basic_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. 삼항 조건 연산자를 이용하여 int age = 29; 일 경우 20대입니다. 를 출력하고 
		 * age가 30이상일 경우 20대가 아닙니다.를 출력하세요.
		 */
		
		int age = 29;
		String result = "";
		
		result = age < 20 ? ("20대가 아닙니다.") : (age < 30) ? ("20대입니다.") : ("20대가 아닙니다.");
		System.out.println(result);
	}

}
