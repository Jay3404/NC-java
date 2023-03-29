package chap98_homework._0317;

public class _0317_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc[] calcArr = new Calc[4];
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		
		int a = 20;
		int b = 10;
		
		for(int i=0; i<calcArr.length; i++) {
			calcArr[i].setValue(a, b);
			System.out.println(calcArr[i].calculate());
		}
		 
	}

}
