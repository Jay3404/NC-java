package chap98_homework.HW08_20230323;

public class Middle1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer(30);
		
		sb.insert(0, "hello");
		int index = 0;
		
		for(int i = sb.length(); i < sb.capacity(); i ++ ) {
			
			if(index == 0) {
				sb.insert(i, "b");
				index ++;
			}else if(index == 1) {
				sb.insert(i, "i");
				index++;
			}else if (index == 2){
				sb.insert(i, "t");
				index -= 2;
			}
		}
		System.out.println(sb);
		
		
		
	}
}
