package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itwill.dao.address1.Address;
import com.itwill.dao.common.ConnectionFactory;

public class StatementMain {
	public static void main(String[] args) throws Exception {
		String selectSQL = "select * from address order by no asc";
		String updateSQL = "update address set address = '강남구 역삼동' where no = 3";
		String anySQL = selectSQL;
		
		Connection con = ConnectionFactory.getConection();

		/*
		 * 행의수를 제한
		 */
		Statement stmt = con.createStatement();
		stmt.setMaxRows(3);
		/*
		 * 요청만료시간
		 */

		stmt.setQueryTimeout(10);
		int queryTime = stmt.getQueryTimeout();

		ResultSet rs = stmt.executeQuery(selectSQL);
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String addr = rs.getString("address");
			Address address = new Address(no, id, name, phone, addr);
			System.out.println(address);
		}
		rs.close();
		
		int rowCount = stmt.executeUpdate(updateSQL);
		System.out.println("rowCount : " + rowCount);
		
		/*
		 <<Statement>>
		 boolean execute(String sql) throws SQLException
		 Parameters : sql - any SQL statement
		 Returns: true if the first result is a ResultSet object;
		 false if it is an update count or there are no results
		 Throws: SQLException - if a database access error occurs,
		 this method is called on a closed Statement,
		 the method is called on a PreparedStatement or CallableStatement 
		 */
		
		System.out.println("------------------ execute ------------------");
		boolean isResultSet = stmt.execute(anySQL);
		if(isResultSet) {
			// ResultSet
			ResultSet rs1 = stmt.getResultSet();
			while (rs1.next()) {
				int no = rs1.getInt("no");
				String id = rs1.getString("id");
				String name = rs1.getString("name");
				String phone = rs1.getString("phone");
				String addr = rs1.getString("address");
				Address address = new Address(no, id, name, phone, addr);
				System.out.println(address);
			}
			rs1.close();
		} else {
			//update count
			int updateCount = stmt.getUpdateCount();
			System.out.println(updateCount + "행이 변경됨");
		}
		stmt.close();
		
		/*
		 * Connection 반납
		 */
		ConnectionFactory.releaseConnection(con);
		System.out.println("queryTime : " + queryTime);
	}

}
