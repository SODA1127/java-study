/*String owner = "KIM";
String no = "6666";

if(owner == "KIM"){
	
}
if (no == "6666") {
	
}

if(owner.equals("KIM")){
	
}
if(no.equals("1111")){
	
}*/

public class AccountArrayMain {
	public static void main(String[] args) {
		Account arr = new Account();
		int total = 0;
		Account[]  accArray = {
			new Account(" 1111 ", " KIM ", 45000, 0.2),
			new Account(" 2222 ", " LEE ", 12000,1.2 ),
			new Account(" 3333 ", " PARK ", 60000, 2.2 ),
			new Account(" 4444 ", " CHOI ", 90000, 3.2),
			new Account(" 5555 ", " LIM ", 19000, 5.6),
			new Account(" 6666 ", " SAM ", 82000, 2.4),
			new Account(" 7777 ", " KAM ", 42000, 8.2),
			new Account(" 8888 ", " SUNG ", 21000, 5.1),
			new Account(" 9999 ", " JIN ", 51000, 8.5)
		};
		int totBalance = 0;
		System.out.print("1. 은행 총잔고 : ");
		for (int i = 0; i < accArray.length; i++) {
			totBalance += accArray[i].getBalance();
		}
		System.out.println(totBalance + "원");
		
		System.out.println();
		
		int allCount = 0;
		System.out.print("2. 은행 총 계좌수 : ");
		for (int i = 0; i < accArray.length; i++) {
			allCount ++;
		}
		System.out.println(allCount + "명");
		
		System.out.println();
		
		System.out.println("3. 은행 모든 계좌정보 출력");
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
		
		System.out.println();
		
		System.out.println("4. 계좌잔고 80000원 이상 계좌 정보 출력");
		for (int i = 0; i < accArray.length; i++) {
			if(80000 <= accArray[i].getBalance()){
				accArray[i].print();
			}
		}
		
		System.out.println();
		
		System.out.println("5. 계좌이율 5.0 이상 계좌 정보 출력");
		for (int i = 0; i < accArray.length; i++) {
			if(5 <= accArray[i].getIyul()){
				accArray[i].print();
			}
		}
		
		System.out.println();
		
		System.out.println("6. 모든 계좌 잔고 1000원씩 증가");
		for (int i = 0; i < accArray.length; i++) {
				accArray[i].ipGum(1000);
				accArray[i].print();
		}
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].chulGum(1000);
		}
		
		System.out.println();
		
		System.out.println("7. 계좌 이름 KIM인 계좌 정보 출력");
		String owner = "";
		for (int i = 0; i < accArray.length; i++) {
			owner = accArray[i].getOwner();
			if(owner.equals(" KIM ")){
				accArray[i].print();
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < accArray.length; i++) {
			System.out.println(accArray[i].toString());
		}
		
		String no = "";
		System.out.println("8 - 1. 계좌 번호 6666인 계좌 정보 출력");
		for (int i = 0; i < accArray.length; i++) {
			no = accArray[i].getNo();
			if(no.equals(" 6666 ")){
				accArray[i].print();
			}
		}
		
		System.out.println("8 - 2. 계좌 번호 6666인 계좌 1000원 입금");
		for (int i = 0; i < accArray.length; i++) {
			no = accArray[i].getNo();
			if(no.equals(" 6666 ")){
				accArray[i].ipGum(1000);
				accArray[i].print();
				break;
			}
		}
		
		
		System.out.println("8 - 3. 계좌 번호 6666인 계좌 2000원 출금");
		for (int i = 0; i < accArray.length; i++) {
			no = accArray[i].getNo();
			if(no.equals(" 6666 ")){
				accArray[i].chulGum(2000);
				accArray[i].print();
				break;
			}
		}
		
		System.out.println();
		
		System.out.println("9 - 1. 계좌 잔고순으로 오름차순");
		for (int i = 0; i < accArray.length; i++) {
			Account tempArray=null; 
			for (int j = 0; j < accArray.length - 1; j++) {
				if(accArray[j].getBalance() > accArray[j + 1].getBalance()){
					tempArray = accArray[j + 1];
					accArray[j + 1] = accArray[j];
					accArray[j] = tempArray;
				}
			}
		}
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
		
		System.out.println();
		
		System.out.println("9 - 2. 계좌 잔고순으로 내림차순");
		for (int i = 0; i < accArray.length; i++) {
			Account tempArray=null; 
			for (int j = 0; j < accArray.length - 1; j++) {
				if(accArray[j].getBalance() < accArray[j + 1].getBalance()){
					tempArray = accArray[j + 1];
					accArray[j + 1] = accArray[j];
					accArray[j] = tempArray;
				}
			}
		}
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
	
	}

}
