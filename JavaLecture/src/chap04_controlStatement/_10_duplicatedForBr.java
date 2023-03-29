package chap04_controlStatement;

public class _10_duplicatedForBr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//내외부 몇 번 실행이 됐는지 담을 변수
		int iCnt = 0;
		int jCnt = 0;
		
		for(int i = 0; i < 5; i++) {
			//외부 for문의 break는 전체를 종료
			if(i == 3) {
				break;
			}
			iCnt++;
			
			for(int j = 0; j < 5; j++) {
				//내부 for문의 break는 내부만 종료
				if(j == 2) {
					break;
				}
				jCnt++;
			}
		}
		
		System.out.println(iCnt);
		System.out.println(jCnt);
		
		
	}

}
