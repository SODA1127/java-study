import java.io.FileInputStream;
import java.sql.DriverManager;


public class ExceptionThrowMain{
	public static void main(String[] args)throws Exception {
		FileInputStream fin2 = new FileInputStream("a.txt");
		Class.forName("First");
		DriverManager.getConnection("");
	}
}
