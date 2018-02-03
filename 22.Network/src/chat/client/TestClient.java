package chat.client;

import java.net.Socket;

public class TestClient {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("192.168.12.31", 1234);
		//Socket socket = new Socket("1.1.1.21", 1234);
		System.out.println(socket);
	}
}
