package chap22_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _05_fileCopybyByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originFileNm = 
			"D:/lecture/Java/images/LinkedList.jpg";
		String copyFileNm = 
			"D:/lecture/Java/images/LinkedListCopy2.jpg";
		
		try {
			InputStream is = 
					new FileInputStream(originFileNm);
			OutputStream os = 
					new FileOutputStream(copyFileNm);
			
//			byte[] readData = new byte[1024];
			
//			while(true) {
//				int cnt = is.read(readData);
//				
//				if(cnt == -1) {
//					break;
//				}
//				
//				os.write(readData);
//			}
			//java9부터 transferTo 메소드가 생겼다
			is.transferTo(os);
			
			os.flush();
			
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
