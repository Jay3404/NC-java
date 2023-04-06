package chap98_homework.nc230404;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import chap98_homework.nc230404.clazz.TList;
import chap98_homework.nc230404.enums.COFFEE;
import chap98_homework.nc230404.enums.COUNTRY;
import chap98_homework.nc230404.enums.MONTH;

public class _01_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한국, 중국, 일본, 미국 중 하나를 입력하세요.");
		String country = sc.nextLine();
		COUNTRY[] countryArr = COUNTRY.values();
		
		for(COUNTRY c : countryArr) {
			c.notifyFood(country);
		}
		
		System.out.println("----------------------------------");

		COFFEE americano = COFFEE.AMERICANO;
		COFFEE latte = COFFEE.LATTE;
		COFFEE mocha = COFFEE.MOCHA;
		COFFEE coldbrew = COFFEE.COLDBREW;
		
		int total = 0;
		
		total += americano.totalPrice(2, 1);
		total += latte.totalPrice(1, 0);
		total += mocha.totalPrice(2, 0);
		total += coldbrew.totalPrice(0, 2);
		
		System.out.println("총 주문금액은 " + total + "원입니다.");
		System.out.println("----------------------------------");
		
		System.out.println("일수를 구하고 싶은 년도를 입력하세요.");
		int year = sc.nextInt();
		
		MONTH[] monthArr = MONTH.values();
		
		for(MONTH m : monthArr) {
			System.out.println(year + "년도의 1월~" + m.getMonth() + "월까지의 일수는 " 
					+ m.sumDays(year) + "일입니다.");
		}
		System.out.println("----------------------------------");
		
		Map<Integer, Integer> intMap = 
				new HashMap<Integer, Integer>();
		
		for(int i = 0; i <= 10; i++) {
			intMap.put(50 + i, 15 + i);
		}
		
		System.out.println(getOverHundr(intMap));
		System.out.println("----------------------------------");
		
		TList<Integer> tl = new TList<Integer>();
		
		List<Integer> intList = 
				new ArrayList<Integer>();
		
		for(int i = 1; i <= 9; i++) {
			intList.add(i);
		}
		
		tl.settList(intList);
		
		tl.splitList();
		
		System.out.println(tl.getFirstHalfList());
		
		System.out.println(tl.getSecondHalfList());
		System.out.println("----------------------------------");
		
		
		
		
		sc.close();
	}
	
	public static <K, V> List<Entry<K, V>> getOverHundr(Map<K, V> map) {
		
		List<Entry<K, V>> entList = 
				new ArrayList<Entry<K, V>>();
		
		for(Entry<K, V> ent : map.entrySet()) {
			int key = 
					Integer.parseInt(ent.getKey().toString());
			int value = 
					Integer.parseInt(ent.getValue().toString());
			
			if(key * value >= 1000) {
				entList.add(ent);
			}
		}
		
		return entList;
	}
}
