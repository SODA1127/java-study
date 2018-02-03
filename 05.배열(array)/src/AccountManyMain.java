public class AccountManyMain {

	public static void main(String[] args) {
		AccountMany aa;
		aa = new AccountMany();
		
		aa.acc0 = new Account("1111", "KIM", 45000, 0.2);
		aa.acc1 = new Account("2222", "LEE", 12000,1.2 );
		aa.acc2 = new Account("3333", "PARK", 60000,2.2 );
		aa.acc3 = new Account("4444", "CHOI", 9000, 3.2);
		aa.acc4 = new Account("5555", "SIM", 19000, 5.6);
		
		aa.acc0.print();
		aa.acc1.print();
		aa.acc2.print();
		aa.acc3.print();
		aa.acc4.print();
	}

}
