package chap22_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _09_performanceOfBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Reader rd = new FileReader(
//					"D:/lecture/Java/name, phone.txt");
//			
//			//성능 향상 보조스트림을 연결
//			BufferedReader brd = 
//					new BufferedReader(rd);
			
			BufferedReader brd = 
					new BufferedReader(
							new FileReader(
							"D:/lecture/Java/name, phone.txt"));
			
			String[] name = new String[100];
			String[] phoneNum = new String[100];
			
			int index = 0;
			
			while(true) {
				//성능 향상 보조스트림의 readLine() 사용해서
				//문자열 한 줄씩 읽어오기
				String line = brd.readLine();
				
				//line이 null이면 다음 값이 없다.
				//while문 종료
				if(line == null) {
					break;
				}
				
				name[index] = line.split(" ")[0];
				phoneNum[index++] = line.split(" ")[1];
				
				for(int i = 0; i < index; i++) {
					System.out.println(name[i] + " : " + phoneNum[i]);
				}
				
			}
			brd.close();
			
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			System.out.println(fnfe.getMessage());
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
