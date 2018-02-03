package com.itwill.io;

public class Engine {
	//engine 타입
	private String type;
	//engine 배기량
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
