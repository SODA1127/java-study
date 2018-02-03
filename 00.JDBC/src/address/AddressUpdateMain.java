package address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressUpdateMain {

	public static void main(String[] args) throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@210.16.214.203:1521:XE";
		String user = "iot33";
		String password = "iot33";
		String updateSQL = "update address set id='aaa',name='이효리',phone='888-8888',address='제주 서귀포' where no = 1";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("1. Connection : " + con);

		Statement stmt = con.createStatement();
		/*
		 int executeUpdate(String sql)
          throws SQLException
          
          Executes the given SQL statement,
          which may be an INSERT, UPDATE,
          or DELETE statement or an SQL statement that returns nothing,
          such as an SQL DDL statement.
		 */
		
		int updateRowCount = stmt.executeUpdate(updateSQL);
		System.out.println("rowCount : " + updateRowCount);		
		stmt.close();
		con.close();
	}

}
