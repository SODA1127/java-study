package char_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterBufferedReaderMain {

	public static void main(String[] args) throws Exception{
		PrintWriter pw = new PrintWriter(new FileWriter("account.txt"));
		pw.println("1 KIM 45000 5.6");
		pw.println("1 LIM 55000 1.6");
		pw.println("1 SIM 25000 4.6");
		pw.println("1 QIM 65000 9.6");
		pw.println("1 MIM 75000 8.6");
		
		pw.flush();
		pw.close();
		
		System.out.println("------- PrintWriter.println() -------");
		BufferedReader br = new BufferedReader(new FileReader("account.txt"));
		
		while(true){
			String readLine = br.readLine();
			if(readLine == null){
				break;
			}
			else{
				System.out.println(readLine);
			}
		}
		br.close();
	}

}
