package com.itwill.dao.emp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import com.itwill.dao.guest.Guest;

public class EmpDaoTestMain {

	public static void main(String[] args) throws Exception{
		EmpDao empDao = new EmpDaoImpl();
		
		/*private int empNo;
		private String ename;
		private String job;
		private int mgr;
		private Date hireDate;
		private double comm;
		private int deptno;*/
		
		// insert
		empDao.insert(new Emp(1000, "이기정", "MANAGER", 7999, new Date(2017, 11, 20), 2000.12, 200, 20));
		
		// select(join)
		ArrayList<HashMap<String, Object>> empDeptList =
				empDao.findByAllEmpDept();
		System.out.println("--------------------------- findByAllEmpDept() ---------------------------");
		for (int i = 0; i < empDeptList.	size(); i++) {
			HashMap<String, Object> rowMap = empDeptList.get(i);
			System.out.println(rowMap.get("empno") + "\t" 
											+ rowMap.get("ename") + "\t" 
											+ rowMap.get("job") + "\t"
											+ rowMap.get("dname") + "\t"
											+ rowMap.get("loc"));
		}
		System.out.println("--------------------------- findByNoEmpDept() ---------------------------");
		HashMap empDeptRowMap = empDao.findByNoEmpDept(7369);
		System.out.println(empDeptRowMap);
		

		//select
		ArrayList<Emp> empList = empDao.findByAll();
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}
		Emp findEmp = empDao.findByEmpNo(1000);
		System.out.println(findEmp);
		
		empDao.updateByEmpNo(new Emp(2000, "이기정", "MANAGER", 7999, new Date(2017, 11, 20), 2000.12, 200, 20));
		empDao.deleteByEmpNo(2000);
	}
}
