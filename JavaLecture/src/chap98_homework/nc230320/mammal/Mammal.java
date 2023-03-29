package chap98_homework.nc230320.mammal;

public class Mammal {
	public String race;
	
	public Mammal() {
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	public Mammal(String race) {
		this.race = race;
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	public void calve() {
		System.out.println(race + "는(은) 새끼를 낳습니다.");
	}
}
