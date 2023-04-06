package chap98_homework.HW_20230404.clazz;

import java.util.Arrays;

public class IntArrUtils {
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		
		for(int i : arr) {
			if(i < min) {
				min = i;
			}
		}
		
		return min;
	}

	public static int getMid(int[] arr) {
		Arrays.sort(arr);
		
		int mid = arr[arr.length / 2];
		
		return mid;
	}
}
