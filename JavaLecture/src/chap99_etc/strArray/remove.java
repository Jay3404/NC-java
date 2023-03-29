package chap99_etc.strArray;

import java.util.Scanner;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str2 = str1.replaceAll("비트|네이버|클라우드", "");
		System.out.println(str2);
		
		
	}
	
	
	
	
}
