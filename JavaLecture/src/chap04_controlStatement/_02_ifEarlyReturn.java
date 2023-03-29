package chap04_controlStatement;

public class _02_ifEarlyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 78;
		String grade = "";
		
		if(score >= 90)
			grade = "A학점";
		if(score < 90 && score >= 80)
			grade = "B학점";
		if(score < 80 && score >= 70)
			grade = "C학점";
		if(score < 70 && score >= 60)
			grade = "D학점";
		if(score < 60)
			grade = "F학점";
		
		
		System.out.println(grade);
	}

}
