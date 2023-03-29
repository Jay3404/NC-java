package chap04_controlStatement;

public class _09_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.
		
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if (i >= j)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		// 2. 
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				if (i > j)
					System.out.print(" ");
				if (i <= j)
					System.out.print("*");
			}
			System.out.println();
		}		
	}
}
