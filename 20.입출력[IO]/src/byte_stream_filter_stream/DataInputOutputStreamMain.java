package byte_stream_filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamMain {

	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("dataOut.dat"));
		System.out.println("------------------------------ DataOutputStream write ------------------------------");
		dos.writeInt(2147483647);
		dos.writeDouble(1.14159);
		dos.writeBoolean(true);
		dos.writeChar('A');
		dos.writeUTF("오늘은 필터스트림을 공부해요");
		System.out.println("------------------------------ DataInputStream read ------------------------------");
		DataInputStream dis = 
				new DataInputStream(new FileInputStream("dataOut.dat"));
		/*int readByte1 = dis.read();
		int readByte2 = dis.read();
		int readByte3= dis.read();
		int readByte4 = dis.read();*/
		
		int readInt = dis.readInt();
		System.out.println("Int : " + readInt);
		System.out.println("double : " + dis.readDouble());
		System.out.println("boolean : " + dis.readBoolean());
		System.out.println("char : " + dis.readChar());
		System.out.println("String : " + dis.readUTF());
		
		System.out.println("------------------------------ Student 객체데이터 저장 ------------------------------");
		Student st1 = new Student(1, "김경호", "경기도민");
		
		DataOutputStream studentDos = new DataOutputStream(new FileOutputStream("student.dat"));
		studentDos.writeInt(st1.getNo());
		studentDos.writeUTF(st1.getName());
		studentDos.writeUTF(st1.getAddress());		
		studentDos.close();
		System.out.println(">> write student member data");
		System.out.println("------------------------------ Student 객체데이터 복 ------------------------------");
		
		DataInputStream studentDis = 
				new DataInputStream(
				new FileInputStream("student.dat"));
		int readNo = studentDis.readInt();
		String readName = studentDis.readUTF();
		String readAddress = studentDis.readUTF();
		
		Student readStudent = new Student(readNo, readName, readAddress);
		
		System.out.println(">> read student member data");
		System.out.println(readStudent.getNo());
		System.out.println(readStudent.getName());
		System.out.println(readStudent.getName());
		
	}

}
