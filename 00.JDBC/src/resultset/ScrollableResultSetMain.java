package resultset;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itwill.dao.common.ConnectionFactory;

public class ScrollableResultSetMain {
	public static void main(String[] args) throws Exception{
		String selectSQL = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp order by empno desc";
		//String selectSQL = "select * from emp order by empno desc";
		Connection con = ConnectionFactory.getConection();
		/*
		 * CURSOR를 자유롭게 움직일 수 있는 ResultSet 생성
		 */
		Statement stmt = con .createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
																		ResultSet.CONCUR_UPDATABLE);
		//Statement stmt = con .createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		
		System.out.println("--------------- rs.next() ---------------");
		while (rs.next()) {
			System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		}
		
		System.out.println("--------------- rs.previous() ---------------");
		while (rs.previous()) {
			System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		}
		
		rs.beforeFirst(); //BOF
		rs.afterLast(); //EOF
		
		System.out.println("--------------- rs.first() ---------------");
		rs.first();
		System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		
		System.out.println("--------------- rs.last() ---------------");
		rs.last();
		System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		
		System.out.println("--------------- rs.getRow() ---------------");
		rs.first();
		int rowCount = rs.getRow();
		System.out.println("rowCount : " + rowCount);
		
		System.out.println("--------------- rs.getAbsolute() ---------------");
		rs.absolute(5);
		System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		
		/*
		 * rs.relative(1) --> rs.next()
		 * rs.relative(-1) --> rs.previous()
		 * 
		 */
		
		System.out.println("--------------- rs.relative(1) ---------------");
		rs.relative(1);
		System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		rs.relative(-1);
		System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		
		/*
		 * 수정가능한 ResultSet 생성
		 * 		- ResultSet을 통한 INSERT, DELETE, UPDATE
		 */
		System.out.println("--------------- ResultSet --> UPDATE ---------------");
		// 1. UPDATE할 행 CURSOR위치
		rs.first();
		// 2. ResultSet 변경
		rs.updateString(2, "SMITH");
		rs.updateDate(5, new Date(System.currentTimeMillis()));
		rs.updateDouble(6, 5000.1234);
		// 3. Table의 반영
		rs.updateRow();
		System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename"));
		
		System.out.println("--------------- ResultSet --> DELETE ---------------");
		rs.last();
		//rs.deleteRow();
		
		System.out.println("--------------- ResultSet --> INSERT ---------------");
		/*rs.moveToInsertRow();
		rs.updateInt(1, 8888);
		rs.updateString(2, "김경호");
		rs.updateString(3, "CLERK");
		rs.updateDate(5, new Date(2017-1900, 11, 28));
		rs.updateDouble(6, 5555.89);
		rs.insertRow();*/
		
		System.out.println("--------------- INSERT 이후 row count ---------------");
		rs.last();
		System.out.println(rs.getRow());
		
		
	}

}
