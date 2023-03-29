package chap14_exception;

public class _01_tryCatchFinally {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		
		int index = 0;
		
		
		while(true) {
			try {
				System.out.println(arr[index++]);
			}catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println(index + "는 배열에 존재하지 않는 인덱스입니다.");
			}finally {
				if(index < 3) {
					System.out.println("정상출력");
				}else {
					System.out.println("예외발생. while문을 종료합니다.");
					break;
				}
			}
		}
	}
}
