import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionThrowMechanismMain2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, UnknownHostException, IOException {
		/*
		 * java class 메소드 호출
		 */
		DriverManager.getConnection("");
		Class.forName("");
		
		Socket socket = new Socket("www.naver.com", 80);
		System.out.println(socket);
	}

}
