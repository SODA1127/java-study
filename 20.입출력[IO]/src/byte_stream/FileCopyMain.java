package byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.CountDownLatch;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		/*
		 * a.txt -> a_copy.txt
		 */
		String ofileName = "android.png";
		String cfileName = "android_copy.png";
		
		FileInputStream fis = new FileInputStream(ofileName);
		FileOutputStream fos = new FileOutputStream(cfileName);
		
		/*
		 * 파일읽기
		 */
		System.out.println(">>> " + ofileName + "-->" + cfileName);
		int count = 0;
		while(true){
			int readByte = fis.read();
			if(readByte == -1) break;
			fos.write(readByte);
			count ++;
			if(count % (1024 * 1024) == 0){
				System.out.println("µ");
			}
		}
		System.out.println(ofileName + " --> " + cfileName + "로 " + count + "byte 복사");
	}

}
