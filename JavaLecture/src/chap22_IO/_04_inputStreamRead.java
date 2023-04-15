package chap22_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _04_inputStreamRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = 
					new FileInputStream(
							"D:/lecture/Java/ex03.txt");
			
			byte[] readData = new byte[100];
			
			while(true) {
				int data = is.read(readData);
				
				//더 이상 읽을 데이터가 없을 때는 -1 리턴
				if(data == -1) {
					break;
				}
				
				for(int i = 0; i < data; i++) {
					System.out.println(readData[i]);
				}
			}
			
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
