package chap98_homework.HW08_20230323;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(30);
		
		sb.append("hello");

		for(int i = sb.length(); i < sb.capacity(); i++) {
			sb.insert(i, 'a');
		}
		System.out.println(sb);
		
	}

}
