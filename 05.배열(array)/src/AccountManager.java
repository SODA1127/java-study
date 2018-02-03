
/*
 * Account 배열 객체를 멤버로 가지며
 * Account 배열 객체를 사용해서 업무를 제공하는 클래스
 */

public class AccountManager {
	public static final int ASC = 0; // 오름차순
	public static final int DES = 1; // 내림차순
	
	
	private Account[]  accArray = {
			new Account(" 1111 ", " KIM ", 45000, 0.2),
			new Account(" 2222 ", " LEE ", 12000,1.2 ),
			new Account(" 3333 ", " PARK ", 60000, 2.2 ), //2
			new Account(" 4444 ", " CHOI ", 90000, 3.2), //3
			new Account(" 5555 ", " KIM ", 19000, 5.6),
			new Account(" 6666 ", " SAM ", 82000, 2.4), //5
			new Account(" 7777 ", " KAM ", 42000, 8.2),
			new Account(" 8888 ", " SUNG ", 21000, 5.1),
			new Account(" 9999 ", " JIN ", 51000, 8.5) //8
		};
	
	/*
	 * 계좌번호 한개 받아 계좌한개 참조변수 반환
	 */
	public Account findByNo(String no){
		Account findAccount = null;
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getNo().equals(no)){
				findAccount = accArray[i];
				
				break;
			}
		}
		return findAccount;
	}
	
	
	/* 
	 * 계좌잔고 인자로 받아서 잔고이상 계좌들 주소 반환
	 */
	public Account[] findByBalance(int balance){
		int b = 0;
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getBalance() >= balance){
				b++;
			}
		}
		Account[] findAccount = new Account[b];
		b = 0;
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getBalance() >= balance){
				findAccount[b] = accArray[i];
				b++;
			}
		}
		return findAccount;
	}
	
	/*
	 * 계좌주 이름 인자로 받아 계좌리스트 반환
	 */
	public Account[] findNyName(String name){
		int b = 0;
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getOwner().equals(name)){
				b++;
			}
		}
		
		Account[] findAccount = new Account[b];
		b = 0;
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getOwner().equals(name)){
				findAccount[b] = accArray[i];
				b++;
			}
		}
		return findAccount;
	}
	
	/*
	 * 계좌번호, 입금할 돈 인자로받아서 입금한 후 반환안함
	 */
	public void deposit(String no, int m){
		Account ipGumAccount = null;
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getNo().equals(no)){
				accArray[i].ipGum(m);
				ipGumAccount = accArray[i];
				break;
			}
		}
	}
	
	/*
	 * 계좌번호, 출금할 돈 인자로받아서 출금한 후 반환안함
	 */
	public void withdraw(String no, int m){
		Account chulGumAccount = null;
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getNo().equals(no)){
				accArray[i].chulGum(m);
				chulGumAccount = accArray[i];
				break;
			}
		}
	}

	
	public Account[] getAccArray() {
		for (int i = 0; i < accArray.length; i++) {
			if(accArray[i].getBalance() >= 50000){
				System.out.println(accArray[i]);
			}
		}
		return accArray;
	}


	public void sortByBalance(int order) {
		if(order == AccountManager.ASC){
			
		}
		else if(order == AccountManager.DES){
			
		}
	}
	
	public void sortByNo(int order) {
		if(order == AccountManager.ASC){
			
		}
		else if(order == AccountManager.DES){
			
		}
	}
	
	/*
	 * 정렬타입 인자로 받아 잔고순으로 내림차순(오름차순) 정렬
	 * 정렬타입 인자로 받아 번호순으로 내림차순(오름차순) 정렬
	 */
	
	
	
		
}
