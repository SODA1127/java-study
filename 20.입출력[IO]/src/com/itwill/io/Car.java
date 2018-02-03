package com.itwill.io;

public class Car {
	//������ȣ
	private int no;
	//������
	private String model;
	//����
	private Engine engine;
	//������
	private int wheelNumber; 
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(int no, String model, Engine engine, int wheelNumber) {
		super();
		this.no = no;
		this.model = model;
		this.engine = engine;
		this.wheelNumber = wheelNumber;
	}

	public void print() {
		System.out.print(no+"\t"+model+"\t"+wheelNumber+"\t");
		this.engine.print();
	}
	
	//getter setter
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	
	public int getNo() {
		return no;
	}

	public String getModel() {
		return model;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	
}
