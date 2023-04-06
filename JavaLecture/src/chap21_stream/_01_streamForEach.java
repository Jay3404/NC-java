package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_streamForEach {
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = 
					new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
			System.out.println(intList.get(i) + ", ");
		}
		System.out.println();
		
		Stream<Integer> intStream = 
								intList.stream();
		
		intStream.forEach(num -> sum += num);
		
		System.out.println("총 합 : " + sum);
		
		
		
		
		
		
	}

}
