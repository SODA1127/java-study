package client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class DayTimeClientMain {
	public static void main(String[] args) throws Exception{
		System.out.println("1. DayTimeClientMain --> 소켓 생성 요청");
		Socket socket = new Socket("1.1.1.21", 8000);
		//Socket socket = new Socket("192.168.12.31", 8000);
		System.out.println("2. 소켓 생성 : " + socket);
		System.out.println("3. 소켓으로부터  InputStream 객체 얻기");
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("4. InputStream을 사용하여 데이터 읽기");
		String readLine = br.readLine();
		System.out.println("client가 읽은 데이터 : " + readLine);
		
		
	}
}
