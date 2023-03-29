package chap16_collectionFramework;

import java.util.ArrayList;

import chap06_class.car.Car;

public class _02_arrayListWithType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입을 지정한 ArrayList 선언
		//선언부와 생성자 부분에 <>를 이용해서 타입을 지정
		ArrayList<String> strArrList = new ArrayList<String>();
		
		/*
		 * [
		 * 		{
		 * 			company : "현대"
		 * 			model : "아반떼"
		 * 			price : 3000
		 * 			메소드
		 * 
		 * 
		 * 		},
		 * 		....
		 * 
		 * 
		 * ]		
		*/		
		ArrayList<Car> carArrList = new ArrayList<Car>();
		
		Car car = new Car("현대", "아반떼", "검정", "3000");
		carArrList.add(car);
		
		Car car2 = new Car("기아", "k7", "검정", "4000");
		carArrList.add(car2);
		
		for(int i = 0; i < carArrList.size(); i++) {
			System.out.println(carArrList.get(i));
		}
		
		
		
	}

}
