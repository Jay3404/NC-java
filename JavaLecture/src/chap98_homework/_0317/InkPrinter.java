package chap98_homework._0317;

public class InkPrinter extends Printer{
	public int inkNum;
	
	public void print() {
		super.print();
		inkNum--;
		System.out.println("잉크 잔량: " + inkNum);
	}
}
