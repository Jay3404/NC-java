package chap98_homework.HW_20230403;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prob07();
		
		
		
	}
	
//	--------------------변수--------------------

	static void prob01() {
		int a = 10;
		int b = 3;
		
		int add = a + b;
		int substract = a - b;
		int multiply = a * b;
		double divide = a / b;
		
		System.out.println("add : " + add + ", substract : " + substract + ", multiply : " + multiply + ", divide : " + divide );
	}
	
	static void prob02() {
		double a = 10.01;
		double b = 12.25;
		
		double add = a + b;
		double substract = a - b;
		double multiply = a * b;
		double divide = a / b;
		
		System.out.println("add : " + add + ", substract : " + substract + ", multiply : " + multiply + ", divide : " + divide );
	}
	
	static void prob03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 하나 입력해주세요.");
		char input = sc.next().charAt(0);
		
		if(input <= 'z' && input >= 'a') {
			System.out.println((char)((int)input - 32)); 
		}else if(input <= 'Z' && input >= 'A') {
			System.out.println((char)((int)input + 32));
		}
	}
	
//	--------------------형변환--------------------

	
	static void prob04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력해주세요.");
		StringBuilder sb = new StringBuilder();
		
		sb.append(sc.next());
		
		try {
			if(sb.toString().contains(".")) {
				double doubleAnswer = Double.parseDouble(sb.toString());
				System.out.println(doubleAnswer);
			}else {
				int intAnswer = Integer.parseInt(sb.toString());
				System.out.println(intAnswer);
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
//	--------------------연산자--------------------
	
	static void prob05() {
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				// 3, 6 ,9
			} else if((i + 2) % 3 ==0) {
				// 1, 4, 7, 10
			} else if((i + 1) % 3 == 0) {
				// 2, 5, 8
			}
		}
	}
	
	static void prob06() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~20 사이의 숫자를 입력해주세요.");
		
		int input = sc.nextInt();
		
		String a = isPrime(input) ? 
				(input + "은 소수입니다.") : (input % 4 == 0)?
						(input + "은 4의 배수입니다.") : (input + "은 4의배수가 아닙니다.");
		System.out.println(a);
	}
	
	static boolean isPrime(int num) {
		boolean isPrime = true;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0 && num != 2) {
				isPrime = false;
			}
		}
		return isPrime;
	}

//	--------------------조건문--------------------	
	
	static void prob07() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		
		String input = sc.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		
		int statement = sb.length();
		int index = 0;
		String answer = "";
		
		if(sb.length() >= 20) {
			for(int i = 0; i < sb.length(); i++) {
				answer = sb.toString().charAt(i) + answer;
			}System.out.println(answer);
		}
		if(sb.length() < 20) {
			for(int i = 0; i < 20 - statement; i++) {
				if(index == 0) {
					sb.append('n');
					index++;
				}else if(index == 1) {
					sb.append('a');
					index++;
				}else if(index == 2) {
					sb.append('v');
					index++;
				}else if(index == 3) {
					sb.append('e');
					index++;
				}else if(index == 4) {
					sb.append('r');
					index -= 4;
				}
			}System.out.println(sb.toString());
		}
		
	}
	
//	--------------------반복문--------------------

	static void prob08() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		
		int num = rand.nextInt(20) + 1;
		String input = sc.next();
		int index = 0;
		int bitCnt = 0;
		
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		
		for(int i = 0; i < num; i++) {
			if(index == 0) {
				sb.append('b');
				index++;
			}else if(index == 1) {
				sb.append('i');
				index++;
			}else if(index == 2) {
				sb.append('t');
				index -= 2;
				bitCnt++;
			}
		}
		System.out.println(sb.toString() + "이고, bit는 " + bitCnt + "번 추가되었습니다.");
	}
	
	static void prob09() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		int input = sc.nextInt();
		int index = 0;
		
		for(int i = 1; i <= input; i++) {
			if(input % i == 0) {
				index += i;
			}
		}
		System.out.println("약수들의 총합은 " + index + "입니다.");
	}
	
//	--------------------배열--------------------
	
	static void prob10() {
		char[] charArr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
		
		String bit = "", com = "", sql = "", Int = "";
		
		for(int i = 0; i < 12; i++) {
			if(i % 4 == 0) {
				bit += charArr[i];
			}else if((i - 1) % 4 == 0) {
				com += charArr[i];
			}else if((i - 2) % 4 == 0) {
				sql += charArr[i];
			}else if((i - 3) % 4 == 0) {
				Int += charArr[i];
			}	
		}
		System.out.println(bit);
		System.out.println(com);
		System.out.println(sql);
		System.out.println(Int);
	}
	
//	--------------------클래스--------------------
	
	static void prob11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력해주세요.");
		
		IfCla ic = new IfCla();
		ElseCla ec = new ElseCla();
		ElseIfCla eic = new ElseIfCla();
		
		int input = sc.nextInt();
		
		ic.makeIf(input);
		ec.makeElse(input);
		
	}
	
//	--------------------상속--------------------
	
	static void prob12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력해주세요.");
		
		ElseIfCla eic = new ElseIfCla();
		
		int input = sc.nextInt();
		
		eic.makeIf(input);
		eic.makeElseIf(input);
		eic.makeElse(input);
	}
	
//	--------------------컬렉션--------------------

	static void prob13() {
		
		Map<String, Integer> foodPriceMap = new HashMap<>();
		Map<String, Integer> foodOrderMap = new HashMap<>();
		
		foodPriceMap.put("비빔밥", 6000);
		foodPriceMap.put("칼국수", 9000);
		foodPriceMap.put("투뿔등심", 70000);
		
		foodOrderMap.put("비빔밥", 5);
		foodOrderMap.put("칼국수", 2);
		foodOrderMap.put("투뿔등심", 1);
		
		int sumPrice = 0;
		
		sumPrice += foodPriceMap.get("비빔밥") * foodOrderMap.get("비빔밥") +
				foodPriceMap.get("칼국수") * foodOrderMap.get("칼국수") +
				foodPriceMap.get("투뿔등심") * foodOrderMap.get("투뿔등심");
		
		System.out.println("총 가격은 " + sumPrice + "입니다.");
		
	}

	
	
	
}
