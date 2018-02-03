
public class ReferenceTypeArrayMain {
	public static void main(String[] args) {
/*		int i;
		int[] ia = new int[5];*/
		
		Account account;
		account = new Account();
		
		Account[] accountArray;
		accountArray = new Account[5];
		
		accountArray[0] = new Account("1111", "KIM", 89000, 3.2) ; 
		accountArray[1] = new Account("2222", "LEE", 34000, 4.2) ; 
		accountArray[2] = new Account("3333", "PARK", 12000, 2.2) ; 
		accountArray[3] = new Account("4444", "CHOI", 67000, 3.8) ; 
		accountArray[4] = new Account("5555", "MIN", 86000, .2) ; 
		
		account.headPrint();
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}
		
		/*
		 * 모든 계좌잔고 50원증가
		 */
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].ipGum(50);
		}
		
		account.headPrint();
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}
		
		System.out.println();
		System.out.println(">> 레퍼런스타입 배열객체 초기화");
		Account[] aa ={
					new Account("1111", "김경호", 89000, 3.2),
					new Account("2222", "김태희", 56000, 2.2)
		};
		for (int i = 0; i < aa.length; i++) {
			aa[i].print();
		}
	}
}
