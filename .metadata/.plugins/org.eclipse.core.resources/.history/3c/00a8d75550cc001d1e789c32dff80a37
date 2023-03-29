package chap98_homework.nc230321.employee;

public class TempEmployee extends Employee {
	private int hireYear;

	public TempEmployee(int eno, String name, int pay, int hireYear) {
		super(eno, name, pay);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay()/12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무년수 : " + this.hireYear);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
