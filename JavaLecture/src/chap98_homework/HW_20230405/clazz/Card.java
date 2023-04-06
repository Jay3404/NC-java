package chap98_homework.HW_20230405.clazz;

public class Card {
	private String cardName; 
	private int validYear;
	
	public Card(String cardName, int vaildYear) {
		this.cardName = cardName;
		this.validYear = vaildYear;
	}
	
	
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getValidYear() {
		return validYear;
	}
	public void setValidYear(int validYear) {
		this.validYear = validYear;
	}
	
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", validYear=" + validYear + "]";
	}
	
	
	void vaildEnlong(int addvaild, CardVali cv) {
		validYear = validYear + addvaild; 
	}
	
	
	
}
