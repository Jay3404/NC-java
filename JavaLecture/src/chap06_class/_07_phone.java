package chap06_class;

import chap06_class.phone.PhoneInfo;

public class _07_phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo pi = new PhoneInfo();
		
		pi.insertPhoneNum("홍길동1", "01021421343");
		pi.insertPhoneNum("홍길동2", "01042412324");
		pi.insertPhoneNum("홍길동3", "01011111111");
		pi.insertPhoneNum("홍길동4", "01011112222");
		
		
		pi.printAllPhoneNum();
		pi.printPhoneNum(2);
		
	}

}
