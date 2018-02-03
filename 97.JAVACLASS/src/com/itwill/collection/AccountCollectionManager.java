package com.itwill.collection;

import java.util.ArrayList;

/*
 * Account배열객체를 멤버로가지며
 * Account배열객체를 사용해서 업무를 제공하는 클래스
 */
public class AccountCollectionManager {
	public static final int ASC = 0;// 오름차순
	public static final int DES = 1;// 내림차순
	private ArrayList accountList;
	private ArrayList findAccountList;
	private Account findAccount = null;

	public AccountCollectionManager() {
		accountList = new ArrayList();
	}

	/*
	 * Account계좌 전체 출력
	 */
	public void print() {
		System.out.println(accountList.toString());
	}

	/*
	 * 계좌한개추가
	 */
	public void addAccount(Account addAccount) {
		accountList.add(addAccount);
	}

	/*
	 * 계좌번호삭제
	 */
	public void removeAccountByNo(String no) {
		for (int i = 0; i < accountList.size(); i++) {
			findAccount = (Account) accountList.get(i);
			if(findAccount.getNo().equals(no)){
				accountList.remove(i);
				break;
			}
		}
	}

	/*
	 * 계좌번호한개 인자로 받아서 계좌한개 참조변수 반환
	 */
	public Account findByNo(String no) {
		for (int i = 0; i < accountList.size(); i++) {
			findAccount = (Account) accountList.get(i);
			if (findAccount.getNo().equals(no)) {
				break;
			}
		}
		return findAccount;
	}

	/*
	 * 계좌번호, 입금할돈 인자로받아서 입금한후 반환안함
	 */
	public void deposit(String no, int m) {
		Account findAccount = this.findByNo(no);
		findAccount.ipGum(m);
	}

	/*
	 * 계좌번호, 출금할돈 인자로받아서 출금한후 반환안함
	 */
	public void withdraw(String no, int m) {
		Account findAccount = this.findByNo(no);
		findAccount.chulGum(m);

	}

	/*
	 * 계좌잔고인자로 받아서 잔고이상계좌들주소(배열주소) 반환
	 */
	@SuppressWarnings("unchecked")
	public ArrayList findbyBalance(int balance) {
		findAccountList = new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			findAccount = (Account)accountList.get(i);
			if (findAccount.getBalance() > balance) {
				findAccountList.add(accountList.get(i));
			}
		}
		return findAccountList;
	}

	/*
	 * 계좌주이름 인자로받아서 이름계좌들주소(배열주소) 반환
	 */
	@SuppressWarnings("unchecked")
	public ArrayList findByName(String name) {
		findAccountList = new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			findAccount = (Account)accountList.get(i);
			if (findAccount.getOwner().equals(name)) {
				findAccountList.add(accountList.get(i));
			}
		}
		return findAccountList;
	}

	/*
	 * 정렬타입인자로받아서 잔고순으로 내림차순(오름차순)정렬
	 */
	public void sortByBalance(int order) {
		Account temp = null;
		Account[] tempArray = new Account[this.accountList.size()];
		for (int i = 0; i < accountList.size(); i++) {
			tempArray[i] = (Account)accountList.get(i);
		}
		if (order == AccountCollectionManager.ASC) {
			for (int i = 0; i < accountList.size(); i++) {
				for (int j = 0; j < accountList.size(); j++) {
					if(tempArray[i].getBalance() > tempArray[j].getBalance()){
						temp = tempArray[j];
						tempArray[j] = tempArray[i];
						tempArray[i] = temp;
						
					}
				}
			}
			for (int i = 0; i < tempArray.length; i++) {
				accountList.set(i, tempArray[i]);
			}
		}
		else if (order == AccountCollectionManager.DES) {
			for (int i = 0; i < accountList.size(); i++) {
				for (int j = 0; j < accountList.size(); j++) {
					if(tempArray[i].getBalance() < tempArray[j].getBalance()){
						temp = tempArray[j];
						tempArray[j] = tempArray[i];
						tempArray[i] = temp;
						
					}
				}
			}
			for (int i = 0; i < tempArray.length; i++) {
				accountList.set(i, tempArray[i]);
			}
		}
	}

	/*
	 * 매니져야 이름순(String)으로 오름차순(내림차순)정렬해줘
	 */
	public void sortByName(int order) {
		Account temp = null;
		Account[] tempArray = new Account[this.accountList.size()];
		for (int i = 0; i < accountList.size(); i++) {
			tempArray[i] = (Account)accountList.get(i);
		}
		if (order == AccountCollectionManager.ASC) {
			for (int i = 0; i < accountList.size(); i++) {
				for (int j = 0; j < accountList.size(); j++) {
					
					String firstName = tempArray[i].getOwner();
					String secondName = tempArray[j].getOwner();
					if(firstName.compareTo(secondName) < 0){
						temp = tempArray[j];
						tempArray[j] = tempArray[i];
						tempArray[i] = temp;
						
					}
				}
			}
			for (int i = 0; i < tempArray.length; i++) {
				accountList.set(i, tempArray[i]);
			}
		}
		else if (order == AccountCollectionManager.DES) {
			for (int i = 0; i < accountList.size(); i++) {
				for (int j = 0; j < accountList.size(); j++) {
					
					String firstName = tempArray[i].getOwner();
					String secondName = tempArray[j].getOwner();
					if(secondName.compareTo(firstName) < 0){
						temp = tempArray[j];
						tempArray[j] = tempArray[i];
						tempArray[i] = temp;
						
					}
				}
			}
			for (int i = 0; i < tempArray.length; i++) {
				accountList.set(i, tempArray[i]);
			}
		}
	}

}
