package chap98_homework.HW6_20230321.Advance;

import java.util.Scanner;

//임시직
public class TemporaryWorker extends Worker {
	int hireYear;
	
	public TemporaryWorker(String companyNum, String name, double pay) {
		super(companyNum, name, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double monthPay;
		monthPay = pay/hireYear;
		return monthPay;
	}
	@Override
	public void saveInfo(Scanner sc) {
		super.saveInfo(sc);
		System.out.print("고용 개월을 입력하세요 >>");
		hireYear = sc.nextInt();
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("고용 개월: " + hireYear);
	}

}
