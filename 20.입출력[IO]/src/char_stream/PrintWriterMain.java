package char_stream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) throws Exception{
		PrintWriter pw = new PrintWriter(new FileWriter("printWriter.txt"));
		
		pw.print(12341234);
		pw.println();
		pw.print(true);
		pw.println();
		pw.print(0.133465274);
		pw.print("0.133465274");
		pw.println();
		pw.print("Printwriter!!");
		
		pw.println();
		pw.println("1 KIM 2400 5.8");
		pw.println("2 GIM 3400 4.8");
		pw.println("3 DIM 5400 3.8");
		pw.println("4 FIM 6400 1.8");
		pw.println("5 SIM 7400 9.8");
		pw.println("6 AIM 8400 5.3");
		
		pw.flush();
		pw.close();
		
		System.out.println("------------ PrintWriter --> print ------------ ");
	}

}
