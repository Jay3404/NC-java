package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap21_stream.clazz.CreditCard;

public class _15_collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CreditCard> cardList = 
					new ArrayList<CreditCard>();
		
		cardList.add(new CreditCard("a", "A", 100));
		cardList.add(new CreditCard("a", "B", 300));
		cardList.add(new CreditCard("a", "C", 600));
		cardList.add(new CreditCard("b", "D", 500));
		cardList.add(new CreditCard("b", "E", 800));
		cardList.add(new CreditCard("c", "F", 200));
		cardList.add(new CreditCard("c", "G", 500));
		
		//1. 특정 카드사의 카드만 뽑아서 
		//   collect로 수집후 리스트로 변환
		List<CreditCard> aCompanyCardList =
					cardList.stream()
							.filter(card -> 
								card.getCompany().equals("a"))
							.collect(Collectors.toList());
		
//		for(CreditCard c : cardList) {
//			if(c.getCardName().equals("a")) {
//				aCompanyCardList.add(c);
//			}
//		}
		System.out.println(aCompanyCardList.toString());
		
		//2. Map<cardname, limitmoney> 변환
		Map<String, Integer> cardMap =
					cardList.stream()
							.filter(card -> 
								card.getLimitMoney() >= 500)
							.collect(
								Collectors.toMap(
									card -> card.getCardName(), 
									card -> card.getLimitMoney())
							);
		
		System.out.println(cardMap.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
