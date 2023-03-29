package chap18_enum.eunms;

public enum Season {
	SPRING("봄"){
		//봄은 3,4,5월 입니다.
		public void printSeasonMonth() {
			System.out.println("봄은 3,4,5월 입니다.");
		}
	}, 
	SUMMER("여름"){
		//여름은 6,7,8월 입니다.
		public void printSeasonMonth() {
			System.out.println("여름은 6,7,8월 입니다.");
		}
	}, 
	FALL("가을"){
		//가을은 9,10,11월 입니다.
		public void printSeasonMonth() {
			System.out.println("가을은 9,10,11월 입니다.");
		}
	}, 
	WINTER("겨울"){
		//겨울은 12,1,2월 입니다.
		public void printSeasonMonth() {
			System.out.println("겨울은 12, 1, 2월 입니다.");
		}
		
		
	};
	
	private String koreaSeason;
	
	Season(String koreaSeason){
		this.koreaSeason = koreaSeason;
	}

	public String getKoreaSeason() {
		return koreaSeason;
	}
	
	public abstract void printSeasonMonth();
	
	
	
	
	
}
