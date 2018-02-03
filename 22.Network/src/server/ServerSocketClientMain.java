package server;

import java.net.Socket;

public class ServerSocketClientMain {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("1.1.1.21", 3333);
		//Socket socket = new Socket("192.168.12.36", 3333);
	}

}
