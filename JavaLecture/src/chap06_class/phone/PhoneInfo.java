package chap06_class.phone;

public class PhoneInfo {
	//이름 100개와 전화번호 100개를 담을 수 있는 배열 2개(String)
	public String[] name = new String[100];
	public String[] phone = new String[100];
	
	//배열의 현재 인덱스를 담고 있을 변수
	public int i = 0;
	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum
	public void insertPhoneNum(String name, String num) {
		this.name[i] = name;
		this.phone[i] = num;
		i++;
	}
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동1, 전화번호 : 111111111
	//	  이름 : 홍길동2, 전화번호 : 222222222
	//	  이름 : 홍길동3, 전화번호 : 333333333
	//	  이름 : 홍길동4, 전화번호 : 444444444
	
	public void printAllPhoneNum() {
		for(int i = 0; i < name.length; i++) {
			if (name[i] != null) {
				System.out.println("이름 : " + name[i] + ", 전화번호 : " + phone[i]);
			}else {
				break;
			}
		}
	}
	
	
	
	//전달받은 번호에 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	//ex) 이름 : 홍길동3, 전화번호 : 333333333
	
	public void printPhoneNum(int index) {
		System.out.println(index + "번 째 정보는 " + "이름 : " + name[index - 1] + ", 전화번호 : " + phone[index - 1]);
	}
	
	
	
	
	
}
