package address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressDeleteTableMain {

	public static void main(String[] args) throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@210.16.214.203:1521:XE";
		String user = "iot33";
		String password = "iot33";
		String deleteSQL = "delete from address where no = 1";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("1. Connection : " + con);

		Statement stmt = con.createStatement();
		int deleteRowCount = stmt.executeUpdate(deleteSQL);
		System.out.println("rowCount : " + deleteRowCount);		
		stmt.close();
		con.close();
	}

}
