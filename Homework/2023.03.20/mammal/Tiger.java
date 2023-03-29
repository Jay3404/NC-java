package chap98_homework.nc230320.mammal;

public class Tiger extends Cat{
	Tiger(String race) {
		super(race);
	}
	
	public void scratch() {
		System.out.println(this.race + "는(은) 할큅니다.");
	}
}
