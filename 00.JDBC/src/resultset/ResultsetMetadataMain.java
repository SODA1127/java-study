package resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.itwill.dao.common.ConnectionFactory;

public class ResultsetMetadataMain {
	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConection();
		String selectSQL = "select * from emp";
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int columnCount = rsmd.getColumnCount();
		System.out.println("column count : " + columnCount);
		for (int i = 1; i <= columnCount; i++) {
			System.out.println("-------------------- " + i + "번째 컬럼 --------------------");
			String columnName = rsmd.getColumnName(i);
			/*
			 * SQL Type
			 */
			String columnTypeName = rsmd.getColumnTypeName(i);
			int columnType = rsmd.getColumnType(i);
			String columnClassName = rsmd.getColumnClassName(i);
			int isNull = rsmd.isNullable(i);
			int columnDisplaySize = rsmd.getColumnDisplaySize(i);
			
			System.out.println("columnName : " + columnName);
			System.out.println("columnTypeName : " + columnTypeName);
			System.out.println("columnType : " + columnType);
			System.out.println("columnClassName : " + columnClassName);
			System.out.println("isNull : " + isNull);
			System.out.println("columnDisplaySize : " + columnDisplaySize);
		}
		
		
		
		
		
		//for(int i = 1; )
	}
}
