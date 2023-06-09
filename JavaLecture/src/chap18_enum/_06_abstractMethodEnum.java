package chap18_enum;

import chap18_enum.eunms.Calculator;
import chap18_enum.eunms.Season;

public class _06_abstractMethodEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add = Calculator.PLUS;
		int result = add.calculate(10, 5);
		System.out.println(result);
		
		Calculator[] cArr = Calculator.values();
		for(Calculator c : cArr) {
			System.out.println(
					c.calculate(10, 4));
		}
		
		
		Season s1 = Season.SPRING;
		s1.printSeasonMonth();
		
		Season s2 = Season.SUMMER;
		s2.printSeasonMonth();
		
		Season s3 = Season.FALL;
		s3.printSeasonMonth();
		
		Season s4 = Season.WINTER;
		s4.printSeasonMonth();
		
		System.out.println("=================================================");
		
		Season[] sArr = Season.values();
		for(Season s : sArr) {
			s.printSeasonMonth();
		}
		
		
		
	}

}
