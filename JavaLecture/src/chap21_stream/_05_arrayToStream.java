package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _05_arrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1;
		}
							//IntStream.of(intArr);
		IntStream intStream = Arrays.stream(intArr);
		
		//5이상인 값들만 스트림으로 만들기
		IntStream filterStream = intStream.filter(c -> c >= 5);
		System.out.println(String.valueOf(filterStream));
		
		//* 4 새로운 스트림 만들기
		IntStream mulStream = filterStream.map(c -> c * 4);
		
		mulStream.forEach(c -> System.out.println(c));
		
		
	}

}
