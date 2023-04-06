package chap98_homework.nc230405.clazz;

public class Card {
	private String cardName;
	private int vaildYear;
	
	public Card(String cardName, int validYear) {
		this.cardName = cardName;
		this.vaildYear = validYear;
	}
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getVaildYear() {
		return vaildYear;
	}
	public void setVaildYear(int vaildYear) {
		this.vaildYear = vaildYear;
	}
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", vaildYear=" + vaildYear + "]";
	}
	
	public void validEnlong(int year, CardVali cardVali) {
		this.vaildYear += year;
		cardVali.enlong(year);
	}
}
