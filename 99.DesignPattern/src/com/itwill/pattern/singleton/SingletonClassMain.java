package com.itwill.pattern.singleton;

public class SingletonClassMain {
	public static void main(String[] args) {
		//SingletonClass singletonClass = new SingletonClass();
		SingletonClass singletonClass1 = SingletonClass.getInstance();
		System.out.println(singletonClass1);
		SingletonClass singletonClass2 = SingletonClass.getInstance();
		System.out.println(singletonClass2);
		SingletonClass singletonClass3 = SingletonClass.getInstance();
		System.out.println(singletonClass3);
		SingletonClass singletonClass4 = SingletonClass.getInstance();
		System.out.println(singletonClass4);
		SingletonClass singletonClass5 = SingletonClass.getInstance();
		System.out.println(singletonClass5);
		
		singletonClass1.getConnection();
		singletonClass1.releaseConnection();
		singletonClass2.getConnection();
		singletonClass2.releaseConnection();
	}
}
