package chap98_homework._0321;

import java.util.Scanner;

//계약직
public class ContractWorker extends Worker {
	int workDay;
	
	public ContractWorker(String companyNum, String name, double pay) {
		super(companyNum, name, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double monthPay;
		monthPay = pay * workDay;
		return monthPay;
	}
	@Override
	public void saveInfo(Scanner sc) {
		super.saveInfo(sc);
		System.out.print("일한 일수를 입력하세요 >>");
		workDay = sc.nextInt();
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("일한 일수: " + workDay);
	}
}
