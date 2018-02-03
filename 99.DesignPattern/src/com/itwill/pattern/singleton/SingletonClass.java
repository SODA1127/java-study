package com.itwill.pattern.singleton;

public class SingletonClass {
	/*
	 * 3. 자신의 객체를 가질 static 변수 선언
	 */
	private static SingletonClass _instance;
	
	
	/*
	 * 1. 생성자를 외부에서 호출하지 못하게 차단
	 */
	private SingletonClass() {
		System.out.println("SingletonClass() 생성자 : " + this);
	}
	
	/*
	 * 2. 외부에서 호출되는 static 메소드에서 객체를 생성한 후에 반환해준다. 
	 */
	public static SingletonClass getInstance() {
		if(_instance == null) {
			_instance = new SingletonClass();
		}
		return _instance;
	}
	
	public void getConnection() {
		System.out.println(this + ".getConnection()");
	}
	
	public void releaseConnection() {
		System.out.println(this + ".releaseConnection()");
	}
	
}
