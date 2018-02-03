

public class AccountManagerMain {

	public static void main(String[] args) {
		AccountManager accountManager = new AccountManager();	
		/*
		 * 매니저야. 계좌번호 인자로 줄게(set). 계좌한개 객체주소 반환해줘
		 */
		Account findAccount = accountManager.findByNo(" 1111 ");
		findAccount.print();
		findAccount = accountManager.findByNo(" 6666 ");
		findAccount.print();
		
		
		/*
		 * 매니저야. 계좌번호, 입금할 돈 인자로 줄게 입금해줘 반환 하지마
		 */
		
		accountManager.deposit(" 9999 ", 3000);
		
		/*
		 * 매니저야. 계좌번호, 입금할 돈 인자로 줄게 출금해줘 반환 하지마
		 */
		accountManager.withdraw(" 1111 ", 5000);
		
		Account.headPrint();
		findAccount = accountManager.findByNo(" 1111 ");
		findAccount.print();
		findAccount = accountManager.findByNo(" 9999 ");
		findAccount.print();
		
		
		
		/*
		 * 매니저야 계좌잔고 줄게 50000원 잔고이상 계좌들 주소(배열) 반환
		 * 매니저야 계좌주 이름 줄게 계좌들 주소(배열) 반환
		 */
		
		System.out.println();
		System.out.println("50000원 잔고이상 계좌리스트");
		Account.headPrint();
		Account[] aa = accountManager.findByBalance(50000);
		//Account[] aa = accountManager.getAccArray();
		for (int i = 0; i < aa.length; i++) {
				//System.out.println(aa[i]);
				aa[i].print();
		}
		
		
		
		/*
		 * 매니저야 정렬타입인자로 줄게 잔고순으로 내림차순(오름차순) 정렬해줘
		 * 매니저야 번호순으로 오름차순 정렬해줘
		 */
		
		
		
			
	}

}
