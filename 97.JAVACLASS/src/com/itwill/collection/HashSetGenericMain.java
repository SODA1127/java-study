package com.itwill.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetGenericMain {

	public static void main(String[] args) {
		Account acc1 = new Account("1111", "KIM", 59000, 3.2);
		Account acc2 = new Account("2222", "JIM", 39000, 2.3);
		Account acc3 = new Account("3333", "AIM", 20000, 1.9);
		Account acc4 = new Account("4444", "DIM", 80000, 4.5);
		Account acc5 = new Account("5555", "DIM", 99000, 5.0);
		Account acc6 = new Account("6666", "QIM", 78000, 6.9);
		Account acc7 = new Account("7777", "KIM", 23000, 8.7);
		Account acc8 = new Account("8888", "PIM", 23000, 9.9);
		Account acc9 = new Account("9999", "BIM", 19000, 1.1);
		HashSet accountSet = new HashSet();
		System.out.println("set size:" + accountSet.size());
		System.out.println("-------------add()----------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		accountSet.add(acc6);
		accountSet.add(acc7);
		accountSet.add(acc8);
		accountSet.add(acc9);
		System.out.println("set size:" + accountSet.size());
		System.out.println(">>HashSet:" + accountSet.toString());
		System.out.println("-------------add()중복----------------");
		boolean isAdd=accountSet.add(acc1);
		System.out.println("isAdd:"+isAdd);
		System.out.println("set size:" + accountSet.size());
		System.out.println(">>HashSet:" + accountSet.toString());
		
		System.out.println("-------------remove()----------------");
		boolean isRemove=accountSet.remove(acc9);
		System.out.println("isRemove:"+isRemove);
		System.out.println("set size:" + accountSet.size());
		System.out.println(">>HashSet:" + accountSet.toString());
		System.out.println("-------------contains()----------------");
		if(accountSet.contains(acc1)) {
			acc1.setBalance(999999);
			acc1.print();
		}
		System.out.println("------전체출력(toArray)-------");
		Object[] accountArray=accountSet.toArray();
		for (int i = 0; i < accountArray.length; i++) {
			Account tempAccount=(Account)accountArray[i];
			tempAccount.print();		
		}
		System.out.println("------------Iteration--------------");
		
		Iterator acccountIter = accountSet.iterator();
		System.out.println(acccountIter);
		
		while(acccountIter.hasNext()) {
			Account tempAccount=(Account)acccountIter.next();
			tempAccount.print();
			
		}
		
		
		
	}

}
