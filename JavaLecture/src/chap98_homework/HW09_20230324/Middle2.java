package chap98_homework.HW09_20230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("YYYY-MM-DD의 형식으로 날짜를 입력해주세요.");
		String strDate = sc.next();

		
		try {
			SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-MM-dd");
			// String 타입을 Date 타입으로 변환
			Date formatDate = newDtFormat.parse(strDate);
			// Date타입을 Calendar타입으로 변경
			int year = formatDate.getYear();
			// Calendar타입을 LocalDate로 변경
			LocalDate date = LocalDate.of(formatDate.getYear(), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
			// Calendar -> Date 타입
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN));
			formatDate = cal.getTime();
			System.out.println(newDtFormat.format(formatDate));
			
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
