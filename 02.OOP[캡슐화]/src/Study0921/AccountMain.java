package Study0921;

public class AccountMain {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setNo("1111");
		acc1.setOwner("KIM");
		acc1.setBalance(10000);
		acc1.setIyul(3.2);
		
		Account acc2 = new Account();
		acc2.setAccountData("2222", "LEE" , 78000, 5.7);
		
		
		//입금 5000원
		acc1.ipGum(5000);
		acc2.ipGum(5000);
		
		acc1.headPrint();
		acc1.print();
		acc2.print();
		System.out.println();
		
		//출금
		Account.headPrint();
		acc1.chulGum(70000);
		acc2.chulGum(300);
		
		acc1.headPrint();
		acc1.print();
		acc2.print();
	}
}
