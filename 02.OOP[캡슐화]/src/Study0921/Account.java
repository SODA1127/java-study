package Study0921;
/**
 * 
 * @author leekijung
 * @version 0.1
 * @since 2017.09.26
 * 
 * 이 클래스는 계좌 객체의 데이터를 가지고있는 클래스입니다.
 *
 */
public class Account {
	private String no; //계좌번호
	private String owner; //계좌주(이름)
	private int balance; //잔고
	private double iyul; //이율
	
	/**
	 * 계좌객체데이터를 셋팅하는 메소드
	 * 
	 * @param no  - 계좌번호
	 * @param owner - 계좌주
	 * @param balance - 잔고
	 * @param iyul - 이율
	 * 
	 * 
	 */
	
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
	/**
	 * 입금메소드
	 * @param m - 입금할 돈
	 */
	public void ipGum(int m){
		this.balance += m;
	}
	
	
	/*
	 *  출금
	 */
	/**
	 * 출금메소드 - 잔고가 부족할 경우 인출이 되지 않고 잔고부족 메세지를 출력
	 * @param m - 출금할 돈
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
		System.out.println("번호\t|\t이름\t|\t잔고\t\t|\t이율");
		System.out.println("--------------------------------------------------");
	}
	/**
	 * 계좌 정보를 출력
	 */
	public void print(){
		System.out.println(this.no + "\t|\t" +
									 this.owner + "\t|\t" +
									 this.balance +"\t|\t" +
									 this.iyul);
	}
	
	public String getNo() {
		return no;
	}
	public String getOwner() {
		return owner;
	}
	/**
	 * 계좌의 잔고를 반환한다.
	 * @return 잔고
	 */
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