package chap18_enum;

import chap18_enum.eunms.CusMonth;

public class _01_useOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CusMonth c = CusMonth.JAN;
		System.out.println(c.getMonth());
		System.out.println(c.getName());
		
		CusMonth[] cArr = new CusMonth[12];
		cArr[0] = c;
		for(int i = 1; i < 12; i++) {
			cArr[i] = 
					cArr[i - 1].nextMonth(
							cArr[i - 1].ordinal()
					);
			
			System.out.println(cArr[i].getName() 
							+ " : " 
							+ cArr[i].getMonth());
		}
	}

}
