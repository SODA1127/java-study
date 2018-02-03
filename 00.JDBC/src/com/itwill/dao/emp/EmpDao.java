package com.itwill.dao.emp;

import java.util.ArrayList;
import java.util.HashMap;

public interface EmpDao {
	public int insert(Emp emp) throws Exception;
	public int updateByEmpNo(Emp emp) throws Exception;
	public int deleteByEmpNo(int empNo) throws Exception;
	public Emp findByEmpNo(int empNo) throws Exception;
	public ArrayList<Emp> findByAll() throws Exception;
	
	/*
	 * 사원(부서정보)를 반환
	 */
	public ArrayList<HashMap<String, Object>> findByAllEmpDept() throws Exception;
	
	/*
	 * 번호로 검색 후 사원과 부서정보 반환
	 */
	public HashMap findByNoEmpDept(int empno) throws Exception;
}

