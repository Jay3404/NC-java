package chap98_homework.HW_20230406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import chap98_homework.HW_20230406.clazz.HistoricPerson;

public class HW_0406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abc";
		String str2 = "def";
		String str3 = str1.concat(str2);
		
		System.out.println(str3);
		
		
		prob02();
		
	}

	
//	--------------------스트림--------------------
//	1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.

	public static void prob01() {
		List<String> strList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			strList.add(sc.next());
		}
		
		
		
		Stream<String> strStream = strList.stream();
		
		Stream<String> filterStrStream = strStream
				.filter(c -> c.length() >= 5);
		
		filterStrStream.forEach(t -> System.out.println(t));
		
	}
	
//	2. HistoricPerson이란 클래스를 만들고 String name; String achievement; String country; 를 멤버변수로 만들고
//	   getter/setter 메소드를 생성합니다. getPersonInfo(String achievement); 매개변수로 받아온 업적에 해당하는 역사적 인물의
//	    정보를 리턴하는 기능을 만들고 메인메소드에서 (이도, 한글, 조선), (이순신, 임진왜란, 조선), (담덕, 세력확장, 고구려)
//	    (장영실, 측우기, 조선), (이성계, 조선건국, 조선), (을지문덕, 살수대첩, 고구려), (이승만, 초대대통령, 대한민국), (고주몽, 고려건국, 고려),
//	   (김구, 독립운동, 대한민국), (제갈공명, 책략가, 촉) 데이터를 갖는 List<HistoricPerson>를 만들어서 스트림으로 변환 후 사용자가 입력한 업적 
//	    하나만 갖는 스트림을 생성하고 출력하세요.
	
	public static void prob02() {
		List<HistoricPerson> hpList = new ArrayList<HistoricPerson>();
		Scanner sc = new Scanner(System.in);
		
		hpList.add(new HistoricPerson("이도", "한글", "조선"));
		hpList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hpList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hpList.add(new HistoricPerson("장영실", "측우기", "조선"));
		hpList.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hpList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hpList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hpList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hpList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hpList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
		System.out.println("업적을 하나 입력해주세요.");
		String input = sc.next();
		
		Stream<HistoricPerson> hpStream = hpList.stream()
				.filter(c -> {
					if(c.getAchievement().equals(c.getPersonInfo(input))) {
						return true;
					}else {
						return false;
					}
					
				});
				
		hpStream.forEach(c -> System.out.println(c));
		
	}
	
//	3. 2번에서 만든 List를 스트림으로 변환하고 성이 '이'씨인 인물만 갖는 스트림을 만들고 출력하세요.
	
	public static void prob03() {
		List<HistoricPerson> hpList = new ArrayList<HistoricPerson>();
		Scanner sc = new Scanner(System.in);
		
		hpList.add(new HistoricPerson("이도", "한글", "조선"));
		hpList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hpList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hpList.add(new HistoricPerson("장영실", "측우기", "조선"));
		hpList.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hpList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hpList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hpList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hpList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hpList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
		char lastName = '이';		
		
		Stream<HistoricPerson> hpStream = hpList.stream()
				.filter(c ->{
					if(c.getName().charAt(0) == lastName) {
						return true;
					}else
						return false;
				});
		hpStream.forEach(c -> System.out.println(c));
		
	}
	

//	4. HistoricPerson에 getSameCountryPerson(String country)를 만들고
//	    2번에서 만든 List를 스트림으로 변환하고 사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력하세요. 
	
	public static void prob04() {
		List<HistoricPerson> hpList = new ArrayList<HistoricPerson>();
		Scanner sc = new Scanner(System.in);
		
		hpList.add(new HistoricPerson("이도", "한글", "조선"));
		hpList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hpList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hpList.add(new HistoricPerson("장영실", "측우기", "조선"));
		hpList.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hpList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hpList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hpList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hpList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hpList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
		System.out.println("나라를 입력해주세요.");
		String input = sc.next();
		
		Stream<HistoricPerson> hpStream = hpList.stream()
				.filter(c -> {
					if(c.getCountry().equals(input))
						return true;
					else
						return false;
				});
		hpStream.forEach(c -> System.out.println(c));

	}


//	5. 2번에서 만든 List를 스트림으로 변환하고 성이 두자 이상인 인물의 정보를 스트림으로 만들어서 출력하세요.(을지문덕, 제갈공명)

	public static void prob05() {
		List<HistoricPerson> hpList = new ArrayList<HistoricPerson>();
		Scanner sc = new Scanner(System.in);
		
		hpList.add(new HistoricPerson("이도", "한글", "조선"));
		hpList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hpList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hpList.add(new HistoricPerson("장영실", "측우기", "조선"));
		hpList.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hpList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hpList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hpList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hpList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hpList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
		Stream<HistoricPerson> hpStream = hpList.stream()
				.filter(c -> {
					if(c.getName().length() > 3)
						return true; 
					else
						return false;
				});
		hpStream.forEach(c -> System.out.println(c));

	}
	
}
