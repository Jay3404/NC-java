package chap98_homework._0317;

public class Printer {
	public String model;
	public String company;
	public String interValue;
	public int printNum;
	public int paperNum;
	
	public void print() {
		System.out.println("모델명: " + model);
		System.out.println("제조사: " + company);
		System.out.println("인터페이스 종류: " + interValue);
		System.out.println("인쇄 매수: " + printNum);
		System.out.println("인쇄 종이 잔량: " + paperNum);
		paperNum--;
	}
}
