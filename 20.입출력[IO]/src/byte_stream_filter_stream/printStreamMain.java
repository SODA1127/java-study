package byte_stream_filter_stream;
import java.io.PrintStream;

public class printStreamMain {

	public static void main(String[] args) throws Exception {
		PrintStream pout = new PrintStream("print.txt");
		
		pout.write(49);
		pout.write(50);
		pout.write(51);

		pout.write('1');
		pout.write('2');
		pout.write('3');
		pout.print(123);
		
		pout.write(65);
		pout.write(66);
		pout.write(67);
		
		pout.write('A');
		pout.write('B');
		pout.write('C');
		
		pout.print("오늘 점심은 뭘먹죠!!!");
		pout.print(13211564);
		pout.print(true);
		
		Student st = new Student(111, "KIM", "LA");
		pout.println(st);
		
		System.out.println("----------------- print.txt -----------------");
		pout.close();
	}

}
