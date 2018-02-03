package server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {
	public static void main(String[] args) throws Exception{
		/*
		 * public Socket accept() throws IOException
		 * 
		 * Listens for a connection to be made to this socket and accepts it.
		 * The method blocks until a connection is made.
		 * A new Socket s is created and, if there is a security manager,
		 * the security manager's checkAccept method is called with s.getInetAddress().getHostAddress()
		 * and s.getPort() as its arguments to ensure the operation is allowed.
		 * This could result in a SecurityException.
		 */
		
		/*
		 * ServerSocket Class
		 * 		- 클라이언트의 연결요청 신호를 받아서 소켓 생성하는 클래스
		 * 		- 서버 컴퓨터의 포트 (0 ~ 65535) 중의 하나를 사용하여
		 * 			ServerSocket 객체를 생성
		 */
		while(true){
			ServerSocket serverSocket = new ServerSocket(3333);
			System.out.println("0.3333번 포트를 열고 클라이언트의 소켓 연결 요청을 무한대기한다(쓰레드).");
			Socket socket = serverSocket.accept();
			System.out.println("1.3333번 포트를 열고 클라이언트의 소켓 연결 요청 처리 후 소켓 반환");
			System.out.println("2. 클라이언트와 연결된 서버쪽 소켓 : " + socket);
			
		}
	}
}