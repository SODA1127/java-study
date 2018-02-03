package com.itwill.collection;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class ArrayListMain{
	
	public static void main(String[] args){
		ArrayList accountList = new ArrayList();
		Account acc1 = new Account(" 1111 ", " KIM ", 45000, 0.2);
		Account acc2 = new Account(" 2222 ", " LEE ", 12000,1.2 );
		Account acc3 = new Account(" 3333 ", " PARK ", 60000, 2.2 );
		Account acc4 = new Account(" 4444 ", " CHOI ", 90000, 3.2);
		Account acc5 = new Account(" 5555 ", " LIM ", 19000, 5.6);
		Account acc6 = new Account(" 6666 ", " SAM ", 82000, 2.4);
		Account acc7 = new Account(" 7777 ", " KAM ", 42000, 8.2);
		Account acc8 = new Account(" 8888 ", " SUNG ", 21000, 5.1);
		Account acc9 = new Account(" 9999 ", " JIN ", 51000, 8.5);
		
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(acc6);
		accountList.add(acc7);
		accountList.add(acc8);
		accountList.add(acc9);
		
		System.out.println("------------------ add ------------------");
		int size = accountList.size();
		System.out.println("1. List size : " + size);
		
		System.out.println("------------------ set ------------------");
		accountList.set(0, new Account(" 1234 ", " 김경호 ", 2345, 0.2));
		System.out.println(">> List size : " + accountList.size());
		System.out.println(">> List : " + accountList.toString());
		
		System.out.println("------------------ get ------------------");
		accountList.get(0);
		Account getAccount = (Account) accountList.get(0);
		System.out.println(getAccount.toString());
		System.out.println("------------------ get ------------------");
		accountList.remove(accountList.size() - 1);
		System.out.println(">> List size : " + accountList.size());
		System.out.println(">> List : " + accountList.toString());
		
		System.out.println("-------- ArrayList 전체 출력 --------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			tempAccount.print();
		}
		
		System.out.println("-------- 번호 3333 찾기 --------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if(tempAccount.getNo().equals(" 3333 ")){
				tempAccount.print();
				break;
			}
		}
		
		System.out.println("-------- 이름 KIM 찾기 --------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if(tempAccount.getOwner().equals(" KIM ")){
				tempAccount.print();
				break;
			}
		}
		
		System.out.println("-------- 번호 8888 삭제 --------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if(tempAccount.getNo().equals(" 8888 ")){
				accountList.remove(i);
				tempAccount.print();
				break;
			}
		}
		System.out.println(">> List : " + accountList.toString());
		
		System.out.println("-------- [Quiz] 이름 LIM 삭제 --------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if(tempAccount.getOwner().equals(" LIM ")){
				accountList.remove(i);
				tempAccount.print();
				break;
			}
		}
		System.out.println(">> List : " + accountList.toString());
		
		System.out.println("---------------------------------------");
		Object[] accountArray =  accountList.toArray();
		for (int i = 0; i < accountArray.length; i++) {
			Account tempAccount = (Account)accountArray[i];
			System.out.println(tempAccount);
		}
		
		/*System.out.println("------------------- clear() --> isEmpty() -------------------");
		accountList.clear();
		if(accountList.isEmpty()){
			System.out.println(accountList);
		}*/
		
		System.out.println("------------------- Iteration -------------------");
		Iterator accountIter = accountList.iterator();
		System.out.println(accountIter);
		
		while(accountIter.hasNext()){
			Account tempAccount =(Account) accountIter.next();
			tempAccount.print();
		}
		
		
		
		
	}
}
