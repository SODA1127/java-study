package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressDropTableMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@210.16.214.203:1521:XE";
		String user = "iot33";
		String password = "iot33";
		String createTableSQL = "drop table address";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("1. Connection : " + con);

		/*
		 int executeUpdate(String sql)
           throws SQLException
           
           Executes the given SQL statement,
           which may be an INSERT, UPDATE,
           or DELETE statement or an SQL statement that returns nothing,
           such as an SQL DDL statement.
		 */
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate(createTableSQL);
		System.out.println("result : " + result);
		
		stmt.close();
		con.close();
	}

}
