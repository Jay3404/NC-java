package chap98_homework.nc230404;

import chap98_homework.nc230404.clazz.NumberPrinter;
import chap98_homework.nc230404.clazz.Thread1;
import chap98_homework.nc230404.clazz.Thread2;

public class _03_hw_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter np = new NumberPrinter();
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.setNp(np);
		t2.setNp(np);
		
		t1.start();
		t2.start();
	}

}
