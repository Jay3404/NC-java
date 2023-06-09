package chap98_homework.HW_20230405;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

import chap98_homework.HW_20230405.clazz.Card;
import chap98_homework.HW_20230405.clazz.Student;

public class HW0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Card> card = new ArrayList<Card>();
		
		card.add(new Card("a", 3));
		card.add(new Card("b", 1));
		card.add(new Card("c", 0));
		card.add(new Card("d", 1));
		card.add(new Card("e", 2));
		card.add(new Card("f", 5));
		
		card.stream()
				.filter(c -> c.getValidYear() <= 1)
				.map(c -> {
					c.setValidYear(c.getValidYear() + 3);
					return c;})
				.forEach(c -> System.out.println(c.getCardName() + "이 3년 연장되었습니다."));
	
				
		prob03();
		
		
		
	}
//	--------------------스트림--------------------
//	1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. 
//	     intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.(방법1 사용)
	
	public static void prob01() {
		List<Integer> intList = new ArrayList<>();
		Random rand = new Random();
		int int1;
		
		for(int i = 0; i < 10; i++) {
			int1 = rand.nextInt(10) + 1;
			intList.add(int1);
		}
		System.out.println(intList.toString());
		
		Stream<Integer> intStream = intList.stream();
		
		intStream.forEach(c -> System.out.print(c * 3 + ", "));
		
	}
	
//
//	2. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
//	    List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)
//	  를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
	
	public static void prob02() {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		Stream<Student> strStream = studentList.stream()
					.filter(c -> c.getScore() >= 95);
		
		strStream.forEach(c -> System.out.println(c.getsName()));
		
	}
	
	
//
//	3. 2번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
	
	public static void prob03() {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		Stream<Student> strStream = studentList.stream()
					.filter(c -> c.getScore() >= 95);
		
		Stream<Student> gradeStream = strStream
				.map(c -> {
					c.setGrade("A+");
					return c;
				});
//		gradeStream.forEach(c -> System.out.println(c.getsName() + "의 등급은" + c.getGrade() + "입니다."));		
		gradeStream.forEach(c -> System.out.println(c.toString()));
	}
	
	
//
//	4. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
//	    영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
	
	public static void prob04() {
		Scanner sc = new Scanner(System.in);
		List<Character> charList = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("영문자를 하나 적어주세요.");
			charList.add(sc.next().charAt(0));
		}
		
		Stream<Character> charListStream = charList.stream()
				.map(c -> {
					if(c.charValue() >= 'a' && c.charValue() <= 'z') {
						c = Character.toUpperCase(c);}
					else if(c.charValue() >= 'A' && c.charValue() <= 'Z') {
						c = Character.toLowerCase(c);}
					return c.charValue();
				});
		
		charListStream.forEach(c -> System.out.print(c.toString()));		
	}
	
	
//
//	5. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서
//	    문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
	
	
	public static void prob05() {
		Scanner sc = new Scanner(System.in);
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("문자열을 입력해주세요.");
			strList.add(sc.next());
		}
		
		Stream<String> strStream = strList.stream()
				.map(c -> {
					for(int i = 0; i < c.toString().length(); i++) {
						if((c.charAt(i) >= 'a' && c.charAt(i) <= 'z' || c.charAt(i) >= 'A' && c.charAt(i) <= 'Z'))
								return c;
								break;
					}
					return "";
				});
		
		strStream.forEach(c -> System.out.print(c.toString()));

}
}
