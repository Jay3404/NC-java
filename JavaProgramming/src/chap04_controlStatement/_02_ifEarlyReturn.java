package chap04_controlStatement;

public class _02_ifEarlyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 91;
		String grade = "";
		
		if(score >= 90) 
			grade = "A";
		
		if(score < 90 && score >= 80)
			grade = "B";
		
		if(score < 80 && score >= 70)
			grade = "C";
		
		if(score < 70 && score >= 60)
			grade = "D";
	
		if(score < 60)
			grade = "F";
		
		//중첩 if문은 함수로 빠진다.
		grade = getGrade(score, grade);
		
		System.out.println(grade);
		
		
	}	
	
	public static String getGrade(int a, String g) {
		String returnStr = "";
		
		if(a % 10 >= 5) {
			returnStr = g + "+";
		} else {
			returnStr = g + "0";
		}
		
		return returnStr;
	}
	
	
	
	
	
}
