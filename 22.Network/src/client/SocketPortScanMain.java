package client;

import java.net.Socket;

public class SocketPortScanMain {

	public static void main(String[] args) {
		for (int i = 79; i < 82; i++) {
			Socket socket;
			try {
				socket = new Socket("www.daum.net", i);
				System.out.println(i + "번 socket 생성 : " + socket);
				socket.close();
			} catch (Exception e) {
				System.out.println(i + "번 socket 생성실패 : " + e.getMessage());
			}
			
		}
	}

}
