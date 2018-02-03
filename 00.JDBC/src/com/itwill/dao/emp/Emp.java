package com.itwill.dao.emp;

import java.sql.Date;

/*
 이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2)    
 */

public class Emp {
	private int empNo;
	private String ename;
	private String job;
	private int mgr;
	private Date hireDate;
	private double sal;
	private int comm;
	private int deptno;
	
	public Emp(int empNo, String ename, String job, int mgr, Date hireDate, double sal, int comm, int deptno) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public int getMgr() {
		return mgr;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public double getSal() {
		return sal;
	}

	public int getComm() {
		return comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public String toString() {
		return empNo + "\t" + ename + "\t" + job +
				"\t" + mgr + "\t" + hireDate + "\t" + sal +
				"\t" + comm + "\t" + deptno;
	}
	
}
