package chap98_homework._0317;

public class _0317_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InkPrinter iPrinter = new InkPrinter();
			
		iPrinter.model = "A123";
		iPrinter.company = "sam";
		iPrinter.interValue = "USB";
		iPrinter.printNum = 10;
		iPrinter.paperNum = 20;
		iPrinter.inkNum = 5;
		
		iPrinter.print();
		
		System.out.println();
		
		LaserPrinter lPrinter = new LaserPrinter();
		
		lPrinter.model = "B123";
		lPrinter.company = "lg";
		lPrinter.interValue = "paraller port";
		lPrinter.printNum = 100;
		lPrinter.paperNum = 200;
		lPrinter.tonerNum = 50;
		
		lPrinter.print();
	
	}

}
