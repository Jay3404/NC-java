package chap98_homework._0317;

public class LaserPrinter extends Printer{
	public int tonerNum;
	
	public void print() {
		super.print();
		tonerNum--;
		System.out.println("잉크 잔량: " + tonerNum);
	}
}
