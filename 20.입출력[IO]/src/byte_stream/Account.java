package byte_stream;

import java.io.Serializable;

public class Account implements Serializable{
	private String no; //계좌번호
	private String owner; //계좌주(이름)
	private int balance; //잔고
	private double iyul; //이율
	
	public Account() {
		
	}
	
	public Account(String no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	public void setAccountData(String no,
												String owner,
												int balance,
												double iyul){
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 *  입금
	 */
	public void ipGum(int m){
		this.balance += m;
	}
	/*
	 *  출금
	 */
	public void chulGum(int m){
		this.balance -= m;
		if(this.balance < 0){
			this.balance += m;
			System.out.println(this.owner + "님의 출금이 취소되었습니다. (잔고부족)");
			return;
		}
	}
	
	public static void headPrint(){
		System.out.println("--------------------------------------------------");
		System.out.println("번호 \t|\t 이름 \t|\t 잔고 \t|\t이율");
		System.out.println("--------------------------------------------------");
	}
	public void print(){
		System.out.println(this.no + " \t | \t " +
									this.owner + " \t | \t " +
									this.balance +" \t | \t " +
									this.iyul);
	}
	
	public String getNo() {
		return no;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}

	
}