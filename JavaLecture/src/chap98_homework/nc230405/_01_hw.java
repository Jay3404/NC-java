package chap98_homework.nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap98_homework.nc230405.clazz.Student;

public class _01_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = 
				new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(
					(int)(Math.random() * 10) + 1);
		}
		System.out.println(intList);
		
//		Stream<Integer> intStream = 
//					intList.stream();
//		
//		Stream<Integer> newStream = 
//					intStream.map(num -> num * 3);
//		
//		newStream.forEach(num -> 
//					System.out.print(num + ", "));
		//체이닝기법
		intList.stream()
			   .map(num -> num * 3)
			   .forEach(num ->
			   				System.out.print(num + ", "));
							
		System.out.println();
		System.out.println("----------------------------");
		
		List<Student> sList = 
					new ArrayList<Student>();
		
		sList.add(new Student(1, "홍길동", 100));
		sList.add(new Student(2, "임꺽정", 75));
		sList.add(new Student(3, "장길산", 86));
		sList.add(new Student(4, "정도전", 97));
		sList.add(new Student(5, "이순신", 95));
		
//		Stream<Student> sStream = sList.stream();
//		
//		Stream<Student> aPlusStream =
//				sStream.filter(student -> 
//								student.getScore() >= 95);
//		
////		aPlusStream.forEach(student -> 
////				System.out.println(student.toString()));
//		System.out.println("----------------------------");
//		
//		Stream<Student> aStream =
//				aPlusStream.map(student -> {
//					student.setGrade("A+");
//					return student;
//				});
//		
//		aStream.forEach(student ->
//				System.out.println(student.toString()));
		
		//체이닝기법
		sList.stream()
			 .filter(s -> s.getScore() >= 95)
			 .map(s -> {
				 s.setGrade("A+");
				 return s;
			 })
			 .forEach(s -> 
			 			System.out.println(s.toString()));
	}

}
