import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.itwill.dao.common.ConnectionFactory;

public class SQLMinus {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getConection();
		Statement stmt;
		ResultSetMetaData rsmd;

		System.out.println("--------------------------------  SQL*MINUS : Release 1.1.1 Production on "
				+ new Date().toLocaleString() + " --------------------------------");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("SQL> ");
			String readSQL = br.readLine();
			if (readSQL.equalsIgnoreCase("EXIT")) {
				System.out.println("--- EXIT... ---");
				con.close();
				Thread.sleep(1000);
				System.out.println("Good bye");
				System.exit(0);
			}
			try {
				stmt = con.createStatement();
				boolean isResultSet = stmt.execute(readSQL);
				if (isResultSet) {
					// ResultSet
					ResultSet rs = stmt.getResultSet();
					String selectCon;
					String[] toColumn;
					int row = 0;
					int index = 0;
					int i = 0;
					ArrayList<String> strList = new ArrayList<String>();

					if (readSQL.contains("select")) {
						if(!readSQL.contains("*")) {
							selectCon = readSQL.substring(7);
							index = selectCon.indexOf(" from");
							selectCon = selectCon.substring(0, index);
							selectCon = selectCon.replace(" ", "");
							toColumn = selectCon.split(",");
							for (i = 0; i < toColumn.length; i++) {
								strList.add(toColumn[i]);
							}
							System.out.println("row | " + strList);
							System.out.println("======================셀렉팅 완료======================");
							while (rs.next()) {
								row ++;
								for (int j = 0; j < i; j++) {
									strList.set(j, rs.getString(j + 1));
								}
								System.out.println(row + "번 : " + strList);
							}
							stmt.close();
						}else if(readSQL.contains("*")){
							rsmd = rs.getMetaData();
							int columnsNumber = rsmd.getColumnCount();
							strList.clear();
							for (i = 0; i < columnsNumber; i++) {
								strList.add(rsmd.getColumnName(i + 1));
							}
							System.out.println("row | " + strList);
							System.out.println("======================셀렉팅 완료======================");
							while (rs.next()) {
								row ++;
								for (int j = 0; j < columnsNumber; j++) {
									strList.set(j, rs.getString(j + 1));
								}
								System.out.println(row + "번 : " + strList);
							}
						}
					}
					
					System.out.println(">> ResultSet display");
				} else {
					// UpdateCount
					int rowCount = stmt.getUpdateCount();
					System.out.println(rowCount + "행이 변경되었습니다.");
				}
			} catch (Exception e) {
				System.out.println("error : " + e.getMessage() + " : '" + readSQL + "' 명령어는 잘못 된 명령어입니다.");
			}
		}
	}
}
