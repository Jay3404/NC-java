package chap98_homework;

//        3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneInfo {
//	public String[] name = new String[100];
//	public String[] phoneNum = new String[100];

	private String name;
	private String phoneNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public PhoneInfo(String name, String number) {
		this.name = name;
		this.phoneNum= number;
	}
	
//	public void insertPhoneInfo(String name, String number) {
//		//이름과 번호를 배열에 저장
//		this.name[index] = name;
//		this.phoneNum[index] = number;
//		index++;
//	}
//
//	//모든 PhoneInfo 출력
//	public void printAllPhoneInfo() {
//		for(int i = 0; i < name.length; i++) {
//			if(name[i] != null) {
//				System.out.print("이름 : " + name[i] + ", 번호 : " + phoneNum[i] + "\n");
//			}
//		}
//	}
//
//	//번호에 해당하는 이름과 번호 출력
//	public void printPhoneInfo(int index) {
//		if(name[index - 1] != null) {
//			System.out.print("이름 : " + name[index - 1] + ", 번호 : " + phoneNum[index - 1] + "\n");
//		} else {
//			System.out.println("해당 번호로 저장된 정보가 없습니다.");
//		}
//	}
}
