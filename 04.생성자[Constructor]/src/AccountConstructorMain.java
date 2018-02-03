public class AccountConstructorMain {
		public static void main(String[] args) {
			Account acc1 = new Account();
			acc1.setAccountData("1111", "KIM", 45000, 3.4);
			Account acc2 = new Account("2222", "LEE", 98000, 2.3);
			Account acc3 = new Account("3333", "PARK", 43000, 4.3);
			
			acc1.ipGum(1000);
			acc2.ipGum(1000);
			acc3.ipGum(1000);
			
			acc1.headPrint();
			acc1.print();
			acc2.print();
			acc3.print();

		}
}
