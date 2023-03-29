package chap98_homework._0321;

import java.util.Scanner;

public class WorkerProgram {
	Scanner sc = new Scanner(System.in);
	RegularWorker rw = new RegularWorker("---","---",0);
	TemporaryWorker tw = new TemporaryWorker("---","---",0);
	ContractWorker cw = new ContractWorker("---","---",0);
	
	boolean play = true;
	
	public void start() {
		while(play) {
			System.out.println("*** 메뉴 선택 ***");
			
			System.out.println("1. 정규직 저장\n"
					+ "2. 임시직 저장\n"
					+ "3. 계약직 저장\n"
					+ "4. 전체 정보 출력\n"
					+ "5. 월급 계산 출력\n"
					+ "6. 프로그램 종료");
			
			System.out.print("번호입력 >>");
			int n = sc.nextInt();
			
			switch(n){
				case 1:rw.saveInfo(sc);break;
				case 2:tw.saveInfo(sc);break;
				case 3:cw.saveInfo(sc);break;
				case 4:showAll();break;
				case 5:calMonthPay(showCalMonthPay());break;
				case 6:System.out.println("종료합니다.");
						play = false;
			}
			
		}
		
		
	}
	
	public void showAll() {
		System.out.println("----정규직----");
		rw.showEmployeeInfo();
		System.out.println("----임시직----");
		tw.showEmployeeInfo();
		System.out.println("----계약직----");
		cw.showEmployeeInfo();
	}
	
	public int showCalMonthPay() {
		int n;
		System.out.println("원하는 회사원의 월급을 입력하세요");
		System.out.print("1.정규직 2.임시직 3.계약직 >>");
		n = sc.nextInt();
		if(n == 1 || n == 2 || n==3) {
			return n;
		}else {
			System.out.println("다시 입력하세요");
			showCalMonthPay();
		}
		return n;
	}
	
	public void calMonthPay(int n) {
		double monthPay = 0;
		switch(n) {
			case 1: monthPay = rw.getMonthPay();break;
			case 2: monthPay = tw.getMonthPay();break;
			case 3: monthPay = cw.getMonthPay();break;
		}
		String payStr = String.format("%.1f",monthPay);
		
		System.out.println("선택하신 회사원의 월급은 " 
				+ payStr + "원 입니다.");
	}
}
