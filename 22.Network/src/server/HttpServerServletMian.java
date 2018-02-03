package server;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerServletMian {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(8080);
		while (true) {
			System.out.println("HttpServer 80에서 클라이언트 소켓 요청대기");
			Socket socket = serverSocket.accept();
			OutputStream out = socket.getOutputStream();
			/*
			 * 서버에서 자바객체를 사용해서 클라이언트에 데이터전송
			 */
			//HelloServlet helloServlet = new HelloServlet();
			//helloServlet.service(out);
			
			AddressListServlet addressListServlet = new AddressListServlet();
			addressListServlet.service(out);
			
			//WelcomeServlet welcomeServlet = new WelcomeServlet();
			//welcomeServlet.service();
			
			
			out.flush();
			out.close();
			socket.close();
		}
		
	}
}
