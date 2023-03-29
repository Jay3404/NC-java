package chap15_usefulClass;

public class _11_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer 생성자 자바 9버전부터는 사용불가
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		
		//주소값 비교 같은 객체를 바라보는지 확인
		System.out.println(num1 == num2);
		//equals 메소드가 오버라이딩 되어 있어 값만 비교한다.
		System.out.println(num1.equals(num2));
		
		//작으면 -1 크면 1, 같으면 0
		System.out.println(num1.compareTo(num2));
		
		String numStr = "1000";
		int convertNum = Integer.parseInt(numStr);
		System.out.println(convertNum);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//문자열로 변환
		String convertStr = num1.toString();
		System.out.println(convertStr.getClass().getName());
		
		//사이즈, 바이트, 타입 확인
		System.out.println("size = " + num1.SIZE);
		System.out.println("byte = " +num1.BYTES);
		System.out.println("type = " +num1.TYPE);
		
		//문자열을 정수형을 변환
//		System.out.println(Integer.parseInt("FF"));
		System.out.println(Integer.parseInt("FF", 16));
	}

}
