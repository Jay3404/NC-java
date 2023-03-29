package chap98_homework._0321;

import java.util.Scanner;

//정규직
public class RegularWorker extends Worker {
	int bonus;
	
	public RegularWorker(String companyNum, String name, double pay) {
		super(companyNum, name, pay);
		// TODO Auto-generated constructor stub
	}
	
	//월급계산
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double monthPay;
		monthPay = pay / 12 + bonus / 12;
		return monthPay;
	}
	
	@Override
	public void saveInfo(Scanner sc) {
		super.saveInfo(sc);
		System.out.print("보너스를 입력하세요 >>");
		bonus = sc.nextInt();
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("보너스: " + bonus);
	}

}
