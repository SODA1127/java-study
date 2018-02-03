import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionCatchFinallyMain {

	public static void main(String[] args) throws Exception{
		
		System.out.println("1.stmt");
		try {
			
			System.out.println("2.stmt");
			FileInputStream fis=new FileInputStream("b.txt");
			System.out.println("3.stmt");
			boolean b=false;
			if(b){
				System.out.println("4.return stmt");
				return;
			}
		}catch (FileNotFoundException e) {
			System.out.println("A.catch stmt");
		}finally {
			System.out.println("가.finally 블록[예외발생여부와 관계없이실행되는블록] ");
		}
		System.out.println("5.stmt");
		
		System.out.println("-------try finally-------");
		
		System.out.println("1.stmt");
		try {
			
			System.out.println("2.stmt");
			FileInputStream fis=new FileInputStream("b111.txt");
			System.out.println("3.stmt");
			boolean b=true;
			if(b){
				System.out.println("4.return stmt");
				return;
			}
		}finally {
			System.out.println("가.finally 블록[예외발생여부와 관계없이실행되는블록] ");
		}
		System.out.println("5.stmt");
	}

}
