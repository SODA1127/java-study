package connectionpool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 사용자 정의 커넥션 풀(ConnectionPool) 사용 예제
 * DBMS 접속 시 많은 리소스 사용과 부하가 발생하므로 미리 접속을 하여 메모리상에
 * Connection 객체를 저장해 두고, 필요할 경우 재사용하는 방법
 * 3Tier(Client -> Middle Server -> DBMS) 구현시 접속자가 폭주하여 DB 처리 시 DBMS가 정지되는
 * 상황를 방지하기 위해 커넥션 풀 사용 권장
 * @author
 *
 */
public class UseConnectionPoolExam {

	public static void main(String[] args) throws SQLException {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		System.out.println(connectionPool);
		
		Connection con1 = connectionPool.getConnection();
		System.out.println(con1);
		connectionPool.releaseConnection(con1);
		
		Connection con2 = connectionPool.getConnection();
		System.out.println(con2);
		connectionPool.releaseConnection(con2);
		Connection con3 = connectionPool.getConnection();
		System.out.println(con3);
		connectionPool.releaseConnection(con3);
		Connection con4 = connectionPool.getConnection();
		System.out.println(con4);
		connectionPool.releaseConnection(con4);
		
		/********************************/
		System.out.println("------------ Connection Pool 사용 ------------");
		Connection con = ConnectionPool.getInstance().getConnection();
		ConnectionPool.getInstance().releaseConnection(con);
		System.out.println("------------ Connection Pool 반납 ------------");
		/********************************/
	}

}
