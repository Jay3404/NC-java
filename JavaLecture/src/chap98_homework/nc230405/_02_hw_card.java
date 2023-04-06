package chap98_homework.nc230405;

import java.util.ArrayList;
import java.util.List;

import chap98_homework.nc230405.clazz.Card;

public class _02_hw_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Card> cardList = 
				new ArrayList<Card>();
		
		cardList.add(new Card("a", 3));
		cardList.add(new Card("b", 3));
		cardList.add(new Card("c", 3));
		cardList.add(new Card("d", 3));
		cardList.add(new Card("e", 3));
		cardList.add(new Card("f", 3));
	}

}
