package char_stream;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterMain {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("fileWriter.txt");
		/*public void write(String str, int off, int len) throws IOException
		Writes a portion of a string.
		Parameters:
			str - A String
			off - Offset from which to start writing characters
			len - Number of characters to write*/
		fw.write(65);
		fw.write(45000);
		fw.write("오늘은 문자스트림을 공부합니다");
		fw.write('힣');
		
		/*
		 * 아직 채워지지 않은 버퍼의 내용은 스트림에 쓴다.
		 */
		System.out.println("FileWriter --> write");
		int count = 0;
		for (int i = 0; i < 65535; i++) {
			fw.write(i);
			count ++;
			if(count%50 == 0){
				fw.write('\n');
			}
		}
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("fileWriter.txt");
		/*public int read()
		         throws IOException
		Reads a single character. This method will block until a character is available, an I/O error occurs, or the end of the stream is reached.
		Subclasses that intend to support efficient single-character input should override this method.

		Returns:
		The character read, as an integer in the range 0 to 65535 (0x00-0xffff), or -1 if the end of the stream has been reached*/
		int readChar = fr.read();
		System.out.println("1. readChar : " + (char)readChar);
		readChar = fr.read();
		System.out.println("2. readChar : " + (char)readChar);
		while (true) {
			readChar = fr.read();
			if(readChar == -1){
				break;
			}
			System.out.println((char)readChar);
		}
		fr.close();
	}

}
