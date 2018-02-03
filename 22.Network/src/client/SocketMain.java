package client;

import java.net.InetAddress;
import java.net.Socket;

public class SocketMain {
	public static void main(String[] args) throws Exception{
		/*
		 * socket 연결
		 */
		Socket socket = new Socket("43.250.152.30", 80);
		
		InetAddress remoteAddr = socket.getInetAddress();
		int remotePort = socket.getPort();
		InetAddress localAddr = socket.getLocalAddress();
		int localPort = socket.getLocalPort();
		
		System.out.println("remote Addr : " + remoteAddr);
		System.out.println("remote Port : " + remotePort);
		System.out.println("local Addr : " + localAddr);
		System.out.println("local Port : " + localPort);
		
		
	}
}
