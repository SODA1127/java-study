package com.itwill.dao.emp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.itwill.dao.common.ConnectionFactory;
import com.itwill.dao.guest.Guest;

public class EmpDaoImpl implements EmpDao{
	private int empNo;
	private String ename;
	private String job;
	private int mgr;
	private Date hireDate;
	private double sal;
	private int comm;
	private int deptno;
	
	@Override
	public int insert(Emp emp) throws Exception{
		System.out.println("===========삽입시작===========");		
		String insertSQL = "INSERT INTO EMP VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt =con.prepareStatement(insertSQL);
		pstmt.setInt(1, emp.getEmpNo());
		pstmt.setString(2, emp.getEname());
		pstmt.setString(3, emp.getJob());
		pstmt.setInt(4, emp.getMgr());
		pstmt.setDate(5, emp.getHireDate());
		pstmt.setDouble(6, emp.getSal());
		pstmt.setInt(7, emp.getComm());
		pstmt.setInt(8, emp.getDeptno());
		
		int insertRowCount = pstmt.executeUpdate();
		System.out.println("rowCount : " + insertRowCount);
		System.out.println("===========삽입완료===========");
		pstmt.close();
		return insertRowCount;
	}

	@Override
	public int updateByEmpNo(Emp emp) throws Exception{
		System.out.println("===========업데이트 시작===========");
		String updateSQL = "UPDATE EMP SET ENAME = ?, JOB = ?, MGR = ?, HIREDATE = ?, SAL = ?, COMM = ?, DEPTNO = ? WHERE EMPNO = ?";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(updateSQL);
		pstmt.setString(1, emp.getEname());
		pstmt.setString(2, emp.getJob());
		pstmt.setInt(3, emp.getMgr());
		pstmt.setDate(4, emp.getHireDate());
		pstmt.setDouble(5, emp.getSal());
		pstmt.setInt(6, emp.getComm());
		pstmt.setInt(7, emp.getDeptno());
		pstmt.setInt(8, emp.getEmpNo());
		
		int updateRowCount = pstmt.executeUpdate();
		System.out.println("rowCount : " + updateRowCount);	
		System.out.println("===========업데이트 완료===========");
		pstmt.close();
		return updateRowCount;
	}

	@Override
	public int deleteByEmpNo(int empNo) throws Exception{
		System.out.println("===========" + empNo +"정보 삭제===========");
		String deleteSQL = "DELETE FROM EMP WHERE EMPNO = '" + empNo + "'";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		int deleteRowCount = pstmt.executeUpdate();
		System.out.println("rowCount : " + deleteRowCount);		
		System.out.println("===========삭제완료===========");
		pstmt.close();
		return deleteRowCount;
	}

	@Override
	public Emp findByEmpNo(int findEmpNo) throws Exception{
		System.out.println("===========" + findEmpNo +"번 인적사항 정보 찾기===========");
		String selectAllSQL = "SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO FROM EMP WHERE EMPNO = " + findEmpNo;
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(selectAllSQL);
		ResultSet rs = pstmt.executeQuery();
		boolean isExist = rs.next();
		if(isExist) {
			empNo = rs.getInt(1);
			ename = rs.getString(2);
			job = rs.getString(3);
			mgr = rs.getInt(4);
			hireDate = rs.getDate(5);
			sal = rs.getDouble(6);
			comm = rs.getInt(7);
			deptno = rs.getInt(8);
			System.out.println("===========" + empNo + "번 인적사항 데이터 탐색 ===========");
		}else {
			System.out.println("no data!!");
		}
		
		Emp findEmp = new Emp(empNo, ename, job, mgr, hireDate, sal, comm, deptno);
		pstmt.close();
		return findEmp;
	}

	@Override
	public ArrayList<Emp> findByAll() throws Exception{
		ArrayList<Emp> empList = new ArrayList<Emp>();
		System.out.println("===========모두찾기===========");
		String selectSQL = "SELECT * FROM EMP ORDER BY EMPNO";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			empNo = rs.getInt(1);
			ename = rs.getString(2);
			job = rs.getString(3);
			mgr = rs.getInt(4);
			hireDate = rs.getDate(5);
			sal = rs.getDouble(6);
			comm = rs.getInt(7);
			deptno = rs.getInt(8);
			Emp emp = new Emp(empNo, ename, job, mgr, hireDate, sal, comm, deptno);
			empList.add(emp);
		}
		return empList;
	}
	
	public HashMap findByNoEmpDept(int empno) throws Exception{		
		HashMap<String, Object> rowMap = null;
		String emp_dept_selectSQL = " select empno, ename, job, dname, loc" + 
														" from emp natural join dept where empno = " + empno;
		Connection con = ConnectionFactory.getConection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(emp_dept_selectSQL);
		while(rs.next()) {
			int eno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			rowMap = new HashMap<String, Object>();
			rowMap.put("empno", eno);
			rowMap.put("ename", ename);
			rowMap.put("job", job);
			rowMap.put("dname", dname);
			rowMap.put("loc", loc);
		}
		rs.close();
		stmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowMap;
	}
	
	
	/*
	 * join 연산시 한개의 row를 Map에 담아 반환
	 */
	@Override
	public ArrayList<HashMap<String, Object>> findByAllEmpDept() throws Exception{
		ArrayList<HashMap<String, Object>> rowMapList = new ArrayList<HashMap<String, Object>>();
		
		String emp_dept_selectSQL = " select empno, ename, job, dname, loc" + 
														" from emp natural join dept";
		Connection con = ConnectionFactory.getConection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(emp_dept_selectSQL);
		
		while(rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			HashMap<String, Object> rowMap = new HashMap<String, Object>();
			rowMap.put("empno", empno);
			rowMap.put("ename", ename);
			rowMap.put("job", job);
			rowMap.put("dname", dname);
			rowMap.put("loc", loc);
			rowMapList.add(rowMap);
		}
		rs.close();
		stmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowMapList;
	}
	
}
