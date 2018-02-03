package basic;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCOverView {
	public static void main(String[] args) throws Exception{
		String driverClass1 = "oracle.jdbc.OracleDriver";
		String driverClass2 = "basic.MyDBDriver";
		String url = "jdbc:oracle:thin:@210.16.214.203:1521:XE";
		String user = "iot33";
		String password ="iot33";
		String selectSQL = "select deptno, dname, loc from dept";
		
		/*
		 * 1. Driver Class Loading
		 * A. OracleDriver 객체생성
		 *B. Driver Manager 객체등록
		 */
		Class.forName(driverClass1);
		
		/*String className = dClass.getName();
		System.out.println("className : " + className);
		Driver driverInstance = (Driver)dClass.newInstance();
		System.out.println(driverInstance);*/
		
		/*
		 * 2. Connection 생성(DB연결 객체)(Socket)
		 */
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("1. Connection : " + con);
		
		/*
		 * 3. Statement 생성작업(Stream)
		 */
		Statement stmt = con.createStatement();
		System.out.println("2. Statement : " + stmt);
		
		/*
		 * 4. SQL전송
		 */
		ResultSet rs = stmt.executeQuery(selectSQL);
		System.out.println("3. ResultSet : " + rs);
		/*
		 * 5.결과 핸들링
		 */
		//boolean isDataExist = rs.next();
		System.out.println("==========================");
		System.out.println("DEPTNO DNAME LOC");
		System.out.println("==========================");
		while(rs.next()) {
			String deptno = rs.getString("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno + "    " + "    " + dname + "    " + loc);			
		}
		System.out.println("==========================");
		/*
		 * 6. 리소스 해지
		 */
		rs.close();
		stmt.close();
		con.close();
		
	}
}