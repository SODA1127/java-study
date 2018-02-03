package com.itwill.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		Account acc1 = new Account(" 1111 ", " KIM ", 45000, 0.2);
		Account acc2 = new Account(" 2222 ", " LEE ", 12000,1.2 );
		Account acc3 = new Account(" 3333 ", " PARK ", 60000, 2.2 );
		Account acc4 = new Account(" 4444 ", " CHOI ", 90000, 3.2);
		Account acc5 = new Account(" 5555 ", " LIM ", 19000, 5.6);
		Account acc6 = new Account(" 6666 ", " SAM ", 82000, 2.4);
		Account acc7 = new Account(" 7777 ", " KAM ", 42000, 8.2);
		Account acc8 = new Account(" 8888 ", " SUNG ", 21000, 5.1);
		Account acc9 = new Account(" 9999 ", " JIN ", 51000, 8.5);
		//Account acc10 = acc1;
		HashSet accountSet = new HashSet();
		
		System.out.println("set size : " + accountSet.size());
		
		System.out.println("set size : " + accountSet.size());
		System.out.println("hassh set : " + accountSet);
		System.out.println("------------------- add() -------------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		accountSet.add(acc6);
		accountSet.add(acc7);
		accountSet.add(acc8);
		accountSet.add(acc9);
		//accountSet.add(acc10);
		
		System.out.println("------------------- add() 중복 -------------------");
		boolean isAdd = accountSet.add(acc1);
		System.out.println("isAdd : " + isAdd);
		System.out.println("set size : " + accountSet.size());
		System.out.println("hash set : " + accountSet);
		
		System.out.println("------------------- remove() -------------------");
		boolean isRemove = accountSet.remove(acc9);
		System.out.println(isRemove);
		System.out.println("set size : " + accountSet.size());
		System.out.println("hash set : " + accountSet);

		System.out.println("------------------- contains() -------------------");
		if(accountSet.contains(acc1)){
			acc1.setBalance(999999);
			acc1.print();
		}
		
		System.out.println("------------------- contains() -------------------");
		Object[] accountArray = accountSet.toArray();
		for (int i = 0; i < accountArray.length; i++) {
			Account tempAccount =(Account) accountArray[i];
			tempAccount.print();
		}
		
		System.out.println("------------------- Iteration -------------------");
		Iterator accountIter = accountSet.iterator();
		System.out.println(accountIter);
		
		while(accountIter.hasNext()){ //순서는 없음 (보따리에서 랜덤으로 뽑음) - 정렬은 없음
			Account tempAccount =(Account) accountIter.next();
			tempAccount.print();
		}
		
		/*if(acc1 == acc10){
			accountSet.remove(acc1);
		}*/
		
		/*if(acc1.equals(acc10)){
			accountSet.remove(acc1);
		}
		System.out.println("hassh set : " + accountSet);*/
	}

}
