package chap98_homework.HW09_20230324;

import java.util.Calendar;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		System.out.println("현재 시각: " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+ 1) + "월 "
				+ cal.get(Calendar.DATE) + "일 입니다.");
		
		cal.set(2020, 3, 8);
		
		System.out.println("변경된 시각: " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일 입니다.");
		
		cal.add(Calendar.YEAR , 5);       
		cal.add(Calendar.MONTH , 2);       
		cal.add(Calendar.DAY_OF_MONTH , 3);
		
		System.out.println("변경된 시각: " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일 입니다.");
		
		
	}

}
