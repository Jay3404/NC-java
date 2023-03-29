package chap05_array;

import java.util.Arrays;

public class _07_deepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. clone()을 이용한 깊은 복사
		
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] arr2 = arr1.clone();
//		Object
//		System.out.println(arr1);
//		System.out.println(arr2);
//		System.out.println(arr1 == arr2);
//		System.out.println(Arrays.equals(arr1, arr2));
//		
//		
//		//깊은 복사는 값을 변경해도 서로에게 아무런
//		//영향을 끼치지 않는다.
//		arr1[0] = 10;
//		arr2[0]	= 20;
////		
//		System.out.println(arr1[0]);
//		System.out.println(arr2[0]);
//		
//		//2. System.arraycopy
//		int[] arr3 = new int[5];
//		
//		System.arraycopy(arr1, 0, arr3, 2, arr1.length-2);
//		
//		for(int i : arr3) {
//			System.out.print(i + ", ");
//		}
//		
//		
//		
//		
//		System.out.println(arr1);
//		System.out.println(arr3);
//		System.out.println(arr1 == arr3);
//		System.out.println(arr1.equals(arr3));
//		
////		arr1[1] = 13;
////		arr3[1] = 33;
//		
//		System.out.println(arr1[1]);
//		System.out.println(arr3[1]);
//		
////		System.out.println(arr1[0] + arr1[1] + arr1[2]);
////		System.out.println(arr2[0] + arr2[1] + arr2[2]);
////		System.out.println(arr3[0] + arr3[1] + arr3[2]);
//				
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
	}

}
