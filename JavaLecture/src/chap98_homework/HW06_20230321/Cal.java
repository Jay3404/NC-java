package chap98_homework.HW06_20230321;

import chap98_homework.HW6_20230321.Middle.Calculator;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Calculator.Add add = cal.new Add();
		System.out.println(add.add(10,20));
		
	}

}
