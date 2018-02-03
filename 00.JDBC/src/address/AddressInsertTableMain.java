package address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressInsertTableMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@210.16.214.203:1521:XE";
		String user = "iot33";
		String password = "iot33";
		String insertSQL = "insert into address values(10,'guard','김경호','123-4568','경기도 성남시')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("1. Connection : " + con);

		Statement stmt = con.createStatement();
		System.out.println(stmt);
		int insertRowCount = stmt.executeUpdate(insertSQL);
		System.out.println("rowCount : " + insertRowCount);		
		stmt.close();
		con.close();
	}

}
