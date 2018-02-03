import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class ExceptionCatchMain {
	public static void main(String[] args) {
		System.out.println("---------------------------- 1. try catch -------------------------------");
		System.out.println("stmt1");
		try {
			System.out.println("stmt2 - try block start");
			FileInputStream fin = new FileInputStream("a.txt");
			System.out.println("stmt2 - try block end");
		} catch (FileNotFoundException e) {
			System.out.println("stmt2 - catch block start");
			System.out.println("메세지 출력 or 복구시도");
			System.out.println("에러메세지 : " + e.getMessage() );
			//FileInputStream fin = new FileInputStream("b.txt");
			System.out.println("stmt2 - catch block end");
			//e.printStackTrace();
		}
		System.out.println("stmt3");
		try {
			System.out.println("stmt4 - try block start");
			Class.forName("aaa");
			System.out.println("stmt4 - try block end");
		} catch (ClassNotFoundException e) {
			System.out.println("stmt4 - catch block start");
			System.out.println("메세지 : " + e.getMessage());
			System.out.println("우아하게 종료!");
			/*JOptionPane.showMessageDialog(null, "미안해요~ 종료합니다");
			System.exit(0);*/
			System.out.println("--------- e.printStackTrace() ---------");
			e.printStackTrace();
			System.out.println("--------- e.printStackTrace() end ---------");
			System.out.println("stmt4 - catch block end");
		}
		System.out.println("stmt4");
		try {
			System.out.println("stmt5 - try block start");
			DriverManager.getConnection("");
			System.out.println("stmt5 - try block end");
		} catch (SQLException e) {
			System.out.println("stmt5 - catch block start");
			System.out.println("메세지 : " + e.getMessage());
			System.out.println("stmt5 - catch block end");
		}
		
		System.out.println("----------------------------- 2. try multi catch ------------------------------");
		System.out.println("stmt1");
		try{
			System.out.println("stmt2");
			FileInputStream fin2 = new FileInputStream("b.txt");
			System.out.println("stmt3");
			Class.forName("sss");
			System.out.println("stmt4");
			DriverManager.getConnection("");
		} catch (FileNotFoundException e){
			System.out.println("Catch FileNotFoundException : " + e.getMessage());
		}catch (ClassNotFoundException e){
			System.out.println("ClassNotFoundException : " + e.getMessage());
		}catch (SQLException e){
			System.out.println("SQLException : " + e.getMessage());
		}
		
		System.out.println("----------------------------- 3. try catch ------------------------------");
		System.out.println("stmt1");
		try{
			System.out.println("stmt2");
			FileInputStream fin2 = new FileInputStream("a.txt");
			System.out.println("stmt3");
			Class.forName("First");
			System.out.println("stmt4");
			DriverManager.getConnection("");
		}catch(Exception e){
			System.out.println("메세지 : " + e.getMessage());
		}
		System.out.println("stmt99");
	}
}
