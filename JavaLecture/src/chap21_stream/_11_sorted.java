package chap21_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _11_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList =
					new ArrayList<Integer>();
		
		for(int i = 1; i <= 5; i++) {
			intList.add(i);
		}
		
		intList.stream()
			   //.sorted()
			   //Comparator.reverseOrder() 
			   //                 : 역순(내림차순)으로 정렬
			   .sorted(Comparator.reverseOrder())
			   .forEach(num 
					   -> System.out.println(num));
	}

}
