package chap02_variables;

public class _13_typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 묵시적(자동) 형변환
		//바이트크기가 작은 타입에서 
		//큰 타입으로는 자동 형변환
		short sNum = 10;
		int iNum = sNum;
		
		//세밀한 표현범위를 갖는 타입으로 자동 형변환
		long lNum = 100L;
		float fNum = lNum;
		
		//2. 명시적(강제) 형변환
		//바이트가 큰 타입에서 작은 타입으로의 형변환은
		//작은 타입의 자료형을 명시한다.
		int uniCode = 65;
		char ch = (char)uniCode;
		
		//명시적 형변환에서 범위를 초과할 경우
		long longVal = 32770L;
		short shortVal = (short)longVal;
		
		//3. 형변환 자료 출력
		System.out.println(iNum);
		System.out.println(fNum);
		System.out.println(ch);
		//범위의 최대값보다 값이 커질경우는 최소 값부터 시작
		//범위의 최소값보다 값이 작아지는 경우 최대 값부터 시작
		System.out.println("범위 초과 시 : " + shortVal);
		System.out.println("-------------------------");
		//4. 연산에서의 형변환
		long lNum2 = 1000000L;
		int iNum2 = 100;
		
		//바이트 크기가 큰 타입과 작은 타입을 연산할 경우
		//작은 타입의 변수가 큰 타입으로 변경된 후 연산된다.
		long result1 = lNum2 + iNum2;
		
		System.out.println(result1);
		
		//바이트 크기가 작은 타입으로 형변환 후 연산하고 싶을경우
		//큰 타입을 강제 형변환 후 연산
		int result2 = (int)lNum2 + iNum2;
		
		System.out.println(result2);
		
		//2. 문자열 결합 연산에서의 형변환
		String str = "java";
		int version = 11;
		
		//문자열 결합 연산에서는 문자열을 제외한 모든 타입이
		//문자열 타입으로 변경된 후 연산
		//version의 값이 문자열로 변환된 후 결합=> "11"
		String result3 = str + version; //=> java11
		System.out.println(result3);
		
		
		
		
		
		
	}

}
