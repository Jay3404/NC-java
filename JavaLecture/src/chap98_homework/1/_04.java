package chap98_homework._0329;

import java.util.Scanner;

//--------------------조건문--------------------
//1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
//
//2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
//
//3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세 
//     요."를 출력하세요.(switch~case~default 사용)
//
//4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
//
//5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
//
//6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//
//7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//
//8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//
//9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
public class _04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
	static void a (Scanner sc) {
		System.out.println("두 개의 정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		System.out.print(">>");
		int n2 = sc.nextInt();
		if(n1 > n2) {
			System.out.println("큰 수는 " + n1);
		}else if(n1 < n2) {
			System.out.println("큰 수는 " + n2);
		}else {
			System.out.println("큰 정수는 같습니다. ");
		}
	}
	
//2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
	static void b (Scanner sc) {
		System.out.println("정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		if(n1 < 0) {
			System.out.println("음수");
		}else if(n1 > 0) {
			System.out.println("양수");
		}else {
			System.out.println("0");
		}
	}
	
//3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
//	"Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세 
//  요."를 출력하세요.(switch~case~default 사용)
	static void c (Scanner sc) {
		System.out.println("문자열 입력");
		System.out.print(">>");
		String str = sc.next();
		switch(str) {
		case "Java": System.out.println("좋아하는 언어입니다."); break;
		case "Python": System.out.println("공부중인 언어입니다."); break;
		default: System.out.println("다른 언어를 공부해보세요");
		}
	}
	
//4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
	static void d (Scanner sc) {
		System.out.println("정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		if(n1%3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}
//5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
	static void e (Scanner sc) {
		System.out.println("정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		if(n1%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	//6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
	//
	static void f (Scanner sc) {
		int[] arr = new int [5];
		int max = 0;
		System.out.println("5개의 정수 입력");
		for(int i=0; i<arr.length; i++) {
			System.out.print(">>");
			arr[i] = sc.nextInt();
			if(i == 0) {
				max = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 수는 " + max);
	}
	
	//7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
	//
	
	static void g (Scanner sc) {
		System.out.println("문자열을 입력하세요");
		System.out.print(">>");
		String str = sc.next();
		if(str.equals("Yes")){
			System.out.println("예");
		}else if(str.equals("No")){
			System.out.println("아니오");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	//8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 
	//첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
	//
	static void h (Scanner sc) {
		System.out.println("두 개의 정수 입력");
		System.out.print(">>");
		int n1 = sc.nextInt();
		System.out.print(">>");
		int n2 = sc.nextInt();
		if(n1 == n2) {
			System.out.println("두 수가 같습니다." );
		}else if(n1 > n2) {
			System.out.println("첫 번째 수가 더 큽니다." );
		}else if(n1 <n2) {
			System.out.println("두 번째 수가 더 큽니다." );
		}
	}
	//9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 
	//그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
	static void i (Scanner sc) {
		int[] arr = new int [3];
		int aCnt = 0;
		int bCnt = 0;
		System.out.println("세 개의 정수 입력");
		for(int i=0; i<arr.length; i++) {
			System.out.print(">>");
			arr[i] = sc.nextInt();
			if(arr[i]%2 == 0) {
				aCnt++;
			}else {
				bCnt++;
			}
		}
		
		if(aCnt == 3) {
			System.out.println("모두 짝수입니다.");
		}else if(bCnt == 3) {
			System.out.println("모두 홀수입니다.");
		}else {
			System.out.println("짝수 : " + aCnt + "개, 홀수 : " + bCnt + "개 입니다.");
		}
		

		
		
		
	}
}
