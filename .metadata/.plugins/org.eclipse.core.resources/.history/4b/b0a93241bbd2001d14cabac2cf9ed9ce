package chap20_lambda;

import chap20_lambda.clazz.Convertor;
import chap20_lambda.clazz.MoneyConvertor;

public class _05_referenceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 메소드는 클래스 원형에서 바로 참조
		action(MoneyConvertor :: convert);
		
		//일반 메소드는 객체 생성 후 참조
		MoneyConvertor mcv = new MoneyConvertor();
		
		action(mcv :: instanceConvert);
	}
	
	public static void action(Convertor con) {
		int result = con.conv(1000000, '$');
		System.out.println("변환된 돈 : $" + result);
	}
}
