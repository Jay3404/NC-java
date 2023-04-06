package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import chap21_stream.clazz.CreditCard;

public class _08_mapToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CreditCard> cardList =
					new ArrayList<CreditCard>();
		
		for(int i = 1; i <= 10; i++) {
			cardList.add(new CreditCard(
					"회사" + i, "카드명" + i, 100 * i));
		}
		
		Stream<CreditCard> cardStream = cardList.stream();
		
		IntStream limitStream = cardStream.mapToInt(
				card -> card.getLimitMoney()
		);
		
		//limitStream.forEach(money -> System.out.println(money));
		System.out.println(limitStream.average().getAsDouble());
	}

}
