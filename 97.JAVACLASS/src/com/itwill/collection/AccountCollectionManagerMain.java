package com.itwill.collection;

import java.util.ArrayList;

public class AccountCollectionManagerMain {

	public static void main(String[] args) {
		AccountCollectionManager accountManager = new AccountCollectionManager();
		Account acc1 = new Account(" 1111 ", " KIM ", 45000, 0.2);
		Account acc2 = new Account(" 2222 ", " LEE ", 12000, 1.2);
		Account acc3 = new Account(" 3333 ", " PARK ", 50000, 2.2);
		Account acc4 = new Account(" 4444 ", " CHOI ", 90000, 3.2);
		Account acc5 = new Account(" 5555 ", " KIM ", 19000, 5.6);
		Account acc6 = new Account(" 6666 ", " SAM ", 82000, 2.4);
		Account acc7 = new Account(" 7777 ", " KAM ", 42000, 8.2);
		Account acc8 = new Account(" 8888 ", " SUNG ", 21000, 5.1);
		Account acc9 = new Account(" 9999 ", " JIN ", 51000, 8.5);

		accountManager.addAccount(acc1);
		accountManager.addAccount(acc2);
		accountManager.addAccount(acc3);
		accountManager.addAccount(acc4);
		accountManager.addAccount(acc5);
		accountManager.addAccount(acc6);
		accountManager.addAccount(acc7);
		accountManager.addAccount(acc8);
		accountManager.addAccount(acc9);
		
		accountManager.print();

		/*
		 * 매니져야 계좌번호 인자로줄께 계좌한개 객체주소반환해줘
		 */
		Account findAccount = accountManager.findByNo(" 1111 ");
		System.out.println(findAccount);
		findAccount.print();
		findAccount = accountManager.findByNo(" 6666 ");
		findAccount.print();

		/*
		 * 매니져야 계좌번호, 입금할돈 인자로줄께 입금해줘 반환하지마
		 */
		accountManager.deposit(" 9999 ", 3000);

		/*
		 * 매니져야 계좌번호, 출금할돈 인자로줄께 출금해줘 반환하지마
		 */
		accountManager.withdraw(" 1111 ", 50000);

		/*
		 * 매니져야 계좌잔고 줄께 잔고이상계좌들주소(배열주소) 반환
		 */
		System.out.println("------------findbyBalance(50000)------------");
		ArrayList findAccounts = accountManager.findbyBalance(50000);
		for (int i = 0; i < findAccounts.size(); i++) {
			System.out.println(findAccounts);
		}
		//findAccounts

		/*
		 * 매니져야 계좌주이름 줄께 이름계좌들주소(배열주소) 반환
		 */
		System.out.println("------------findbyName(KIM)------------");
		findAccounts = accountManager.findByName(" KIM ");
		for (int i = 0; i < findAccounts.size(); i++) {
			System.out.println(findAccounts);
		}
		
		/*
		 * 매니져야 이름순으로 오름차순 정렬해줘
		 */
		System.out.println("------------sortByName---------------");
		accountManager.sortByName(AccountCollectionManager.ASC);
		accountManager.print();
		accountManager.sortByName(AccountCollectionManager.DES);
		//accountManager.print();
		/*
		 * 
		 * 매니져야 정렬타입인자로줄께 번호순(String)으로 내림차순(오름차순)정렬해줘
		 */
		System.out.println("------------findbyName(KIM)------------");

		/*
		 * 매니져야 정렬타입인자로줄께 잔고순으로 내림차순(오름차순)정렬해줘
		 */
		accountManager.sortByBalance(AccountCollectionManager.ASC);
		accountManager.print();
		accountManager.sortByBalance(AccountCollectionManager.DES);
		accountManager.print();

		System.out.println("----------------------------------");
		accountManager.removeAccountByNo(" 9999 ");
		Account.headPrint();
		accountManager.print();
	}

}
