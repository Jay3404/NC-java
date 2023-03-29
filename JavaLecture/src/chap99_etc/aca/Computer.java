package chap99_etc.aca;

public class Computer extends Academy{
	
		
	public void teach() {
		System.out.println("컴퓨터 학원에서는 " + subjectCnt + "개 과목을 가르칩니다.");
	}
	public void homework() {
		System.out.println(teacherCnt + "의 선생님께서 숙제를 내주셨습니다.");
	}
	public void rest() {
		System.out.println("쉬는 시간에 " + studentCnt + "의 학생이 쉬고 있습니다.");
	}
	public void attend() {
		System.out.println(classCnt + "개 반의 모든 학생이 출석하였습니다.");
	}
	
}
