package chap11_interface;

import chap11_interface.multiinherit.MultiflexStadium;
import chap11_interface.multiinherit.SeoulMultiflexStadium;

public class _02_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiflexStadium ms = new SeoulMultiflexStadium();
		
		ms.getSportsSchedule(3);
		int sportsTickt = ms.getSportsTicketPrice(2);
		ms.getSupportersItem(2);
		
		ms.getRemainSeat();
		int concertTicket = ms.getTicketPrice(5);
		ms.playSortsAndConcert();
		
	}

}
