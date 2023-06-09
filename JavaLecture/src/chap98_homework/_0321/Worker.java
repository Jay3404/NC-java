package chap98_homework._0321;

import java.util.Scanner;

//1. 추상클래스 회사원
//- 사번
//- 이름
//- 급여
//생성자
//추상메서드 double getMonthPay();
//일반메서드 void showEmployeeInfo();
//
//(class)정규직 : bonus, 월급 = pay/12+bonus/12
//(class)임시직 : hireYear, 월급 = pay/12;
//(class)계약직 : workDay, 월급 = pay*workDay
//
//"*** 메뉴 선택 ***"
//"1. 정규직 저장"
//"2. 임시직 저장"
//"3. 계약직 저장"
//"4. 전체 정보 출력"
//"5. 월급 계산 출력"
//"5. 프로그램 종료"

public abstract class Worker {
	String companyNum;
	String name;
	double pay;
	
	public Worker() {};
	
	public Worker(String companyNum, String name, double pay) {
		this.companyNum = companyNum;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract double getMonthPay();
	
	public void saveInfo(Scanner sc) {
		System.out.print("사번을 입력하세요 >>");
		companyNum = sc.next();
		
		System.out.print("이름을 입력하세요 >>");
		name = sc.next();
		
		System.out.print("급여을 입력하세요 >>");
		pay = sc.nextDouble();
	}
	
	public void showEmployeeInfo() {
		System.out.println("사번: " + companyNum);
		System.out.println("이름: " + name);
		System.out.println("급여: " + pay);
	}
}
