package byte_stream;

import java.io.FileOutputStream;
/*
 	1. Data Target 선정(파일)
 	2. OutputStream 객체생성(FileOutputStream 생성)
 	3. OutputStream 객체를 사용해서 1바이트씩 쓰기
 	4. OutputStream 객체를 닫는다.(close)
 */
public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fileOut.txt");
		/*
		 public void write(int b)
           throws IOException
			Writes the specified byte to this file output stream.
			Implements the write method of OutputStream.
		 */
		fos.write(65);
		fos.write(66);
		fos.write(67);
		fos.write('D');
		/*
		 * 
		 */
		fos.write('김');
		fos.write(40000);
		
		String bits =
		Integer.toBinaryString(65) + 
		Integer.toBinaryString(66) +
		Integer.toBinaryString(67);
		System.out.println("written bits --> " + bits);
		for (int i = 0; i < 256; i++) {
			fos.write(i);
		}
		
		fos.close();
		System.out.println("------------- fileOut.txt write -------------");
		
	}

}
