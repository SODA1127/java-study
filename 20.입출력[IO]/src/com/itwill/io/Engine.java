package com.itwill.io;

public class Engine {
	//engine Ÿ��
	private String type;
	//engine ��ⷮ
	private int cc;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	public void print() {
		System.out.println(type+"\t"+cc);
	}
	
	public String getType() {
		return type;
	}

	public int getCc() {
		return cc;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
	
}
