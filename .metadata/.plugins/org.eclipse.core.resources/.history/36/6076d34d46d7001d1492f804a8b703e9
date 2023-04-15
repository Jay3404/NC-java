package chap98_homework.nc230407.phoneinfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class PhoneInfo {
	//이름 100개와 전화번호 100개를 담을수 있는 배열 2개(String)
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	
	//배열의 현재 인덱스를 담고 있을 변수
	int currentIndex = 0;
	
	public PhoneInfo() {
		String sName = "";
		String phone = "";
		
		try {
			Reader reader = new FileReader("D:/lecture/Java/name.txt");
			
			char[] chArr = new char[4096];
			
			
			while(true) {
				int cnt = reader.read(chArr);
				
				if(cnt == -1) {
					break;
				}
				
				//홍길동\n장길산\n......
				for(int i = 0; i < cnt; i++) {
					sName = sName + chArr[i];
				}
				
				String[] nameArr = sName.split("\n");
				
				for(int i = 0; i < nameArr.length; i++) {
					name[i] = nameArr[i];
				}
			}
			
			reader.close();
			
			reader = new FileReader("D:/lecture/Java/phone.txt");
			
			while(true) {
				int cnt = reader.read(chArr);
				
				if(cnt == -1) {
					break;
				}
				
				//01011111111\n01022222222\n.....
				for(int i = 0; i < cnt; i++) {
					phone = phone + chArr[i];
				}
				
				String[] phoneArr = phone.split("\n");
				
				for(int i = 0; i < phoneArr.length; i++) {
					phoneNum[i] = phoneArr[i];
					//다음에 저장될 인덱스의 번호를 담는다.
					currentIndex = i + 1;
				}
			}
			
			reader.close();
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
			System.out.println("정보를 입력하고 저장해주세요.");
		} catch(IOException ioe) {
			System.out.println(ioe.toString());
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum
	public void insertPhoneNum(String name, String PhoneNum) {
		this.name[currentIndex] = name;
		this.phoneNum[currentIndex] = PhoneNum;
		currentIndex++;
	}
	
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동1, 전화번호 : 11111111111
	//    이름 : 홍길동2, 전화번호 : 22222222222
	//    이름 : 홍길동3, 전화번호 : 33333333333
	//    이름 : 홍길동4, 전화번호 : 44444444444
	public void printAllPhoneNum() {
		for(int i = 0; i < currentIndex; i++) {
			System.out.println("이름 : " + name[i] +
					", 전화번호 : " + phoneNum[i]);
		}
	}
	
	//전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	//ex) 이름 : 홍길동3, 전화번호 : 33333333333
	public void printPhoneNum(int index) {
		if(name[index - 1] == null) {
			System.out.println("해당 인덱스의 정보가 존재하지 않습니다.");
		} else {
			System.out.println("이름 : " + name[index - 1] +
					", 전화번호 : " + phoneNum[index - 1]);
		}
	}
	
	//파일 저장 메소드
	//추가된 이름, 번호를 파일에 저장한다.
	public void saveData() {
		try {
			Writer writer = new FileWriter("D:/lecture/Java/name.txt");
			
			String svName = "";
			
			for(int i = 0; i < currentIndex; i++) {
				if(i != currentIndex - 1) {
					//홍길동\n장길산\n......
					svName = svName + name[i] + "\n";
				} else {
					//홍길동\n장길산\n......\n아무개
					svName = svName + name[i];
				}
			}
			
			writer.write(svName);
			writer.flush();
			writer.close();
			
			writer = new FileWriter("D:/lecture/Java/phone.txt");
			
			String phone = "";
			
			for(int i = 0; i < currentIndex; i++) {
				if(i != currentIndex - 1) {
					//01011111111\n01022222222\n.....
					phone = phone + phoneNum[i] + "\n";
				} else {
					//01011111111\n01022222222\n.....\n010********
					phone = phone + phoneNum[i];
				}
			}
			
			writer.write(phone);
			writer.flush();
			writer.close();
			
		} catch(IOException ioe) {
			System.out.println(ioe.toString());
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
