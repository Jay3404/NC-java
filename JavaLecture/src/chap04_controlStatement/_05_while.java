package chap04_controlStatement;

public class _05_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1;
		
		while(num <= 100) {
			sum += num++;
		}
		System.out.println(sum);

}
}