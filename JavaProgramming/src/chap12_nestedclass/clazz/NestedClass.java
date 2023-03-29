package chap12_nestedclass.clazz;

public class NestedClass {
	public class Mul {
		public int num1 = 10;
		public int num2 = 20;
		
		public int result = num1 * num2;
	}
	
	public static class Div {
		public int num1 = 10;
		public int num2 = 5;
		
		public int result = num1 / num2;
	}
}
