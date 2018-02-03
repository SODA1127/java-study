package byte_stream;
import java.io.FileInputStream;

/*
	1. Data Source 선정(파일)
	2. InputStream 객체생성(FileInputStream 생성)
	3. InputStream 객체를 사용해서 1바이트씩 읽기
	4. InputStream 객체를 닫는다.(close)
*/
public class FileInputStreamMain {
	 public static void main(String[] args) throws Exception {
		 String fileName = "fileOut.txt";
		 FileInputStream fis = new FileInputStream(fileName);
		 /*
		  public abstract int read() throws IOException
                  - Reads the next byte of data from the input stream.
                  - The value byte is returned as an int in the range 0 to 255.
                  - If no byte is available because the end of the stream has been reached,
                  - the value -1 is returned. This method blocks until input data is available,
                  - the end of the stream is detected, or an exception is thrown.
		  */
		 int readByte = fis.read();
		 System.out.println("1. readByte : " + Integer.toBinaryString(readByte));
		 readByte = fis.read();
		 System.out.println("2. readByte : " + Integer.toBinaryString(readByte));
		 
		 while(true){
			 readByte = fis.read();
			 if(readByte == -1) break;
			 System.out.print(Integer.toBinaryString(readByte));
		 }
		 fis.close();
		 System.out.println();
		 System.out.println("------------- fileOut.txt read -------------");
	}
}