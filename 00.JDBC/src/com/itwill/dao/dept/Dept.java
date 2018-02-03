package com.itwill.dao.dept;

public class Dept {
	private int deptNo;
	private String dname;
	private String loc;
	
	public Dept(int deptNo, String dname, String loc) {
		super();
		this.deptNo = deptNo;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}
