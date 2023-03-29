package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체화(인스턴화)
		Add add = new Add();
		Minus min = new Minus();
		Multiple mul = new Multiple();
		Divide div = new Divide();
		
		
		
		add.setNum1(10);
		add.setNum2(20);
		
		min.setNum1(10);
		min.setNum2(20);
		
		mul.setNum1(10);
		mul.setNum2(20);
		
		div.setNum1(10);
		div.setNum2(20);
		//add.setResult(add.getNum1() + add.getNum2());
		
		System.out.println(add.add());
		System.out.println(min.minus());
		System.out.println(mul.multi());
		System.out.println(div.div());
		
		//설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		//인스턴스화 : 생성자를 통해서 객체를 생성하고 heap메모리 영역에 저장하는 것
		//항상 new 키워드와 함께 사용
		Calc cal = new Calc();
		
		int receiveNum = cal.add(10, 20);
		//리턴 값을 받아주는 변수가 없으면 결과가 메모리에 저장되지 않고, 연산이 일어난 후 삭제
		cal.add(10, 20);
		
		System.out.println(cal.add(10, 20));

		System.out.println(cal.minus(cal.add(10, 20), cal.divide(20, 10)));
		
		Calc cal2 = new Add();
		
		System.out.println(cal2.add(4, 3));
		
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4, 3));
	}

}
