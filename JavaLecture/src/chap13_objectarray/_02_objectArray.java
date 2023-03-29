package chap13_objectarray;

import chap13_objectarray.clazz.Ilecture;

public class _02_objectArray implements Ilecture{

	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public _02_objectArray(int studentCnt, int lectureTime, String subject) {
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
		this.subject = subject;
	}
	
	@Override
	public void proceedLecture() {
		// TODO Auto-generated method stub
		System.out.println(this.subject + "수업을 " + this.studentCnt + "명의 학생이 듣습니다. 수업시간은 " + lectureTime + "분 입니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ilecture[] il = new Ilecture[3];
		il[0] = new _02_objectArray(30, 50, "English");
		il[1] = new _02_objectArray(20, 70, "Mathmetics");
		il[2] = new _02_objectArray(25, 40, "Programming");
		
		
		for(int i = 0; i < il.length; i++) {
			il[i].proceedLecture();
		}
		
	}

	

}
