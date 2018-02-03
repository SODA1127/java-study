package byte_stream_filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamFileCopy {
	public static void main(String[] args) throws Exception{
		/*
		 * a.txt -> a_copy.txt
		 */
		String ofileName = "android.png";
		String cfileName = "android_copy.png";
		
		FileInputStream fis = new FileInputStream(ofileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(cfileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		/*
		 * 파일읽기
		 */
		System.out.println(">>> " + ofileName + "-->" + cfileName);
		int count = 0;
		while(true){
			int readByte = bis.read();
			if(readByte == -1) break;
			bos.write(readByte);
			count ++;
			if(count % (1024 * 1024) == 0){
				System.out.println("µ");
			}
		}
		System.out.println(ofileName + " --> " + cfileName + "로 " + count + "byte 복사");
	}
}
