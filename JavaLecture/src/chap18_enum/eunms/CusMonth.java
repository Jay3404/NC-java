package chap18_enum.eunms;

public enum CusMonth {
	//지정하는 상수는 모두 static final
	//값을 변경할 수 없다.
	JAN(1, "january"), FEB(2, "febrary"), MAR(3, "march"), 
	APR(4, "april"),MAY(5, "may"), JUN(6, "june"), 
	JUL(7, "july"), AUG(8, "august"), SET(9, "september"), 
	OCT(10, "october"), NOV(11, "november"), DEC(12, "december");
	
	private final int CUS_MONTH;
	private final String MONTH_NAME;
	
	CusMonth(int month, String name) {
		CUS_MONTH = month;
		MONTH_NAME = name;
	}
	
	public int getMonth() {
		return CUS_MONTH;
	}
	
	public String getName() {
		return MONTH_NAME;
	}
	
	public CusMonth nextMonth(int index) {
		return CusMonth.values()[index + 1];
	}
}
