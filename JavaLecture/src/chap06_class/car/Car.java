package chap06_class.car;

import java.util.Scanner;

public class Car {
	//제조사(company), 모델(model), 색상(color), 가격(price)
	//public
	
	//기본 생성자
	//매개변수가 없다.
	
	
	
	//void carInfo() -> 입력한 자동차 정보를 출력
	//제조사: 현대
	//모델: 제네시스
	//색상: 검정
	//가격: 5000
	Scanner sc = new Scanner(System.in);
	int i = 0;
	
	
	
	public String company;
	public String model;
	public String color;
	public String price;
	
	//기본 생성자
	//매개변수가 없다.
	public Car() {
		//String은 null로 초기화되기 때문에
		//데이터에 null이 존재하면 예외가 발생할 확률이
		//높아지므로 ""(빈 문자열)로 초기화해준다.
		company = "";
		model = "";
		price = "";
		System.out.println("기본생성자 호출");
	}
	
	//매개변수가 있는 생성자
	public Car(String c) {
		company = c;
		System.out.println("매개변수 하나인 생성자 호출");
	}
	//매개변수가 있는 생성자
	public Car(String c, String m) {
		company = c;
		model = m;
		System.out.println("매개변수 두 개인 생성자 호출");
	}
	
	//매개변수가 있는 생성자
	public Car(String company, String model, String color) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		System.out.println("매개변수 세 개인 생성자 호출");
		
	}
	
	public Car(String company, String model, String color, String price) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
		
		System.out.println("매개변수 세 개인 생성자 호출");
		
	}
	
	
	public void carInfo() {
		System.out.println("회사: " + company + ", 모델: " + model + ", 색상: " + color + ", 가격: " + price + "만원");
		}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	}


