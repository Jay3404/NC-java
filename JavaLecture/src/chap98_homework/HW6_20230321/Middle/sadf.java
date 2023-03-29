package chap98_homework.HW6_20230321.Middle;

public class sadf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Calculator.Add a = cal.new Add();
		Calculator.Mul m = cal.new Mul();
		System.out.println(a.add(10, 20));
		System.out.println(m.sub(20,  10));
	}

}
