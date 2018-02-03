package com.itwill.collection;

public class GenericMain {

	public static void main(String[] args) {
		System.out.println("--------------- no Generic --------------");
		NoGeneric ng = new NoGeneric();
		ng.setMember(new Account("111", "KIM", 23000, 3.4));
		Object getMember = ng.getMember();
		Account getAccount = (Account)getMember;
		getAccount.print();
		
		ng.setMember(new Car("1234", 12));
		Car getCar = (Car)ng.getMember();
		getCar.print();
		
		System.out.println("-------------- Generic --------------");
		Generic<Account, Car> g = new Generic<Account, Car>();
		g.setMember(new Account("2222", "HIM", 53000, 2.5));
		Account getAccount2 = g.getMember();
		getAccount2.print();
		
		g.setMember1(new Car("4567", 12));
		Car getCar2 = g.getMember1();
		getCar2.print();
		
		
		
	}

}
