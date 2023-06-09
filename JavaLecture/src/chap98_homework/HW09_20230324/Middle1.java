package chap98_homework.HW09_20230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("YYYY-MM-DD의 형식으로 날짜를 입력해주세요.");
		String strDate = sc.next();
		Calendar cal = Calendar.getInstance();
		
		try {
			SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-MM-dd");
			// String 타입을 Date 타입으로 변환
			Date formatDate = newDtFormat.parse(strDate);
			// Date타입을 Calendar타입으로 변경
			cal.setTime(formatDate);
			// Calendar + 3
			cal.add(Calendar.DATE, 3);
			// Calendar -> Date 타입
			formatDate = cal.getTime();
			System.out.println(newDtFormat.format(formatDate));
			
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
