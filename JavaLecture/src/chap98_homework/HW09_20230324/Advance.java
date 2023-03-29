package chap98_homework.HW09_20230324;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.

		
		LocalDate date = LocalDate.of(2001, 12, 19);
		
		int toYear = 2022;
		
		int diff = toYear - date.getYear() ;
		
		for(int i = 0; i < diff; i ++) {
			date = date.plusYears(1);
			if(isLeap(date.getYear())) {
				date = date.plusDays(1);
			}
		}
		
		System.out.println("결혼기념일은 " + date.getYear() + "년 " + date.getMonthValue() + "월 " + date.getDayOfMonth() + "일 입니다.");
		
//		3. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//	    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
		Scanner sc = new Scanner(System.in);
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar largeCal = Calendar.getInstance();
		Calendar smallCal = Calendar.getInstance();
		
		
		String form = "yyyy-MM-dd";
		DateFormat format1 = new SimpleDateFormat(form);
		
		System.out.print("날짜 두 개를 입력해주세요(YYYY-MM-DD). :");
		String str1 = sc.next();
		String str2 = sc.next();
		
		SimpleDateFormat sdFormat = new SimpleDateFormat(form, Locale.KOREA);
		
		try {
			cal1.setTime(sdFormat.parse(str1));
			cal2.setTime(sdFormat.parse(str2));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		if (cal1.compareTo(cal2) >= 0) {
			largeCal = cal1;
			smallCal = cal2;
		}else {
			largeCal = cal2;
			smallCal = cal1;
		}
		
		String result = "";
		int numMonth = largeCal.get(Calendar.MONTH) - smallCal.get(Calendar.MONTH);
		int num = largeCal.get(Calendar.DATE) - smallCal.get(Calendar.DATE);
		int lastDayOfMonth = smallCal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDayOfMonth = largeCal.getActualMinimum(Calendar.DAY_OF_MONTH);
		int smallDiff = lastDayOfMonth - smallCal.get(Calendar.DATE);
		
		if(numMonth == 0) {
			for(int i = 0; i <= num; i ++) {
				result = format1.format(smallCal.getTime());
				System.out.println(result);
				cal2.add(Calendar.DATE, 1);
			}
			
		}else {
			for(int i = 0; i <= numMonth; i ++) {
				if(i != numMonth) {
					for(int j = 0; j <= smallDiff; j ++) {
						result = format1.format(smallCal.getTime());
						System.out.println(result);
						smallCal.add(Calendar.DATE, 1);
					}
					lastDayOfMonth = smallCal.getActualMaximum(Calendar.DAY_OF_MONTH);
					smallDiff = lastDayOfMonth - smallCal.get(Calendar.DATE);
				}else {
					num = largeCal.get(Calendar.DATE) - firstDayOfMonth;
					for(int j = 0; j <= num; j ++) {
						result = format1.format(smallCal.getTime());
						System.out.println(result);
						smallCal.add(Calendar.DATE, 1);
					}
				}
			}
		}
	}
	

	
	static boolean isLeap(int year) {
		//400으로 나눠떨어지거나
		//4로 나눠떨어지고 100나눠떨어지지 않는것
		if((year % 400 ==0) || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		} else 
			return false;
		}

}