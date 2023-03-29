package chap06_class;

import chap06_class.animal.bird;

public class _05_animalMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bird bird = new bird();
		
		
		bird bird = new bird("참새");
		
		
		
		
		
		
		bird.name = "독수리";
		bird.color = "흰색";
		bird.food = "고기";
		bird.size = 3;
		bird.wing = 2;
		
		bird.eat();
		bird.cry();
		bird.fly();
		bird.walk();
		
		
		
		
		
		
	}

}
