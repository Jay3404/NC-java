package chap22_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _07_readerReadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader reader =
					new FileReader(
						"D:/lecture/Java/wr01.txt");
			
			//1. 한 개의 문자씩 입력
			while(true) {
				int data = reader.read();
				
				//더 이상 입력받을 문자가 존재하지 않을 때
				if(data == -1) {
					break;
				}
				
				System.out.print((char)data);
			}
			reader.close();
			
			
			System.out.println();
			
			//reader도 스트림이어서 한 번 사용되면
			//다시 파일을 읽어와야된다.
			reader =
					new FileReader(
						"D:/lecture/Java/wr01.txt");
			
			char[] chArr = new char[255];
			
			//2. 문자배열로 입력
			while(true) {
				int cnt = reader.read(chArr);
				
				if(cnt == -1) {
					break;
				}
				
				for(int i = 0; i < cnt; i++) {
					System.out.print(chArr[i]);
				}
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
