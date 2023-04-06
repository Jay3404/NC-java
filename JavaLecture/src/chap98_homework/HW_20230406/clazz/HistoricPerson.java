package chap98_homework.HW_20230406.clazz;

import java.util.ArrayList;
import java.util.List;

//2. HistoricPerson이란 클래스를 만들고 String name; String achievement; String country; 를 멤버변수로 만들고
//getter/setter 메소드를 생성합니다. getPersonInfo(String achievement); 매개변수로 받아온 업적에 해당하는 역사적 인물의
// 정보를 리턴하는 기능을 만들고 메인메소드에서 (이도, 한글, 조선), (이순신, 임진왜란, 조선), (담덕, 세력확장, 고구려)
// (장영실, 측우기, 조선), (이성계, 조선건국, 조선), (을지문덕, 살수대첩, 고구려), (이승만, 초대대통령, 대한민국), (고주몽, 고려건국, 고려),
//(김구, 독립운동, 대한민국), (제갈공명, 책략가, 촉) 데이터를 갖는 List<HistoricPerson>를 만들어서 스트림으로 변환 후 사용자가 입력한 업적 
// 하나만 갖는 스트림을 생성하고 출력하세요.


public class HistoricPerson {
	private String name;
	private String achievement;
	private String country;
	
	public HistoricPerson(String name, String achievement, String country) {
		this.name = name;
		this.achievement = achievement;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPersonInfo(String achievement) {
		String result = "";
		result = achievement;
		return result;
	}

	@Override
	public String toString() {
		return "HistoricPerson [name=" + name + ", achievement=" + achievement + ", country=" + country + "]";
	}
	
	
	
}
