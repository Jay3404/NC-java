package chap15_usefulClass;

import java.util.Calendar;

public class _19_differeceOfTwoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2011, 2, 11);
		
		//getTimeInMills() : long타입으로 지정된 날짜를 
		//                   밀리세컨드로 리턴.
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println("d2부터 d1까지 " + 
					(diff / 1000) + "초가 지났습니다.");
		System.out.println("d2부터 d1까지 " + 
				(diff / (1000 * 60)) + "분이 지났습니다.");	
		System.out.println("d2부터 d1까지 " + 
				(diff / (1000 * 60 * 60)) + "시간이 지났습니다.");	
		System.out.println("d2부터 d1까지 " + 
				(diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다.");
		System.out.println("d2부터 d1까지 " + 
				(diff / ((long)1000 * 60 * 60 * 24 * 30)) + "달이 지났습니다.");
		System.out.println("d2부터 d1까지 " + 
				(diff / ((long)1000 * 60 * 60 * 24 * 30 * 12)) + "년이 지났습니다.");
		
		long year = diff / ((long)1000 * 60 * 60 * 24 * 30 * 12);
		
		long month = diff / (((long)1000 * 60 * 60 * 24 * 30)) - (year * 12) ;
		
		long date = diff / (((long)1000 * 60 * 60 * 24)) - (year * 12 * 30) - (month * 30);

		long hour = diff / (((long)1000 * 60 * 60)) - ((long)year * 12 * 30 * 24) - (month * 30 * 24) - (date * 24);
		
		long minute = diff / (((long)1000 * 60)) - ((long)year * 12 * 30 * 24 * 60) - (month * 30 * 24 * 60) - (date * 24 * 60) - (hour * 60);
		
		long second = diff / (((long)1000)) - ((long)year * 12 * 30 * 24 * 60 * 60) - ((long)month * 30 * 24 * 60 * 60) - ((long)date * 24 * 60 * 60) - (hour * 60* 60) - (minute * 60);
		System.out.println(second);
		
		System.out.println(year + "년 " + month + "달 " + date + "일 " + hour + "시간 " + minute + "분 " + second + "초 남았습니다.");
	}

}
