package char_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterReaderMain {

	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedWriter.txt"));
		bw.write(65);
		bw.write(45000);
		bw.write("오늘은 문자스트림을 공부합니다");
		bw.write('힣');
		
		/*
		 * 아직 채워지지 않은 버퍼의 내용은 스트림에 쓴다.
		 */
		System.out.println("FileWriter --> write");
		int count = 0;
		for (int i = 0; i < 65535; i++) {
			bw.write(i);
			count ++;
			if(count%50 == 0){
				bw.write('\n');
			}
		}
		bw.flush();
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("bufferedWriter.txt"));
		int readChar = br.read();
		int lineNumber= 0;
		System.out.println("1. readChar : " + (char)readChar);
		readChar = br.read();
		System.out.println("2. readChar : " + (char)readChar);
		while(true){
			/*public String readLine() throws IOException
                Reads a line of text. A line is considered to be terminated by
                any one of a line feed ('\n'),
                a carriage return ('\r'),
                or a carriage return followed immediately by a linefeed.
		Returns: A String containing the contents of the line,
				not including any line-termination characters,
				or [null] if the end of the stream has been reached*/
			String readLine = br.readLine();
			
			if(readLine == null)
				break;
			lineNumber ++;
			System.out.println(lineNumber+ " : " + readLine);
		}
		br.close();
	}

}
