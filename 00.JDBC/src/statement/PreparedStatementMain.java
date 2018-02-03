package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.dao.common.ConnectionFactory;

public class PreparedStatementMain {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConection();
		
		/*****************************************************
		<<Statement>>
		int startSal = 1000;
		int endSal = 3000;
		String job = "SALESMAN";
		String selectSQL = "select empno, ename, job, sal, deptno from emp "
				+ "where sal > " + startSal + " and sal <= " + endSal + " and job = '" + job + "'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		*****************************************************/
		
		/*****************************************************
		<<Prepared Statement>>
          1. sql문작성
              - ?(파라메타) 를 사용해서 나중에 외부에서 데이타를 받을수있게한다.
                ex> insert into emp(empno,ename,job,manager,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)   
              - 테이블이름,컬럼이름등은 ? 를 사용해서 외부에서 입력받을수없다.
                ex> select * from ? 
                    select ?,? from emp    
          2. PreparedStatement 객체생성시 인자로 sql문을 넣어서생성한다
             ex> PreparedStatement pstmt = con.prepareStatement(sql);
          3. 생성된 PreparedStatement 객체에 파라메타를 setting 한다
              - sql 좌측 ? 부터 1,2,3...
             ex> pstmt.setInt(1,1234);              
                    pstmt.setString(2, "KIM");              
                    pstmt.setString(3, "MANAGER");              
                    pstmt.setInt(4,7839);              
                    pstmt.setDate(5, new Date());      
                    pstmt.setDouble(6,1000.12);              
                    pstmt.setInt(7,0);              
                    pstmt.setInt(8,10);              
           4.  실행
              - 실행시 sql문을 인자로 넣지않는다.
              ex> pstmt.executeUpdate();         
                  	 pstmt.executeQuery();         
		 *****************************************************/
		
		int startSal = 1000;
		int endSal = 3000;
		String job = "CLERK";
		String selectSQL = "select empno, ename, job, sal, deptno "
				+ "from emp where sal >= ? and sal <= ? and job = ?";
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		
		System.out.println("------------------- setXXX() 변수바인딩 --------------------");
		pstmt.setInt(1, startSal);
		pstmt.setInt(2, endSal);
		pstmt.setString(3, job);
		ResultSet rs1 = pstmt.executeQuery();
		while (rs1.next()) {
			int empno = rs1.getInt("empno");
			String ename = rs1.getString("ename");
			String jb = rs1.getString("job");
			double sal = rs1.getDouble("sal");
			int deptno = rs1.getInt("deptno");
			System.out.println(empno + "\t " + ename + "\t" + jb + "\t" + sal + "\t" + deptno);
		}
		rs1.close();
		
		System.out.println("------------------- clearParameters() --> setXXX() 변수바인딩 --------------------");
		pstmt.clearParameters();
		pstmt.setInt(1, 0);
		pstmt.setInt(2, 5000);
		pstmt.setString(3, "SALESMAN");
		
		ResultSet rs2 = pstmt.executeQuery();
		while (rs2.next()) {
			int empno = rs2.getInt("empno");
			String ename = rs2.getString("ename");
			String jb = rs2.getString("job");
			double sal = rs2.getDouble("sal");
			int deptno = rs2.getInt("deptno");
			System.out.println(empno + "\t " + ename + "\t" + jb + "\t" + sal + "\t" + deptno);
		}
		rs2.close();
		pstmt.close();
		
		System.out.println("--------------------------------------------------------");
		String insertSQL = "insert into emp(empno, ename, job, mgr, hiredate, sal ,comm, deptno) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt2 = con.prepareStatement(insertSQL);
		pstmt2.setInt(1, 1111);              
        pstmt2.setString(2, "KIM");              
        pstmt2.setString(3, "MANAGER");              
        pstmt2.setInt(4, 7839);
        pstmt2.setDate(5, new Date(System.currentTimeMillis()));      
        pstmt2.setDouble(6, 1000.12);              
        pstmt2.setInt(7, 0);
        pstmt2.setInt(8, 10);
        int rowCount  = pstmt2.executeUpdate();
        System.out.println(rowCount + "행이 삽입됨");
		
		
		ConnectionFactory.releaseConnection(con);
	}

}
