package chap98_homework.HW01_20230314;

public class _01_20230314_advanced_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dBEfIZ";
		String answer = "";
		int ans;
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ans = ((int)ch == 90) ? ((int)97) : ((int)ch<=90 && (int)ch >= 65) ? 
					(int)(ch) + (int)33 :(int)(ch) - (int)33 ;
			answer = (char)ans + answer;
		}
		System.out.println(answer);
		
	}

}
