package chap11_interface.buildings;

public interface Building {
	//모든 변수는 자동으로 상수화 됨.
	String price = "expensive";
	int floors = 120;
	
	//메소드는 자동으로 추상화 됨.
	void build();
	void turnOnAircon();
	int getParkingPrice();
	
	
	
	
	
}
