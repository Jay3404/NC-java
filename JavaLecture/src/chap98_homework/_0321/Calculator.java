package chap98_homework._0321;

//1. Calculator 클래스를 만들고 인스턴스 중첩 클래스로
//Add, Sub, Mul, Div 클래스를 만드세요.
//각각 int add(int a, int b)
//   int sub(int a, int b)
//   int mul(int a, int b)
//   int div(int a, int b)
//메소드를 가진 인스턴스 중첩 클래스를 구현하시면 됩니다.
public class Calculator {
	class Add {
		public int add(int a, int b) {
			return a + b;
		}
	} 
	class Sub {
		public int sub(int a, int b) {
			return a - b;
		}
	}
	class Mul {
		public int mul(int a, int b) {
			return a * b;
		}
	}
	class Div {
		public int div(int a, int b) {
			return a / b;
		}
	}
}
