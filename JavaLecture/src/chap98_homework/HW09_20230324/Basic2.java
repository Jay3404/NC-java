package chap98_homework.HW09_20230324;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date nowDate = new Date();
        
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
        	//원하는 데이터 포맷 지정
		String strNowDate = sdf1.format(nowDate); 
        	//지정한 포맷으로 변환 
		System.out.println("오늘 날짜: " + strNowDate);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); 
		String str2 = sdf2.format(nowDate);
		System.out.println("오늘 날짜: " + str2);
		
		
	}

}
