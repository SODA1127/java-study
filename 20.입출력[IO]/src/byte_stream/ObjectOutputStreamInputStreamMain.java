package byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamInputStreamMain {

	public static void main(String[] args) throws Exception{
		
		Account account1 = new Account("1111", "KIM",58000, 2.3);
		Account account2 = new Account("2222", "JIM",98000, 1.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("accounts.ser"));
		oos.writeObject(account1);
		System.out.println("-------- 1. ObjectOutputStream Account --> write");
		oos.writeObject(account2);
		System.out.println("-------- 2. ObjectOutputStream Account --> write");
		
		Account[]  accArray = {
				new Account("1111", " KIM ", 45000, 0.2),
				new Account("2222", " LEE ", 12000,1.2 ),
				new Account("3333", " PARK ", 60000, 2.2 ), //2
				new Account("4444", " CHOI ", 90000, 3.2), //3
				new Account("5555", " KIM ", 19000, 5.6),
				new Account("6666", " SAM ", 82000, 2.4), //5
				new Account("7777", " KAM ", 42000, 8.2),
				new Account("8888", " SUNG ", 21000, 5.1),
				new Account("9999", " JIN ", 51000, 8.5) //8
		};
		oos.writeObject(accArray);
		System.out.println("-------- 3. ObjectOutputStream Account --> write");
		
		ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("account.ser"));
		System.out.println("------------ 1. read Account ------------ ");
		Account readAccount1 = (Account)ooi.readObject();
		readAccount1.print();
		System.out.println("------------ 2. read Account ------------ ");
		Account readAccount2 = (Account)ooi.readObject();
		readAccount2.print();
		System.out.println("------------ 3. read Account ------------ ");
		Account readAccount3 = (Account)ooi.readObject();
		readAccount3.print();
		
	}

}
